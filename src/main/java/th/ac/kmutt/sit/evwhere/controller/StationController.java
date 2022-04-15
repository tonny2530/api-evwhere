package th.ac.kmutt.sit.evwhere.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmutt.sit.evwhere.entity.Provider;
import th.ac.kmutt.sit.evwhere.entity.Station;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StationController {

    @ApiOperation(value = "Get All station list")
    @GetMapping(value = "/station/")
    public ResponseEntity<List<Station>> getAllStation(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @ApiOperation(value = "Get station by criteria")
    @PostMapping(value = "/station/")
    public ResponseEntity<List<Station>> getStationByCriteria(@RequestBody Station station){
        return ResponseEntity.ok(new ArrayList<>());
    }

}
