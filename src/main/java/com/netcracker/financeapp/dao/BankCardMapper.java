package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.BankCard;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;

public interface BankCardMapper {

    BankCard getBankCardByNumber(String cardNumber);

    ArrayList<String> getBankCardNumbers();
    
    int insertBankCard(@Param("amount") int amount, @Param("cvv") int cvv, @Param("expireMonth") 
            int expireMonth, @Param("expireYear") int expireYear, @Param("cardNumber") 
                    String cardNumber, @Param("ownerName") int ownerName, 
                    @Param("ownerSurname") int ownerSurname);
}
