
import com.netcracker.financeapp.mapping.Finance;
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

public class FinanceTest {

    @Autowired
    IncomeService incomeService;
    @Autowired
    SpendingService spendingService;

    @Test
    public void testMaxIncome() {
        int maxIncome = incomeService.getMaxIncome();
        assertEquals(26000, maxIncome);
    }

    @Test
    public void testMaxSpending() {
        int maxSpending = spendingService.getMaxSpending();
        assertEquals(600, maxSpending);
    }

    @Test
    public void testIncomeListByTypeAndDateRange() {
        GregorianCalendar startCalendar = new GregorianCalendar(2015, 0, 9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017, 1, 21);
        Date end = endCalendar.getTime();
        ArrayList<Finance> incomeList = incomeService.getIncomeListByTypeName(start, end, "SALARY");
        assertEquals(1, incomeList.size());
    }

    @Test
    public void testSpendingListByTypeAndDateRange() {
        GregorianCalendar startCalendar = new GregorianCalendar(2015, 1, 9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017, 1, 21);
        Date end = endCalendar.getTime();
        ArrayList<Finance> incomeList = spendingService.getSpendingListByTypeName(start, end, "CARWASH");
        assertEquals(1, incomeList.size());
    }
    
    @Test
    public void testIncomeList() {
        GregorianCalendar startCalendar = new GregorianCalendar(2014, 0, 9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2019, 1, 21);
        Date end = endCalendar.getTime();
        ArrayList<Finance> incomeList = incomeService.getIncomeList(start, end);
        assertEquals(3, incomeList.size());
    }
    
    @Test
    public void testSpendingList() {
        GregorianCalendar startCalendar = new GregorianCalendar(2014, 0, 9);
        Date start = startCalendar.getTime();
        GregorianCalendar endCalendar = new GregorianCalendar(2017, 2, 1);
        Date end = endCalendar.getTime();
        ArrayList<Finance> spendingList = spendingService.getSpendingsList(start, end);
        assertEquals(4, spendingList.size());
    }
    
}
