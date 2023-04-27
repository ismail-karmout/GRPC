package test.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import test.service.BankGrpcService;

import java.io.IOException;

public class Grpcserver {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();
        server.start();
        server.awaitTermination();

    }

}
