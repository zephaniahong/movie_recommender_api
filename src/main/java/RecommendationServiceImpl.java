import com.proto.movie.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class RecommendationServiceImpl extends RecommendationServiceGrpc.RecommendationServiceImplBase {

    @Override
    public void recommendation(RecommendationRequest request, StreamObserver<RecommendationResponse> responseObserver) {
        Movie movie_query = request.getMovieQuery();
        String movie_title = movie_query.getTitle();
        PostgreSQLJDBC query_engine = new PostgreSQLJDBC();
        String[] recommendations = query_engine.get_recommendation(movie_title);

        RecommendationResponse response = RecommendationResponse.newBuilder()
                .addRecommendations(recommendations[0])
                .addRecommendations(recommendations[1])
                .addRecommendations(recommendations[2])
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
