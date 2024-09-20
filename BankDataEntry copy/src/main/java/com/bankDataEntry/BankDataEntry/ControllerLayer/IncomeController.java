package com.bankDataEntry.BankDataEntry.ControllerLayer;
// WORKS FINE, TESTED VIA MYSQL DATABASE AND POSTMAN
import com.bankDataEntry.BankDataEntry.ModelLayer.Income;
import com.bankDataEntry.BankDataEntry.RepositoryLayer.RepoIncome;
import com.bankDataEntry.BankDataEntry.ServiceLayer.IncomeInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class IncomeController {
    private IncomeInterface incomeInter;

    public IncomeController(IncomeInterface incomeInter) {
        this.incomeInter = incomeInter;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/api/public/deleteIncome/{id}")
    public ResponseEntity<String> deleteBankingIncomeData(@PathVariable Long id){
        incomeInter.deleteBankingIncomeData(id);
        return new ResponseEntity<>("Income Data Has Been Deleted", HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/api/public/addIncomeData")
    public ResponseEntity<String> addBankingIncomeData(@RequestBody Income income){
        incomeInter.addBankingIncomeData(income);
        return new ResponseEntity<>("Income Data Has Been Added", HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getInterestIncome/{bankId}/{year}")
    public ResponseEntity<Long> getInterestIncome(@PathVariable int bankId, @PathVariable int year){
       try{
           long result = incomeInter.getInterestIncome(bankId, year);
           return new ResponseEntity<>(result, HttpStatus.OK);

       }catch (Exception e){
           e.printStackTrace();
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getInterestFromSecurities/{bankId}/{year}")
    public ResponseEntity<Long> getInterestFromSecurities(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getInterestFromSecurities(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getInterestExpense/{bankId}/{year}")
    public ResponseEntity<Long> getInterestExpense(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getInterestExpense(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getInterestToDeposits/{bankId}/{year}")
    public ResponseEntity<Long> getInterestToDeposits(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getInterestToDeposits(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getInterestPaymentsToUsedLoans/{bankId}/{year}")
    public ResponseEntity<Long> getInterestPaymentsToUsedLoans(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getInterestPaymentsToUsedLoans(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getNetInterestIncome/{bankId}/{year}")
    public ResponseEntity<Long> getNetInterestIncome(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getNetInterestIncome(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getNonInterestIncome/{bankId}/{year}")
    public ResponseEntity<Long> getNonInterestIncome(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getNonInterestIncome(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getNetTotalIncome/{bankId}/{year}")
    public ResponseEntity<Long> getNetTotalIncome(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getNetTotalIncome(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getEarningsPerShare/{bankId}/{year}")
    public ResponseEntity<Long> getEarningsPerShare(@PathVariable int bankId, @PathVariable int year){
        long result = incomeInter.getEarningsPerShare(bankId, year);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
