package server;

import io.vertx.core.Vertx;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by d on 06/09/2018.
 */
public class Server {
    Vertx vertx = Vertx.vertx();
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x!");
        }).listen(8080, err ->{
            System.out.print("Server running on port 8080...");
        });
    }
    public static void main(String []args){
        Server server = new Server();
        server.start();
    }
}
