package th.ac.kmutt.sit.evwhere.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import th.ac.kmutt.sit.evwhere.entity.Provider;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProviderController {

    @ApiOperation(value = "Get All provider list")
    @GetMapping(value = "/provider/")
    public ResponseEntity<List<Provider>> getAllProvider(){
        return ResponseEntity.ok(new ArrayList<>());
    }

}
