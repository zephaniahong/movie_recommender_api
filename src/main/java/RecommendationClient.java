import com.proto.movie.Recommendation;
import com.proto.movie.RecommendationRequest;
import com.proto.movie.RecommendationResponse;
import com.proto.movie.RecommendationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RecommendationClient {
    public static void main(String[] args) {
        System.out.println("gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // forces SSL to be deactivated during development
                .build();

        System.out.println("Creating client");
        // Synchronous Client
        RecommendationServiceGrpc.RecommendationServiceBlockingStub recommendationClient = RecommendationServiceGrpc.newBlockingStub(channel);

        Recommendation recommendation = Recommendation.newBuilder()
                .setTitle("Iron Man")
                .build();

        RecommendationRequest recommendationRequest = RecommendationRequest.newBuilder()
                .setMovie(recommendation)
                .build();

        RecommendationResponse response = recommendationClient.movie(recommendationRequest);
        System.out.println(response.getResult());

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
