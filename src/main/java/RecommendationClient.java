import com.proto.movie.RecommendationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RecommendationClient {
    public static void main(String[] args) {
        System.out.println("gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // forces SSL to be deactivated during development
                .build();

        System.out.println("Creating stub");
        RecommendationServiceGrpc.RecommendationServiceBlockingStub syncClient = RecommendationServiceGrpc.newBlockingStub(channel);



        System.out.println("Shutting down");
        channel.shutdown();
    }
}
