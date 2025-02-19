package quarkus.application.ports.primary;

import quarkus.core.domain.Account;
import quarkus.core.domain.AccountFlaskInfo;

public interface IAccountService {

    public AccountFlaskInfo getAccount(Account account);

}
