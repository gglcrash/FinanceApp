
import com.netcracker.financeapp.dao.IncomeMapper;
import com.netcracker.financeapp.mapping.Income;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public class Test{
            @Autowired
    static IncomeMapper incomeMapper;
            static ArrayList<Income> myList;
        public static ArrayList<Income> getAll(){
            myList = incomeMapper.getAllIncomes();
            return myList;
        }
    }
