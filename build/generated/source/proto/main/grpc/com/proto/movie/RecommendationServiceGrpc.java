package com.proto.movie;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: movie.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecommendationServiceGrpc {

  private RecommendationServiceGrpc() {}

  public static final String SERVICE_NAME = "RecommendationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.movie.RecommendationRequest,
      com.proto.movie.RecommendationResponse> getMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Movie",
      requestType = com.proto.movie.RecommendationRequest.class,
      responseType = com.proto.movie.RecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.movie.RecommendationRequest,
      com.proto.movie.RecommendationResponse> getMovieMethod() {
    io.grpc.MethodDescriptor<com.proto.movie.RecommendationRequest, com.proto.movie.RecommendationResponse> getMovieMethod;
    if ((getMovieMethod = RecommendationServiceGrpc.getMovieMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getMovieMethod = RecommendationServiceGrpc.getMovieMethod) == null) {
          RecommendationServiceGrpc.getMovieMethod = getMovieMethod =
              io.grpc.MethodDescriptor.<com.proto.movie.RecommendationRequest, com.proto.movie.RecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Movie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.movie.RecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.movie.RecommendationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("Movie"))
              .build();
        }
      }
    }
    return getMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceStub>() {
        @java.lang.Override
        public RecommendationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceStub(channel, callOptions);
        }
      };
    return RecommendationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceBlockingStub>() {
        @java.lang.Override
        public RecommendationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceBlockingStub(channel, callOptions);
        }
      };
    return RecommendationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceFutureStub>() {
        @java.lang.Override
        public RecommendationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceFutureStub(channel, callOptions);
        }
      };
    return RecommendationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RecommendationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary API
     * </pre>
     */
    public void movie(com.proto.movie.RecommendationRequest request,
        io.grpc.stub.StreamObserver<com.proto.movie.RecommendationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMovieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMovieMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.movie.RecommendationRequest,
                com.proto.movie.RecommendationResponse>(
                  this, METHODID_MOVIE)))
          .build();
    }
  }

  /**
   */
  public static final class RecommendationServiceStub extends io.grpc.stub.AbstractAsyncStub<RecommendationServiceStub> {
    private RecommendationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary API
     * </pre>
     */
    public void movie(com.proto.movie.RecommendationRequest request,
        io.grpc.stub.StreamObserver<com.proto.movie.RecommendationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecommendationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RecommendationServiceBlockingStub> {
    private RecommendationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary API
     * </pre>
     */
    public com.proto.movie.RecommendationResponse movie(com.proto.movie.RecommendationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecommendationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RecommendationServiceFutureStub> {
    private RecommendationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.movie.RecommendationResponse> movie(
        com.proto.movie.RecommendationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVIE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOVIE:
          serviceImpl.movie((com.proto.movie.RecommendationRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.movie.RecommendationResponse>) responseObserver);
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

  private static abstract class RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.movie.Movie.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationService");
    }
  }

  private static final class RecommendationServiceFileDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier {
    RecommendationServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationServiceMethodDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecommendationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationServiceFileDescriptorSupplier())
              .addMethod(getMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
