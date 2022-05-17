package demo.agentservice.service;

import demo.agentservice.VO.ResponseTemplateVO;
import demo.agentservice.VO.Store;
import demo.agentservice.entity.Agent;
import demo.agentservice.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Agent saveAgent(Agent agent) {

        return agentRepository.save(agent);
    }

    public Agent findAgentById(Long agentId) {

        return agentRepository.findByAgentId(agentId);
    }

    public ResponseTemplateVO findStoreByAgentId(Long agentId) {

        ResponseTemplateVO vo = new ResponseTemplateVO();
        Agent agent = agentRepository.findByAgentId(agentId);

        Store store = restTemplate.getForObject("http://localhost:9191/agentStore/storeByAgent/"+agentId, Store.class);

        vo.setAgent(agent);
        vo.setStore(store);

        return vo;
    }
}
