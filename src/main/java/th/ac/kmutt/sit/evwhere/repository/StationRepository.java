package th.ac.kmutt.sit.evwhere.repository;

import com.azure.spring.data.cosmos.repository.Query;
import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import th.ac.kmutt.sit.evwhere.entity.StationEntity;

@Repository
public interface StationRepository extends ReactiveCosmosRepository<StationEntity,Integer> {

    @Query("SELECT * FROM c where c.latitude = @lat and c.longitude = @long")
    Flux<StationEntity> getStationByRadius(@Param("lat") Double lat, @Param("long") Double lng);

}
