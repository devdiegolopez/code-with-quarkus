package quarkus.infraestructure.adapters.secondary;

import com.oracle.svm.core.annotate.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import quarkus.application.ports.primary.IAdapterFlask;
import quarkus.application.ports.secondary.IFlask;
import quarkus.core.domain.AccountFlaskInfo;

@ApplicationScoped
public class AdapterFlask implements IAdapterFlask {

    @Inject
    @RestClient
    private IFlask adapterFlask;

    @Override
    public AccountFlaskInfo getAccount(Long accountnumber) {

        return adapterFlask.getAcoAccountFlaskInfo(accountnumber);
    }
}
