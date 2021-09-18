import com.proto.movie.Movie;
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

        System.out.println("Creating stub");
        RecommendationServiceGrpc.RecommendationServiceBlockingStub recommendationClient = RecommendationServiceGrpc.newBlockingStub(channel);

        Movie movie = Movie.newBuilder()
                .setTitle("Iron Man")
                .setId(1)
                .build();

        RecommendationRequest request = RecommendationRequest.newBuilder()
                .setMovieQuery(movie)
                .build();

        RecommendationResponse response = recommendationClient.recommendation(request);
        System.out.println(response.getRecommendationsList());

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
