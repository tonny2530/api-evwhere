package th.ac.kmutt.sit.evwhere.model;

import lombok.Data;

@Data
public class StationRequest {

    private String locationName;
    private String locationAddress;
    private String locationSubdistrict;
    private String locationDistrict;
    private String locationProvince;
    private String locationPostalcode;
    private String openingTime;
    private String closingTime;
    private String latitude;
    private String longitude;

}
