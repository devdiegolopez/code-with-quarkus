package quarkus.application.ports.secondary;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import quarkus.core.domain.AccountFlaskInfo;

@RegisterRestClient(baseUri = "http://localhost:5000/")
public interface IFlask {

    @GET
    @Path("/{accountNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    AccountFlaskInfo getAcoAccountFlaskInfo(@PathParam("accountNumber") Long accountNumber);

}
