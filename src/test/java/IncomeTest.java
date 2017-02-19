/*import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.service.IncomeService;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(locations={ "file:src/main/webapp/WEB-INF/application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource({ "file:src/main/resources/webapp-derby.properties" })
public class IncomeTest {
    @Autowired
    IncomeService incomeService;
   
    @Test
    public void testMaxIncome(){
        int maxIncome = incomeService.getMaxIncome().getValue();
        assertEquals(50000, maxIncome);
    }
    
    @Test
    public void testIncomeList(){
        ArrayList<Finance> incomeList = incomeService.getAllIncomeListByTypeName("salary");
        assertEquals(5, incomeList.size());
    }
    
    @Test
    public void testIncomeListDateRange(){
        GregorianCalendar startCalendar = new GregorianCalendar(2017,0,9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017,0,21);
        Date end = endCalendar.getTime();
        ArrayList<Finance> incomeList = incomeService.getIncomeList(start, end);
        assertEquals(3, incomeList.size());
    }
    
    @Test
    public void testIncomeListByTypeAndDateRange(){
        GregorianCalendar startCalendar = new GregorianCalendar(2015,0,9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017,0,21);
        Date end = endCalendar.getTime();
        ArrayList<Finance> incomeList = incomeService.getIncomeListByTypeName(start, end,"salary");
        assertEquals(5, incomeList.size());
    }
}
*/