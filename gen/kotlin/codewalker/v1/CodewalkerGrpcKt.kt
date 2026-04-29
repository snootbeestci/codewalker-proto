package codewalker.v1

import codewalker.v1.CodeWalkerGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for codewalker.v1.CodeWalker.
 */
public object CodeWalkerGrpcKt {
  public const val SERVICE_NAME: String = CodeWalkerGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getVersionMethod:
      MethodDescriptor<Codewalker.GetVersionRequest, Codewalker.GetVersionResponse>
    @JvmStatic
    get() = CodeWalkerGrpc.getGetVersionMethod()

  public val openSessionMethod:
      MethodDescriptor<Codewalker.OpenSessionRequest, Codewalker.SessionEvent>
    @JvmStatic
    get() = CodeWalkerGrpc.getOpenSessionMethod()

  public val navigateMethod: MethodDescriptor<Codewalker.NavigateRequest, Codewalker.NarrateEvent>
    @JvmStatic
    get() = CodeWalkerGrpc.getNavigateMethod()

  public val rephraseMethod: MethodDescriptor<Codewalker.RephraseRequest, Codewalker.NarrateEvent>
    @JvmStatic
    get() = CodeWalkerGrpc.getRephraseMethod()

  public val expandTermMethod:
      MethodDescriptor<Codewalker.ExpandTermRequest, Codewalker.NarrateEvent>
    @JvmStatic
    get() = CodeWalkerGrpc.getExpandTermMethod()

  public val closeSessionMethod:
      MethodDescriptor<Codewalker.CloseSessionRequest, Codewalker.CloseSessionResponse>
    @JvmStatic
    get() = CodeWalkerGrpc.getCloseSessionMethod()

  public val listSessionsMethod:
      MethodDescriptor<Codewalker.ListSessionsRequest, Codewalker.ListSessionsResponse>
    @JvmStatic
    get() = CodeWalkerGrpc.getListSessionsMethod()

  public val openReviewSessionMethod:
      MethodDescriptor<Codewalker.OpenReviewSessionRequest, Codewalker.SessionEvent>
    @JvmStatic
    get() = CodeWalkerGrpc.getOpenReviewSessionMethod()

  public val listFileOrderersMethod:
      MethodDescriptor<Codewalker.ListFileOrderersRequest, Codewalker.ListFileOrderersResponse>
    @JvmStatic
    get() = CodeWalkerGrpc.getListFileOrderersMethod()

  public val listPullRequestsMethod:
      MethodDescriptor<Codewalker.ListPullRequestsRequest, Codewalker.ListPullRequestsResponse>
    @JvmStatic
    get() = CodeWalkerGrpc.getListPullRequestsMethod()

  /**
   * A stub for issuing RPCs to a(n) codewalker.v1.CodeWalker service as suspending coroutines.
   */
  @StubFor(CodeWalkerGrpc::class)
  public class CodeWalkerCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CodeWalkerCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CodeWalkerCoroutineStub =
        CodeWalkerCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getVersion(request: Codewalker.GetVersionRequest, headers: Metadata =
        Metadata()): Codewalker.GetVersionResponse = unaryRpc(
      channel,
      CodeWalkerGrpc.getGetVersionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun openSession(request: Codewalker.OpenSessionRequest, headers: Metadata = Metadata()):
        Flow<Codewalker.SessionEvent> = serverStreamingRpc(
      channel,
      CodeWalkerGrpc.getOpenSessionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun navigate(request: Codewalker.NavigateRequest, headers: Metadata = Metadata()):
        Flow<Codewalker.NarrateEvent> = serverStreamingRpc(
      channel,
      CodeWalkerGrpc.getNavigateMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun rephrase(request: Codewalker.RephraseRequest, headers: Metadata = Metadata()):
        Flow<Codewalker.NarrateEvent> = serverStreamingRpc(
      channel,
      CodeWalkerGrpc.getRephraseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun expandTerm(request: Codewalker.ExpandTermRequest, headers: Metadata = Metadata()):
        Flow<Codewalker.NarrateEvent> = serverStreamingRpc(
      channel,
      CodeWalkerGrpc.getExpandTermMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun closeSession(request: Codewalker.CloseSessionRequest, headers: Metadata =
        Metadata()): Codewalker.CloseSessionResponse = unaryRpc(
      channel,
      CodeWalkerGrpc.getCloseSessionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listSessions(request: Codewalker.ListSessionsRequest, headers: Metadata =
        Metadata()): Codewalker.ListSessionsResponse = unaryRpc(
      channel,
      CodeWalkerGrpc.getListSessionsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun openReviewSession(request: Codewalker.OpenReviewSessionRequest, headers: Metadata =
        Metadata()): Flow<Codewalker.SessionEvent> = serverStreamingRpc(
      channel,
      CodeWalkerGrpc.getOpenReviewSessionMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listFileOrderers(request: Codewalker.ListFileOrderersRequest,
        headers: Metadata = Metadata()): Codewalker.ListFileOrderersResponse = unaryRpc(
      channel,
      CodeWalkerGrpc.getListFileOrderersMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listPullRequests(request: Codewalker.ListPullRequestsRequest,
        headers: Metadata = Metadata()): Codewalker.ListPullRequestsResponse = unaryRpc(
      channel,
      CodeWalkerGrpc.getListPullRequestsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the codewalker.v1.CodeWalker service based on Kotlin coroutines.
   */
  public abstract class CodeWalkerCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for codewalker.v1.CodeWalker.GetVersion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getVersion(request: Codewalker.GetVersionRequest):
        Codewalker.GetVersionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.GetVersion is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for codewalker.v1.CodeWalker.OpenSession.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun openSession(request: Codewalker.OpenSessionRequest):
        Flow<Codewalker.SessionEvent> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.OpenSession is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for codewalker.v1.CodeWalker.Navigate.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun navigate(request: Codewalker.NavigateRequest): Flow<Codewalker.NarrateEvent> =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.Navigate is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for codewalker.v1.CodeWalker.Rephrase.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun rephrase(request: Codewalker.RephraseRequest): Flow<Codewalker.NarrateEvent> =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.Rephrase is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for codewalker.v1.CodeWalker.ExpandTerm.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun expandTerm(request: Codewalker.ExpandTermRequest): Flow<Codewalker.NarrateEvent>
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.ExpandTerm is unimplemented"))

    /**
     * Returns the response to an RPC for codewalker.v1.CodeWalker.CloseSession.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun closeSession(request: Codewalker.CloseSessionRequest):
        Codewalker.CloseSessionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.CloseSession is unimplemented"))

    /**
     * Returns the response to an RPC for codewalker.v1.CodeWalker.ListSessions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listSessions(request: Codewalker.ListSessionsRequest):
        Codewalker.ListSessionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.ListSessions is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for codewalker.v1.CodeWalker.OpenReviewSession.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun openReviewSession(request: Codewalker.OpenReviewSessionRequest):
        Flow<Codewalker.SessionEvent> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.OpenReviewSession is unimplemented"))

    /**
     * Returns the response to an RPC for codewalker.v1.CodeWalker.ListFileOrderers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listFileOrderers(request: Codewalker.ListFileOrderersRequest):
        Codewalker.ListFileOrderersResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.ListFileOrderers is unimplemented"))

    /**
     * Returns the response to an RPC for codewalker.v1.CodeWalker.ListPullRequests.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listPullRequests(request: Codewalker.ListPullRequestsRequest):
        Codewalker.ListPullRequestsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method codewalker.v1.CodeWalker.ListPullRequests is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getGetVersionMethod(),
      implementation = ::getVersion
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getOpenSessionMethod(),
      implementation = ::openSession
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getNavigateMethod(),
      implementation = ::navigate
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getRephraseMethod(),
      implementation = ::rephrase
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getExpandTermMethod(),
      implementation = ::expandTerm
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getCloseSessionMethod(),
      implementation = ::closeSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getListSessionsMethod(),
      implementation = ::listSessions
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getOpenReviewSessionMethod(),
      implementation = ::openReviewSession
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getListFileOrderersMethod(),
      implementation = ::listFileOrderers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CodeWalkerGrpc.getListPullRequestsMethod(),
      implementation = ::listPullRequests
    )).build()
  }
}
