package th.ac.kmutt.sit.evwhere.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.kmutt.sit.evwhere.entity.StationEntity;
import th.ac.kmutt.sit.evwhere.model.StationRequest;
import th.ac.kmutt.sit.evwhere.model.StationResponse;
import th.ac.kmutt.sit.evwhere.service.StationService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StationController {

    @Autowired
    private StationService stationsService;

    @ApiOperation(value = "Get All station list")
    @GetMapping(value = "/allstation")
    public ResponseEntity<List<StationResponse>> getAllStation(){
        return ResponseEntity.ok(stationsService.getAllStations(10));
    }

    @ApiOperation(value = "Get station by criteria")
    @GetMapping(value = "/station")
    public ResponseEntity<List<StationResponse>> getStationByCriteria(@RequestParam(required = true) Double lat,@RequestParam(required = true) Double lng){
        System.out.println(lat + " " + lng);
        return ResponseEntity.ok(stationsService.getStationInRadius(lat, lng));
    }

}
