
import com.netcracker.financeapp.mapping.Agent;
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.mapping.Type;
import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import com.netcracker.financeapp.service.TypeService;
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

public class TypeTest {
    @Autowired
    TypeService typeService;
    
    
    @Test
    public void testGetTypeByName() {
        Type tmpType = typeService.getTypeByName("PRODUCTS");
        Type parentType = typeService.getParentTypeByChildId(tmpType.getIdType());
        assertEquals("SPENDING",parentType.getName());
    }
    
      @Test
    public void testGetParentTypeByName() {
        Type parentType = typeService.getParentTypeByChildName("SALARY");
        assertEquals("INCOME",parentType.getName());
    }
    
    
    @Test
    public void testGetTypeById() {
        Type tmpType = typeService.getTypeByName("LOTTERY");
        Type parentType = typeService.getTypeById(tmpType.getIdParent());
        assertEquals("INCOME",parentType.getName());
    }
    
    
    @Test
    public void testIncomeTypeNames() {
        ArrayList<String> incomeList = typeService.getIncomeTypeNames();
        assertEquals(2,incomeList.size());
    }
    
    @Test
    public void testSpendingTypeNames() {
        ArrayList<String> spendingList = typeService.getSpendingTypeNames();
        assertEquals(2,spendingList.size());
    }

}
