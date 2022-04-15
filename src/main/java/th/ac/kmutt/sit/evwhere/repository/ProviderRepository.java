package th.ac.kmutt.sit.evwhere.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import th.ac.kmutt.sit.evwhere.entity.ProviderEntity;

@Repository
public interface ProviderRepository extends ReactiveCosmosRepository<ProviderEntity,Integer> {
    Flux<ProviderEntity> findByProviderName(String providerName);
}
