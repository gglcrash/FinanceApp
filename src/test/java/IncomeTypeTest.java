
import com.netcracker.financeapp.service.IncomeTypeService;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations={ "file:src/main/webapp/WEB-INF/application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class IncomeTypeTest {
    @Autowired
    IncomeTypeService incomeTypeService;
    
    @Test
    public void testIncomeTypesCount(){
        ArrayList<String> namesList = incomeTypeService.getIncomeTypeNames();
        assertEquals(2, namesList.size());
    }
    
    @Test
    public void testIncomeTypeIdByName(){
        int typeId = incomeTypeService.getIncomeTypeIdByName("salary");
        assertEquals(2, typeId);
    }
    
    @Test
    public void testIncomeIncomeTypeById(){
        String typeName = incomeTypeService.getIncomeTypeById(1).getName();
        assertEquals("lottery", typeName);
    }
}
