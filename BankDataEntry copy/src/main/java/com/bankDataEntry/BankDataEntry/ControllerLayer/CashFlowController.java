package com.bankDataEntry.BankDataEntry.ControllerLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.CashFlow;
import com.bankDataEntry.BankDataEntry.ServiceLayer.CashFlowInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CashFlowController {

    private CashFlowInterface cashInterface;

    public CashFlowController(CashFlowInterface cashInterface) {
        this.cashInterface = cashInterface;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/api/public/removeDataFromCashFlow/{id}")
    public ResponseEntity<String> removeBankingCashFlow(@PathVariable Long id){
        cashInterface.removeBankingCashFlow(id);
        return new ResponseEntity<>("Data From Cash Flow Has Been Deleted", HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/api/public/addCashFlowData")
    public ResponseEntity<String> addBankingCashFlowData(@RequestBody CashFlow cashFlow){
        cashInterface.addBankingCashFlowData(cashFlow);
        return new ResponseEntity<>("Cash Flow Data Has Been Added", HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getNetCashFlowFromBankingOperations/{bankId}/{year}")
    public ResponseEntity<Long> getNetCashFlowFromBankingOperations(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getNetCashFlowFromBankingOperations(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getCashFlowRelatedToInvestmentActivities/{bankId}/{year}")
    public ResponseEntity<Long> getCashFlowRelatedToInvestmentActivities(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getCashFlowRelatedToInvestmentActivities(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getCashFlowForFinancingPurposes/{bankId}/{year}")
    public ResponseEntity<Long> getCashFlowForFinancingPurposes(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getCashFlowForFinancingPurposes(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getIncreaseInCashAndCashEQ/{bankId}/{year}")
    public ResponseEntity<Long> getIncreaseInCashAndCashEQ(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getIncreaseInCashAndCashEQ(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getDecreaseInCashAndCashEQ/{bankId}/{year}")
    public ResponseEntity<Long> getDecreaseInCashAndCashEQ(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getDecreaseInCashAndCashEQ(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getCashAndCashEqInTheBeginningOfThePeriod/{bankId}/{year}")
    public ResponseEntity<Long> getCashAndCashEqInTheBeginningOfThePeriod(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getCashAndCashEqInTheBeginningOfThePeriod(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getCashAndCashEqInTheEndOfThePeriod/{bankId}/{year}")
    public ResponseEntity<Long> getCashAndCashEqInTheEndOfThePeriod(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getCashAndCashEqInTheEndOfThePeriod(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getDividendPerShare/{bankId}/{year}")
    public ResponseEntity<Long> getDividendPerShare(@PathVariable int bankId, @PathVariable int year){
        long res = cashInterface.getDividendPerShare(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
