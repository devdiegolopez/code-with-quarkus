package quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

import java.util.Optional;

@Path("greet")
public class EcoResource {
    @GET
    @Path("/")
    public String greet(@QueryParam("message")String message) {
        return Optional.ofNullable(message).orElse("neu");
    }
    @GET
    @Path("/{lol}")
    public String kerrollo(@PathParam("lol") String lol) {
        return "Kerrollo Eco! "+lol;
    }
}
