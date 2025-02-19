package quarkus.application.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import quarkus.application.ports.primary.IAccountService;
import quarkus.application.ports.primary.IAdapterFlask;
import quarkus.core.domain.Account;
import quarkus.core.domain.AccountFlaskInfo;

@ApplicationScoped
public class AccountService implements IAccountService {

    @Inject
    private IAdapterFlask adapterFlask;

    @Override
    public AccountFlaskInfo getAccount(Account account) {
        Long accountId = account.getAccountId();
        System.out.println(accountId);
        adapterFlask.getAccount(accountId);
        return null;
    }
}
