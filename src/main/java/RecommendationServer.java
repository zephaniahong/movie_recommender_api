import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class RecommendationServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello gRPC");

        Server server = ServerBuilder.forPort(50051)
                .addService(new RecommendationServiceImpl())
                .build();

        server.start();
        // whenever java application receives shutdown request, it will shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            System.out.println("Received shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));
        server.awaitTermination(); // needs to block for main thread
    }
}
