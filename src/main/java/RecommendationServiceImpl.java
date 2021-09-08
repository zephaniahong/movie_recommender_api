import com.proto.movie.Recommendation;
import com.proto.movie.RecommendationRequest;
import com.proto.movie.RecommendationResponse;
import com.proto.movie.RecommendationServiceGrpc;
import io.grpc.stub.StreamObserver;

public class RecommendationServiceImpl extends RecommendationServiceGrpc.RecommendationServiceImplBase{
    @Override
    public void movie(RecommendationRequest request, StreamObserver<RecommendationResponse> responseObserver) {
        Recommendation recommendation = request.getMovie();
        String title = recommendation.getTitle();
        String result = "Recommendation: " + title;

        // create a response based on the request
        RecommendationResponse response = RecommendationResponse.newBuilder()
                .setResult(result)
                .build();

        // send response back to client
        responseObserver.onNext(response);

        // complete the RPC call
        responseObserver.onCompleted();
    }
}
