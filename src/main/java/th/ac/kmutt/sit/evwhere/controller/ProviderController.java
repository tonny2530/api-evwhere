package th.ac.kmutt.sit.evwhere.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmutt.sit.evwhere.entity.ProviderEntity;
import th.ac.kmutt.sit.evwhere.service.ProviderService;

import java.util.ArrayList;
import java.util.List;

//@RestController
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @ApiOperation(value = "Get All provider list")
    @GetMapping(value = "/provider/")
    public ResponseEntity<List<ProviderEntity>> getAllProvider(){
        return ResponseEntity.ok(providerService.getAllProviderList());
    }

}
