package th.ac.kmutt.sit.evwhere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import th.ac.kmutt.sit.evwhere.entity.ProviderEntity;
import th.ac.kmutt.sit.evwhere.repository.ProviderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public List<ProviderEntity> getAllProviderList(){
        Flux<ProviderEntity> providerEntityFlux = providerRepository.findAll();
        return providerEntityFlux.collectList().block();
    }

}
