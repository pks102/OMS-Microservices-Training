package demo.agentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AGENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agentId;
    private String loginId;
    private String lastName;
    private String firstName;
    private String password;
    private String email;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String state;


}
