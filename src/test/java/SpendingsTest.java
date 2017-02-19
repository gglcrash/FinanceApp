/*
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.mapping.Spendings;
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

@ContextConfiguration(locations={ "file:src/main/webapp/WEB-INF/application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource({ "file:src/main/resources/webapp-derby.properties" })
public class SpendingsTest {
    @Autowired
    SpendingService spendingsService;
   
    @Test
    public void testMaxSpendings(){
        int maxSpendings = spendingsService.getMaxSpendings().getValue();
        assertEquals(4000, maxSpendings);
    }
    
    @Test
    public void testSpendingsList(){
        ArrayList<Spendings> spendingsList = spendingsService.getAllSpendingsListByTypeName("products");
        assertEquals(4, spendingsList.size());
    }
    
    @Test
    public void testSpendingsListDateRange(){
        GregorianCalendar startCalendar = new GregorianCalendar(2017,0,9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017,0,26);
        Date end = endCalendar.getTime();
        ArrayList<Spendings> spendingsList = spendingsService.getSpendingsList(start, end);
        assertEquals(4, spendingsList.size());
    }
    
    @Test
    public void testSpendingsListByTypeAndDateRange(){
        GregorianCalendar startCalendar = new GregorianCalendar(2015,0,9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017,0,27);
        Date end = endCalendar.getTime();
        ArrayList<Spendings> spendingsList = spendingsService.getSpendingsListByTypeName(start, end,"carwash");
        assertEquals(2, spendingsList.size());
    }
}
*/