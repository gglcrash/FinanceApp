
import com.netcracker.financeapp.mapping.Agent;
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource({"file:src/main/resources/webapp-derby.properties"})

public class AgentTest {
    @Autowired
    AgentService agentService;
    
    @Test
    public void testGetAgentByName() {
        String agentNumber = agentService.getAgentNumberByName("SPORTLOTO");
        assertEquals("987654321",agentNumber);
    }

    @Test
    public void testGetAgentNamesList() {
        ArrayList<String> agentList = agentService.getAgentNames();
        assertEquals(4, agentList.size());
    }
}
