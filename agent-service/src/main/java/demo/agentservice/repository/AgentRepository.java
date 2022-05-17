package demo.agentservice.repository;

import demo.agentservice.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

    Agent findByAgentId(Long agentId);

    Agent findStoreByAgentId(Long agentId);
}
