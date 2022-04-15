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
@Container(containerName = "connector_type")
public class ConnectorType {
    @Id
    private Integer connectorId;
    private String name;
    private String type;
    private Timestamp createdDate;
    private Timestamp updatedDate;
}
