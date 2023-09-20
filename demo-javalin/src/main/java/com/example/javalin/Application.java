package com.example.javalin;

import com.example.javalin.presentacion.*;
import io.javalin.Javalin;

public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create()
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);

        app.get("/api/mascotas", new GetMascotasHandler());
        app.get("/api/imagenes", new GetImagenesHandler());
        app.get("/api/mascotas/{id}", new GetMascotaIdHandler());
        app.post("/api/mascotas", new PostMascotaHandler());

        app.post("/api/login", new LoginHandler());

        app.exception(IllegalArgumentException.class, (e, ctx) -> {
            //tratar excepcion
        });


    }


}
