package com.bankDataEntry.BankDataEntry.ControllerLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.BalanceSheet;
import com.bankDataEntry.BankDataEntry.ServiceLayer.BalanceSheetInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BalanceSheetController {
    private BalanceSheetInterface balanceInterface;

    public BalanceSheetController(BalanceSheetInterface balanceInterface) {
        this.balanceInterface = balanceInterface;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping("/api/public/removeBalanceSheet/{id}")
    public ResponseEntity<String> removeBankingData(@PathVariable Long id){
        balanceInterface.removeBankingData(id);
        return new ResponseEntity<>("Balance Sheet Data Deleted", HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping("/api/public/addBalanceSheet")
    public ResponseEntity<String> addBankingData(@RequestBody BalanceSheet balanceSheet){
        balanceInterface.addBankingData(balanceSheet);
        return new ResponseEntity<>("Balance Sheet Data Added", HttpStatus.CREATED);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getCashAndCashEq/{bankId}/{year}")
    public ResponseEntity<Long> getCashAndCashEq(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getCashAndCashEq(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getBonds/{bankId}/{year}")
    public ResponseEntity<Long> getBonds(@PathVariable int bankId, @PathVariable int year){
       long res = balanceInterface.getBonds(bankId, year);
       return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getLoans/{bankId}/{year}")
    public ResponseEntity<Long> getLoans(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getLoans(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getLoansInForeignCurrency/{bankId}/{year}")
    public ResponseEntity<Long> getLoansInForeignCurrency(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getLoansInForeignCurrency(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getTangibleAssets/{bankId}/{year}")
    public ResponseEntity<Long> getTangibleAssets(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getTangibleAssets(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getRealEstateForInvestmentPurposes/{bankId}/{year}")
    public ResponseEntity<Long> getRealEstateForInvestmentPurposes(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getRealEstateForInvestmentPurposes(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getTotalAssets/{bankId}/{year}")
    public ResponseEntity<Long> getTotalAssets(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getTotalAssets(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getBanksOwnBonds/{bankId}/{year}")
    public ResponseEntity<Long> getBanksOwnBonds(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getBanksOwnBonds(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getDebtProducts/{bankId}/{year}")
    public ResponseEntity<Long> getDebtProducts(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getDebtProducts(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getNpl/{bankId}/{year}")
    public ResponseEntity<Long> getNpl(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getNpl(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getTotalLiabilities/{bankId}/{year}")
    public ResponseEntity<Long> getTotalLiabilities(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getTotalLiabilities(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/api/public/getTotalDeposits/{bankId}/{year}")
    public ResponseEntity<Long> getTotalDeposits(@PathVariable int bankId, @PathVariable int year){
        long res = balanceInterface.getTotalDeposits(bankId, year);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

}
