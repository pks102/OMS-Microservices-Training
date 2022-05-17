package demo.agentservice.controller;

import demo.agentservice.VO.ResponseTemplateVO;
import demo.agentservice.entity.Agent;
import demo.agentservice.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agents")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/")
    public Agent saveAgent(@RequestBody Agent agent){

        return agentService.saveAgent(agent);
    }

    @GetMapping("/{id}")
    public Agent findAgentById(@PathVariable("id") Long agentId){

        return agentService.findAgentById(agentId);
    }

    @GetMapping("/storeByAgent/{id}")
    public ResponseTemplateVO findStoreByAgentId(@PathVariable("id") Long agentId){

        System.out.println("abhishekkkkkkkkkk");
        return agentService.findStoreByAgentId(agentId);
    }
}
