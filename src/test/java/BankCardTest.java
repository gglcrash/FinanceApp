
import com.netcracker.financeapp.mapping.BankCard;
import com.netcracker.financeapp.service.BankCardService;
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
public class BankCardTest {
    @Autowired
    BankCardService bankCardService;
    
    @Test
    public void testGetAgentByName() {
        BankCard bankCard = bankCardService.getBankCardByNumber("1234 1234 1234 1234");
        assertEquals("ARTEM",bankCard.getOwnerName());
    }

    @Test
    public void testGetBankCardList() {
        ArrayList<String> cardList = bankCardService.getBankCardNumbers();
        assertTrue(cardList.size()>0);
    }

}
