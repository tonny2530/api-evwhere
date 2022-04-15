package th.ac.kmutt.sit.evwhere.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import th.ac.kmutt.sit.evwhere.entity.ConnectorType;

@Repository
public interface ConnectorTypeRepository extends ReactiveCosmosRepository<ConnectorType,Integer> {
}
