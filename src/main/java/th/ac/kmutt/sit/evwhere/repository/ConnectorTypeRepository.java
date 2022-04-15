package th.ac.kmutt.sit.evwhere.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import th.ac.kmutt.sit.evwhere.entity.ConnectorTypeEntity;

@Repository
public interface ConnectorTypeRepository extends ReactiveCosmosRepository<ConnectorTypeEntity,Integer> {
}
