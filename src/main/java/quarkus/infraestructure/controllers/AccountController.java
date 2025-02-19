package quarkus.infraestructure.controllers;

import com.oracle.svm.core.annotate.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.logging.Logger;
import quarkus.application.ports.primary.IAccountService;
import quarkus.application.services.AccountService;
import quarkus.core.domain.Account;


@Path("info")
public class AccountController {
    @Inject
    private IAccountService iaccountService;

    private static final Logger LOG = Logger.getLogger(String.valueOf(AccountController.class));

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/prueba")
    public Response userInfo(Account account) {
        LOG.info(account.toString());
        try {

            return Response
                    .status(Response.Status.OK)
                    .entity(iaccountService.getAccount(account))
                    .build();

        } catch (Exception e) {
            return Response
                    .status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Error procesando la solicitud: " + e.getMessage())
                    .build();
        }
    }
}