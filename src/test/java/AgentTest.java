
import com.netcracker.financeapp.service.AgentService;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource({"file:src/main/resources/webapp-derby.properties"})
//@TestPropertySource({"classpath:webapp-derby.properties"})
public class AgentTest {
    @Autowired
    AgentService agentService;
    
    @Test
    public void testGetAgentByName() {
        String agentNumber = agentService.getAgentByName("SPORTLOTO").getAccountNumber();
        assertEquals("987654321",agentNumber);
    }

    @Test
    public void testGetAgentNamesList() {
        ArrayList<String> agentList = agentService.getAgentNames();
        assertTrue(agentList.size()>0);
    }

}
