package com.bhushan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhushan.model.Transaction;
import com.bhushan.service.TransactionServiceImp;

@Controller
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionServiceImp transactionService;

  
    @GetMapping("/history")
    public String showTransactionHistory(@RequestParam("accountNo") Long accountNo,
                                         Model model) {
        try {
            List<Transaction> transactions =
                    transactionService.getTransactionsByAccount(accountNo);

            model.addAttribute("transactions", transactions);
            model.addAttribute("accountNo", accountNo);

        } catch (Exception e) {
            model.addAttribute("errorMessage", e.getMessage());
        }

        return "transactions";
    }
}
