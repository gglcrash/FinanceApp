import com.netcracker.financeapp.mapping.Agent;
import com.netcracker.financeapp.mapping.BankCard;
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.mapping.Transaction;
import com.netcracker.financeapp.mapping.Type;
import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.BankCardService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import com.netcracker.financeapp.service.TransactionService;
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

public class TransactionTest {
    @Autowired
    TransactionService transactionService;
    @Autowired
    AgentService agentService;
    @Autowired
    BankCardService bankCardService;
    @Autowired
    TypeService typeService;
    @Autowired
    IncomeService incomeService;
    
    @Test
    public void testGetTransactionByIdType() {
       Type tmpType = typeService.getTypeByName("INCOME");
       ArrayList<Transaction> transactionsList = transactionService.getTransactionsByIdType(
               tmpType.getIdType());
        assertEquals(3,transactionsList.size());
    }
    
    @Test
    public void testGetTransactionByIdTypeState() {
       Type tmpType = typeService.getTypeByName("ABORTED");
       ArrayList<Transaction> transactionsList = transactionService.getTransactionsByIdTypeState(
               tmpType.getIdType());
        assertEquals(0,transactionsList.size());
    }
    
    
    @Test
    public void testGetTransactionByIdCard() {
       BankCard tmpBankCard = bankCardService.getBankCardByNumber("1234 1234 1234 1234");
       ArrayList<Transaction> transactionsList = transactionService.getTransactionsByIdCard(
               tmpBankCard.getIdCard());
        assertEquals(4,transactionsList.size());
    }
    
    @Test
    public void testGetTransactionByIdTypeAndIdCard() {
       BankCard tmpBankCard = bankCardService.getBankCardByNumber("1234 1234 1234 1234");
       Type tmpType = typeService.getTypeByName("SPENDING");
       ArrayList<Transaction> transactionsList = transactionService.getTransactionsByIdTypeAndIdCard(
               tmpType.getIdType(),tmpBankCard.getIdCard());
        assertEquals(4,transactionsList.size());
    }
}
