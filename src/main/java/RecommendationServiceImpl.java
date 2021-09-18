import com.proto.movie.*;
import io.grpc.stub.StreamObserver;

public class RecommendationServiceImpl extends RecommendationServiceGrpc.RecommendationServiceImplBase {

    @Override
    public void recommendation(RecommendationRequest request, StreamObserver<RecommendationResponse> responseObserver) {
        Movie movie_query = request.getMovieQuery();
        String movie_title = movie_query.getTitle();

    }
}
