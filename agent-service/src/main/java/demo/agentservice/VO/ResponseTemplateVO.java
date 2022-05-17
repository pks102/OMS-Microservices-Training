package demo.agentservice.VO;

import demo.agentservice.entity.Agent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Agent agent;
    private Store store;

}
