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
@Container(containerName = "provider")
public class ProviderEntity {
    @Id
    private Integer providerId;
    private String providerName;
    private String phone;
    private String email;
    private Timestamp createdDate;
    private Timestamp updatedDate;
}
