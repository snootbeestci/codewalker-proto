# codewalker-proto

Protocol Buffer definitions for the [Codewalker](https://github.com/snootbeestci/codewalker) gRPC API.

## Usage

Add the JitPack repository and declare the dependency:

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.snootbeestci:codewalker-proto:TAG")
}
```

Replace `TAG` with a release tag from this repo, e.g. `v0.1.0`.

## Versioning

This repo is versioned independently from the backend. Tags on this repo
represent the proto contract version:
- **Major** — breaking proto changes
- **Minor** — new RPCs or messages added (backwards compatible)
- **Patch** — documentation or tooling changes only

## Updating

When the proto contract changes in the backend repo, copy the updated
`proto/codewalker/v1/codewalker.proto` here and tag a new release.
