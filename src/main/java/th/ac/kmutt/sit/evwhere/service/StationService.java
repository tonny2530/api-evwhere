package th.ac.kmutt.sit.evwhere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import th.ac.kmutt.sit.evwhere.entity.StationEntity;
import th.ac.kmutt.sit.evwhere.model.StationResponse;
import th.ac.kmutt.sit.evwhere.repository.StationRepository;
import th.ac.kmutt.sit.evwhere.util.DistanceCalculator;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;
    @Autowired
    private DistanceCalculator distanceCalculator;

    public List<StationResponse> getAllStations(int count){
        Flux<StationEntity> stationEntityFlux = stationRepository.findAll();
        List<StationResponse> stationResponses = new ArrayList<>();
        for(StationEntity s : stationEntityFlux.collectList().block()){
            StationResponse st = mapToModel(s);
            stationResponses.add(st);
        }
        return stationResponses;
    }

    public List<StationResponse> getStationInRadius(Double lat,Double lng){
        List<StationResponse> stationResponses = new ArrayList<>();
//        Flux<StationEntity> stationEntityFlux = stationRepository.getStationByRadius(lat,lng);
        Flux<StationEntity> stationEntityFlux = stationRepository.findAll();
        for(StationEntity s : stationEntityFlux.collectList().block()){
            StationResponse st = mapToModel(s);
            Double radius = distanceCalculator.distance(lat,lng,s.getLatitude(),s.getLongitude(),'K');
            if(radius<=20) {
                stationResponses.add(st);
            }
        }
        return stationResponses;
    }
    
    private StationResponse mapToModel(StationEntity e){
        StationResponse st = new StationResponse();
        st.setLocationName(e.getLocationName());
        st.setClosingTime(e.getClosingTime());
        st.setLatitude(e.getLatitude().toString());
        st.setLocationAddress(e.getLocationAddress());
        st.setLocationDistrict(e.getLocationDistrict());
        st.setLocationSubdistrict(e.getLocationSubdistrict());
        st.setLocationProvince(e.getLocationProvince());
        st.setLocationPostalcode(e.getLocationPostalcode());
        st.setLongitude(e.getLongitude().toString());
        st.setOpeningTime(e.getOpeningTime());
        return st;
    }
}
