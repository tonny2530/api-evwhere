package th.ac.kmutt.sit.evwhere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import th.ac.kmutt.sit.evwhere.entity.StationEntity;
import th.ac.kmutt.sit.evwhere.model.StationResponse;
import th.ac.kmutt.sit.evwhere.repository.StationRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    public List<StationResponse> getAllStations(int count){
        Flux<StationEntity> stationEntityFlux = stationRepository.findAll();
        List<StationResponse> stationResponses = new ArrayList<>();
        for(StationEntity s : stationEntityFlux.collectList().block()){
            StationResponse st = new StationResponse();
            st.setLocationName(s.getLocationName());
            stationResponses.add(st);
        }
        return stationResponses;
    }

    public List<StationResponse> getStationInRadius(Double lat,Double lng){
        List<StationResponse> stationResponses = new ArrayList<>();
        Flux<StationEntity> stationEntityFlux = stationRepository.getStationByRadius(lat,lng);
        for(StationEntity s : stationEntityFlux.collectList().block()){
            StationResponse st = new StationResponse();
            st.setLocationName(s.getLocationName());
            stationResponses.add(st);
        }
        return stationResponses;
    }
}
