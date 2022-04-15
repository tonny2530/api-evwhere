package th.ac.kmutt.sit.evwhere.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Container(containerName = "station")
public class Station {
    @Id
    private Integer stationId;
    private String locationName;
    private String locationAddress;
    private String locationSubdistrict;
    private String locationDistrict;
    private String locationProvince;
    private String locationPostalcode;
    private Timestamp openingTime;
    private Timestamp closingTime;
    private String latitude;
    private String longitude;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    
}
