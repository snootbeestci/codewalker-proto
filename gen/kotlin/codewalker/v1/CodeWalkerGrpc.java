package codewalker.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: codewalker/v1/codewalker.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CodeWalkerGrpc {

  private CodeWalkerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "codewalker.v1.CodeWalker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.GetVersionRequest,
      codewalker.v1.Codewalker.GetVersionResponse> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = codewalker.v1.Codewalker.GetVersionRequest.class,
      responseType = codewalker.v1.Codewalker.GetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.GetVersionRequest,
      codewalker.v1.Codewalker.GetVersionResponse> getGetVersionMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.GetVersionRequest, codewalker.v1.Codewalker.GetVersionResponse> getGetVersionMethod;
    if ((getGetVersionMethod = CodeWalkerGrpc.getGetVersionMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getGetVersionMethod = CodeWalkerGrpc.getGetVersionMethod) == null) {
          CodeWalkerGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.GetVersionRequest, codewalker.v1.Codewalker.GetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.GetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.GetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.OpenSessionRequest,
      codewalker.v1.Codewalker.SessionEvent> getOpenSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenSession",
      requestType = codewalker.v1.Codewalker.OpenSessionRequest.class,
      responseType = codewalker.v1.Codewalker.SessionEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.OpenSessionRequest,
      codewalker.v1.Codewalker.SessionEvent> getOpenSessionMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.OpenSessionRequest, codewalker.v1.Codewalker.SessionEvent> getOpenSessionMethod;
    if ((getOpenSessionMethod = CodeWalkerGrpc.getOpenSessionMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getOpenSessionMethod = CodeWalkerGrpc.getOpenSessionMethod) == null) {
          CodeWalkerGrpc.getOpenSessionMethod = getOpenSessionMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.OpenSessionRequest, codewalker.v1.Codewalker.SessionEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.OpenSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.SessionEvent.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("OpenSession"))
              .build();
        }
      }
    }
    return getOpenSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.NavigateRequest,
      codewalker.v1.Codewalker.NarrateEvent> getNavigateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Navigate",
      requestType = codewalker.v1.Codewalker.NavigateRequest.class,
      responseType = codewalker.v1.Codewalker.NarrateEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.NavigateRequest,
      codewalker.v1.Codewalker.NarrateEvent> getNavigateMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.NavigateRequest, codewalker.v1.Codewalker.NarrateEvent> getNavigateMethod;
    if ((getNavigateMethod = CodeWalkerGrpc.getNavigateMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getNavigateMethod = CodeWalkerGrpc.getNavigateMethod) == null) {
          CodeWalkerGrpc.getNavigateMethod = getNavigateMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.NavigateRequest, codewalker.v1.Codewalker.NarrateEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Navigate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.NavigateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.NarrateEvent.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("Navigate"))
              .build();
        }
      }
    }
    return getNavigateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.RephraseRequest,
      codewalker.v1.Codewalker.NarrateEvent> getRephraseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rephrase",
      requestType = codewalker.v1.Codewalker.RephraseRequest.class,
      responseType = codewalker.v1.Codewalker.NarrateEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.RephraseRequest,
      codewalker.v1.Codewalker.NarrateEvent> getRephraseMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.RephraseRequest, codewalker.v1.Codewalker.NarrateEvent> getRephraseMethod;
    if ((getRephraseMethod = CodeWalkerGrpc.getRephraseMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getRephraseMethod = CodeWalkerGrpc.getRephraseMethod) == null) {
          CodeWalkerGrpc.getRephraseMethod = getRephraseMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.RephraseRequest, codewalker.v1.Codewalker.NarrateEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rephrase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.RephraseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.NarrateEvent.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("Rephrase"))
              .build();
        }
      }
    }
    return getRephraseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ExpandTermRequest,
      codewalker.v1.Codewalker.NarrateEvent> getExpandTermMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpandTerm",
      requestType = codewalker.v1.Codewalker.ExpandTermRequest.class,
      responseType = codewalker.v1.Codewalker.NarrateEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ExpandTermRequest,
      codewalker.v1.Codewalker.NarrateEvent> getExpandTermMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ExpandTermRequest, codewalker.v1.Codewalker.NarrateEvent> getExpandTermMethod;
    if ((getExpandTermMethod = CodeWalkerGrpc.getExpandTermMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getExpandTermMethod = CodeWalkerGrpc.getExpandTermMethod) == null) {
          CodeWalkerGrpc.getExpandTermMethod = getExpandTermMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.ExpandTermRequest, codewalker.v1.Codewalker.NarrateEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExpandTerm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.ExpandTermRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.NarrateEvent.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("ExpandTerm"))
              .build();
        }
      }
    }
    return getExpandTermMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.CloseSessionRequest,
      codewalker.v1.Codewalker.CloseSessionResponse> getCloseSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseSession",
      requestType = codewalker.v1.Codewalker.CloseSessionRequest.class,
      responseType = codewalker.v1.Codewalker.CloseSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.CloseSessionRequest,
      codewalker.v1.Codewalker.CloseSessionResponse> getCloseSessionMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.CloseSessionRequest, codewalker.v1.Codewalker.CloseSessionResponse> getCloseSessionMethod;
    if ((getCloseSessionMethod = CodeWalkerGrpc.getCloseSessionMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getCloseSessionMethod = CodeWalkerGrpc.getCloseSessionMethod) == null) {
          CodeWalkerGrpc.getCloseSessionMethod = getCloseSessionMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.CloseSessionRequest, codewalker.v1.Codewalker.CloseSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.CloseSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.CloseSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("CloseSession"))
              .build();
        }
      }
    }
    return getCloseSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ListSessionsRequest,
      codewalker.v1.Codewalker.ListSessionsResponse> getListSessionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSessions",
      requestType = codewalker.v1.Codewalker.ListSessionsRequest.class,
      responseType = codewalker.v1.Codewalker.ListSessionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ListSessionsRequest,
      codewalker.v1.Codewalker.ListSessionsResponse> getListSessionsMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ListSessionsRequest, codewalker.v1.Codewalker.ListSessionsResponse> getListSessionsMethod;
    if ((getListSessionsMethod = CodeWalkerGrpc.getListSessionsMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getListSessionsMethod = CodeWalkerGrpc.getListSessionsMethod) == null) {
          CodeWalkerGrpc.getListSessionsMethod = getListSessionsMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.ListSessionsRequest, codewalker.v1.Codewalker.ListSessionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.ListSessionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.ListSessionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("ListSessions"))
              .build();
        }
      }
    }
    return getListSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.OpenReviewSessionRequest,
      codewalker.v1.Codewalker.SessionEvent> getOpenReviewSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OpenReviewSession",
      requestType = codewalker.v1.Codewalker.OpenReviewSessionRequest.class,
      responseType = codewalker.v1.Codewalker.SessionEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.OpenReviewSessionRequest,
      codewalker.v1.Codewalker.SessionEvent> getOpenReviewSessionMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.OpenReviewSessionRequest, codewalker.v1.Codewalker.SessionEvent> getOpenReviewSessionMethod;
    if ((getOpenReviewSessionMethod = CodeWalkerGrpc.getOpenReviewSessionMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getOpenReviewSessionMethod = CodeWalkerGrpc.getOpenReviewSessionMethod) == null) {
          CodeWalkerGrpc.getOpenReviewSessionMethod = getOpenReviewSessionMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.OpenReviewSessionRequest, codewalker.v1.Codewalker.SessionEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OpenReviewSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.OpenReviewSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.SessionEvent.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("OpenReviewSession"))
              .build();
        }
      }
    }
    return getOpenReviewSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ListFileOrderersRequest,
      codewalker.v1.Codewalker.ListFileOrderersResponse> getListFileOrderersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFileOrderers",
      requestType = codewalker.v1.Codewalker.ListFileOrderersRequest.class,
      responseType = codewalker.v1.Codewalker.ListFileOrderersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ListFileOrderersRequest,
      codewalker.v1.Codewalker.ListFileOrderersResponse> getListFileOrderersMethod() {
    io.grpc.MethodDescriptor<codewalker.v1.Codewalker.ListFileOrderersRequest, codewalker.v1.Codewalker.ListFileOrderersResponse> getListFileOrderersMethod;
    if ((getListFileOrderersMethod = CodeWalkerGrpc.getListFileOrderersMethod) == null) {
      synchronized (CodeWalkerGrpc.class) {
        if ((getListFileOrderersMethod = CodeWalkerGrpc.getListFileOrderersMethod) == null) {
          CodeWalkerGrpc.getListFileOrderersMethod = getListFileOrderersMethod =
              io.grpc.MethodDescriptor.<codewalker.v1.Codewalker.ListFileOrderersRequest, codewalker.v1.Codewalker.ListFileOrderersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFileOrderers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.ListFileOrderersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codewalker.v1.Codewalker.ListFileOrderersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CodeWalkerMethodDescriptorSupplier("ListFileOrderers"))
              .build();
        }
      }
    }
    return getListFileOrderersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CodeWalkerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CodeWalkerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CodeWalkerStub>() {
        @java.lang.Override
        public CodeWalkerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CodeWalkerStub(channel, callOptions);
        }
      };
    return CodeWalkerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CodeWalkerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CodeWalkerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CodeWalkerBlockingStub>() {
        @java.lang.Override
        public CodeWalkerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CodeWalkerBlockingStub(channel, callOptions);
        }
      };
    return CodeWalkerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CodeWalkerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CodeWalkerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CodeWalkerFutureStub>() {
        @java.lang.Override
        public CodeWalkerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CodeWalkerFutureStub(channel, callOptions);
        }
      };
    return CodeWalkerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns the server's version information.
     * Clients should call this on connect and warn the user if the
     * proto major version does not match the version they were built against.
     * </pre>
     */
    default void getVersion(codewalker.v1.Codewalker.GetVersionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.GetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open a session against a file at a specific ref.
     * Server parses the AST, builds the step graph, and streams back
     * progress before emitting a final SessionReady event.
     * </pre>
     */
    default void openSession(codewalker.v1.Codewalker.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.SessionEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Navigate within an open session. Server streams narration tokens
     * followed by a StepComplete event.
     * </pre>
     */
    default void navigate(codewalker.v1.Codewalker.NavigateRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNavigateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request a rephrasing of the current step's narration.
     * </pre>
     */
    default void rephrase(codewalker.v1.Codewalker.RephraseRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRephraseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resolve a glossary term. Returns a full definition stream.
     * </pre>
     */
    default void expandTerm(codewalker.v1.Codewalker.ExpandTermRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExpandTermMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close a session and release server-side state.
     * </pre>
     */
    default void closeSession(codewalker.v1.Codewalker.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List open sessions (useful for IDE plugins managing multiple tabs).
     * </pre>
     */
    default void listSessions(codewalker.v1.Codewalker.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.ListSessionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSessionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Open a review session against a PR, commit, or branch comparison URL.
     * Server parses the URL, fetches the diff via the appropriate ForgeHandler,
     * and streams back progress before emitting a final ReviewReady event.
     * </pre>
     */
    default void openReviewSession(codewalker.v1.Codewalker.OpenReviewSessionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.SessionEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenReviewSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * List available file ordering strategies. Clients can use this to
     * populate user-facing pickers without hardcoding the strategy names.
     * </pre>
     */
    default void listFileOrderers(codewalker.v1.Codewalker.ListFileOrderersRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.ListFileOrderersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFileOrderersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CodeWalker.
   */
  public static abstract class CodeWalkerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CodeWalkerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CodeWalker.
   */
  public static final class CodeWalkerStub
      extends io.grpc.stub.AbstractAsyncStub<CodeWalkerStub> {
    private CodeWalkerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CodeWalkerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CodeWalkerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the server's version information.
     * Clients should call this on connect and warn the user if the
     * proto major version does not match the version they were built against.
     * </pre>
     */
    public void getVersion(codewalker.v1.Codewalker.GetVersionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.GetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a session against a file at a specific ref.
     * Server parses the AST, builds the step graph, and streams back
     * progress before emitting a final SessionReady event.
     * </pre>
     */
    public void openSession(codewalker.v1.Codewalker.OpenSessionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.SessionEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Navigate within an open session. Server streams narration tokens
     * followed by a StepComplete event.
     * </pre>
     */
    public void navigate(codewalker.v1.Codewalker.NavigateRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getNavigateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request a rephrasing of the current step's narration.
     * </pre>
     */
    public void rephrase(codewalker.v1.Codewalker.RephraseRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRephraseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resolve a glossary term. Returns a full definition stream.
     * </pre>
     */
    public void expandTerm(codewalker.v1.Codewalker.ExpandTermRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getExpandTermMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close a session and release server-side state.
     * </pre>
     */
    public void closeSession(codewalker.v1.Codewalker.CloseSessionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.CloseSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List open sessions (useful for IDE plugins managing multiple tabs).
     * </pre>
     */
    public void listSessions(codewalker.v1.Codewalker.ListSessionsRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.ListSessionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Open a review session against a PR, commit, or branch comparison URL.
     * Server parses the URL, fetches the diff via the appropriate ForgeHandler,
     * and streams back progress before emitting a final ReviewReady event.
     * </pre>
     */
    public void openReviewSession(codewalker.v1.Codewalker.OpenReviewSessionRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.SessionEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getOpenReviewSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List available file ordering strategies. Clients can use this to
     * populate user-facing pickers without hardcoding the strategy names.
     * </pre>
     */
    public void listFileOrderers(codewalker.v1.Codewalker.ListFileOrderersRequest request,
        io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.ListFileOrderersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFileOrderersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CodeWalker.
   */
  public static final class CodeWalkerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CodeWalkerBlockingStub> {
    private CodeWalkerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CodeWalkerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CodeWalkerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the server's version information.
     * Clients should call this on connect and warn the user if the
     * proto major version does not match the version they were built against.
     * </pre>
     */
    public codewalker.v1.Codewalker.GetVersionResponse getVersion(codewalker.v1.Codewalker.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Open a session against a file at a specific ref.
     * Server parses the AST, builds the step graph, and streams back
     * progress before emitting a final SessionReady event.
     * </pre>
     */
    public java.util.Iterator<codewalker.v1.Codewalker.SessionEvent> openSession(
        codewalker.v1.Codewalker.OpenSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Navigate within an open session. Server streams narration tokens
     * followed by a StepComplete event.
     * </pre>
     */
    public java.util.Iterator<codewalker.v1.Codewalker.NarrateEvent> navigate(
        codewalker.v1.Codewalker.NavigateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getNavigateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request a rephrasing of the current step's narration.
     * </pre>
     */
    public java.util.Iterator<codewalker.v1.Codewalker.NarrateEvent> rephrase(
        codewalker.v1.Codewalker.RephraseRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRephraseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resolve a glossary term. Returns a full definition stream.
     * </pre>
     */
    public java.util.Iterator<codewalker.v1.Codewalker.NarrateEvent> expandTerm(
        codewalker.v1.Codewalker.ExpandTermRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getExpandTermMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close a session and release server-side state.
     * </pre>
     */
    public codewalker.v1.Codewalker.CloseSessionResponse closeSession(codewalker.v1.Codewalker.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List open sessions (useful for IDE plugins managing multiple tabs).
     * </pre>
     */
    public codewalker.v1.Codewalker.ListSessionsResponse listSessions(codewalker.v1.Codewalker.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSessionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Open a review session against a PR, commit, or branch comparison URL.
     * Server parses the URL, fetches the diff via the appropriate ForgeHandler,
     * and streams back progress before emitting a final ReviewReady event.
     * </pre>
     */
    public java.util.Iterator<codewalker.v1.Codewalker.SessionEvent> openReviewSession(
        codewalker.v1.Codewalker.OpenReviewSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getOpenReviewSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List available file ordering strategies. Clients can use this to
     * populate user-facing pickers without hardcoding the strategy names.
     * </pre>
     */
    public codewalker.v1.Codewalker.ListFileOrderersResponse listFileOrderers(codewalker.v1.Codewalker.ListFileOrderersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFileOrderersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CodeWalker.
   */
  public static final class CodeWalkerFutureStub
      extends io.grpc.stub.AbstractFutureStub<CodeWalkerFutureStub> {
    private CodeWalkerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CodeWalkerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CodeWalkerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the server's version information.
     * Clients should call this on connect and warn the user if the
     * proto major version does not match the version they were built against.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<codewalker.v1.Codewalker.GetVersionResponse> getVersion(
        codewalker.v1.Codewalker.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close a session and release server-side state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<codewalker.v1.Codewalker.CloseSessionResponse> closeSession(
        codewalker.v1.Codewalker.CloseSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List open sessions (useful for IDE plugins managing multiple tabs).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<codewalker.v1.Codewalker.ListSessionsResponse> listSessions(
        codewalker.v1.Codewalker.ListSessionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSessionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List available file ordering strategies. Clients can use this to
     * populate user-facing pickers without hardcoding the strategy names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<codewalker.v1.Codewalker.ListFileOrderersResponse> listFileOrderers(
        codewalker.v1.Codewalker.ListFileOrderersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFileOrderersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VERSION = 0;
  private static final int METHODID_OPEN_SESSION = 1;
  private static final int METHODID_NAVIGATE = 2;
  private static final int METHODID_REPHRASE = 3;
  private static final int METHODID_EXPAND_TERM = 4;
  private static final int METHODID_CLOSE_SESSION = 5;
  private static final int METHODID_LIST_SESSIONS = 6;
  private static final int METHODID_OPEN_REVIEW_SESSION = 7;
  private static final int METHODID_LIST_FILE_ORDERERS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((codewalker.v1.Codewalker.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.GetVersionResponse>) responseObserver);
          break;
        case METHODID_OPEN_SESSION:
          serviceImpl.openSession((codewalker.v1.Codewalker.OpenSessionRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.SessionEvent>) responseObserver);
          break;
        case METHODID_NAVIGATE:
          serviceImpl.navigate((codewalker.v1.Codewalker.NavigateRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent>) responseObserver);
          break;
        case METHODID_REPHRASE:
          serviceImpl.rephrase((codewalker.v1.Codewalker.RephraseRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent>) responseObserver);
          break;
        case METHODID_EXPAND_TERM:
          serviceImpl.expandTerm((codewalker.v1.Codewalker.ExpandTermRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.NarrateEvent>) responseObserver);
          break;
        case METHODID_CLOSE_SESSION:
          serviceImpl.closeSession((codewalker.v1.Codewalker.CloseSessionRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.CloseSessionResponse>) responseObserver);
          break;
        case METHODID_LIST_SESSIONS:
          serviceImpl.listSessions((codewalker.v1.Codewalker.ListSessionsRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.ListSessionsResponse>) responseObserver);
          break;
        case METHODID_OPEN_REVIEW_SESSION:
          serviceImpl.openReviewSession((codewalker.v1.Codewalker.OpenReviewSessionRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.SessionEvent>) responseObserver);
          break;
        case METHODID_LIST_FILE_ORDERERS:
          serviceImpl.listFileOrderers((codewalker.v1.Codewalker.ListFileOrderersRequest) request,
              (io.grpc.stub.StreamObserver<codewalker.v1.Codewalker.ListFileOrderersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.GetVersionRequest,
              codewalker.v1.Codewalker.GetVersionResponse>(
                service, METHODID_GET_VERSION)))
        .addMethod(
          getOpenSessionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.OpenSessionRequest,
              codewalker.v1.Codewalker.SessionEvent>(
                service, METHODID_OPEN_SESSION)))
        .addMethod(
          getNavigateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.NavigateRequest,
              codewalker.v1.Codewalker.NarrateEvent>(
                service, METHODID_NAVIGATE)))
        .addMethod(
          getRephraseMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.RephraseRequest,
              codewalker.v1.Codewalker.NarrateEvent>(
                service, METHODID_REPHRASE)))
        .addMethod(
          getExpandTermMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.ExpandTermRequest,
              codewalker.v1.Codewalker.NarrateEvent>(
                service, METHODID_EXPAND_TERM)))
        .addMethod(
          getCloseSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.CloseSessionRequest,
              codewalker.v1.Codewalker.CloseSessionResponse>(
                service, METHODID_CLOSE_SESSION)))
        .addMethod(
          getListSessionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.ListSessionsRequest,
              codewalker.v1.Codewalker.ListSessionsResponse>(
                service, METHODID_LIST_SESSIONS)))
        .addMethod(
          getOpenReviewSessionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.OpenReviewSessionRequest,
              codewalker.v1.Codewalker.SessionEvent>(
                service, METHODID_OPEN_REVIEW_SESSION)))
        .addMethod(
          getListFileOrderersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codewalker.v1.Codewalker.ListFileOrderersRequest,
              codewalker.v1.Codewalker.ListFileOrderersResponse>(
                service, METHODID_LIST_FILE_ORDERERS)))
        .build();
  }

  private static abstract class CodeWalkerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CodeWalkerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return codewalker.v1.Codewalker.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CodeWalker");
    }
  }

  private static final class CodeWalkerFileDescriptorSupplier
      extends CodeWalkerBaseDescriptorSupplier {
    CodeWalkerFileDescriptorSupplier() {}
  }

  private static final class CodeWalkerMethodDescriptorSupplier
      extends CodeWalkerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CodeWalkerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CodeWalkerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CodeWalkerFileDescriptorSupplier())
              .addMethod(getGetVersionMethod())
              .addMethod(getOpenSessionMethod())
              .addMethod(getNavigateMethod())
              .addMethod(getRephraseMethod())
              .addMethod(getExpandTermMethod())
              .addMethod(getCloseSessionMethod())
              .addMethod(getListSessionsMethod())
              .addMethod(getOpenReviewSessionMethod())
              .addMethod(getListFileOrderersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
