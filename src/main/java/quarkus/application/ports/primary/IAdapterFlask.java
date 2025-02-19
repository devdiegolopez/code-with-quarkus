package quarkus.application.ports.primary;

import jakarta.ws.rs.PathParam;
import quarkus.core.domain.Account;
import quarkus.core.domain.AccountFlaskInfo;

public interface IAdapterFlask {

    public AccountFlaskInfo getAccount(Long accountId);

}
