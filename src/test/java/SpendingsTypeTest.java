
import com.netcracker.financeapp.service.SpendingsTypeService;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource({ "file:src/main/resources/webapp-derby.properties" })
public class SpendingsTypeTest {

    @Autowired
    SpendingsTypeService spendingsTypeService;

    @Test
    public void testSpendingsTypesCount() {
        ArrayList<String> namesList = spendingsTypeService.getSpendingsTypeNames();
        assertEquals(3, namesList.size());
    }

    @Test
    public void testSpendingsTypeIdByName() {
        int typeId = spendingsTypeService.getSpendingsTypeIdByName("beer");
        assertEquals(3, typeId);
    }

    @Test
    public void testSpendingsIncomeTypeById() {
        String typeName = spendingsTypeService.getSpendingsTypeById(2).getName();
        assertEquals("carwash", typeName);
    }
}
