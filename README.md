# codewalker-proto

> ⚠️ **This repo is generated.** It is automatically synced from [`snootbeestci/codewalker`](https://github.com/snootbeestci/codewalker) on every tagged release. **Do not edit files here directly** — proto changes must be made in the backend repo. Edits made here will be overwritten by the next release.

Protocol Buffer definitions for the [Codewalker](https://github.com/snootbeestci/codewalker) gRPC API, plus pre-generated Kotlin/Java stubs published via JitPack.

## Usage

Add the JitPack repository and declare the dependency:

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.snootbeestci:codewalker-proto:vX.Y.Z")
}
```

Versions match the backend repo one-to-one. The latest tag here always corresponds to the latest tagged release of `codewalker`.

## How the sync works

When a `v*` tag is pushed to `codewalker`, the `Release` workflow there:

1. Publishes Maven artifacts to GitHub Packages.
2. Builds and pushes the Docker image to GHCR.
3. **Syncs this repo** — copies `proto/codewalker/v1/codewalker.proto` and the regenerated `gen/kotlin/` tree from the backend into this repo, commits to `main` if anything changed, then tags this repo with the same `vX.Y.Z`.

The tag is pushed unconditionally so that proto-repo versions track backend versions even when the proto contract is unchanged. JitPack picks up the tag and serves the artifact.

If any earlier step in the backend release fails, this repo is not touched.

## Making a change to the proto

1. Edit `proto/codewalker/v1/codewalker.proto` in [`snootbeestci/codewalker`](https://github.com/snootbeestci/codewalker).
2. Run `make proto` and commit the regenerated Go stubs.
3. Open a PR there. Once merged and tagged, this repo updates automatically.

## Maintenance

### Rotating the `PROTO_REPO_TOKEN` PAT

The sync workflow authenticates with a fine-grained personal access token stored as the `PROTO_REPO_TOKEN` secret in the `release` environment of `snootbeestci/codewalker`. When it expires (or before it does):

1. Generate a new fine-grained PAT at https://github.com/settings/tokens?type=beta
   - **Resource owner:** `snootbeestci`
   - **Repository access:** *Only select repositories* → `snootbeestci/codewalker-proto`
   - **Permissions:**
     - `Contents`: Read and write
     - `Metadata`: Read-only
   - **Expiry:** pick a date and add a calendar reminder a week before
   - **Name:** `codewalker-proto sync (PROTO_REPO_TOKEN)` (or whatever helps you find it later)
2. In `snootbeestci/codewalker` → *Settings* → *Environments* → `release`, update the `PROTO_REPO_TOKEN` secret with the new token value.
3. Tag a no-op release — or wait for the next real one — and confirm the `sync-proto-repo` job succeeds.
4. Delete the old PAT from your GitHub account.

### Symptoms of an expired or revoked token

The `sync-proto-repo` job in the backend's `Release` workflow fails at the **Checkout codewalker-proto** step with a `401`/`403` from GitHub. Until rotated, this repo stays at whatever the last successful release synced — backend tags will exist with no matching tag here, and JitPack lookups for the new version will 404.

## License

Same as [`codewalker`](https://github.com/snootbeestci/codewalker).
