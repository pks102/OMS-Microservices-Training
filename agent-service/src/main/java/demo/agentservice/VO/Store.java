package demo.agentservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    private Long storeId;
    private String name;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private String pincode;
    private String email;
    private String phoneNumber;
}
