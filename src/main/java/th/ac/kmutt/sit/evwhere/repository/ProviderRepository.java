package th.ac.kmutt.sit.evwhere.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import th.ac.kmutt.sit.evwhere.entity.Provider;

@Repository
public interface ProviderRepository extends ReactiveCosmosRepository<Provider,Integer> {
    Flux<Provider> findByProviderName(String providerName);
}
