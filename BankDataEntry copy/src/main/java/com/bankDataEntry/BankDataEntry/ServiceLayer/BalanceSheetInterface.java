package com.bankDataEntry.BankDataEntry.ServiceLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.BalanceSheet;

import java.util.spi.LocaleNameProvider;


public interface BalanceSheetInterface {

    void removeBankingData(Long id);
    void addBankingData(BalanceSheet balanceSheet);
    Long getCashAndCashEq(int bankId, int year);
    long getBonds(int bankId, int year);
    long getLoans(int bankId, int year);
    long getLoansInForeignCurrency(int bankId, int year);
    long getTangibleAssets(int bankId, int year);
    long getRealEstateForInvestmentPurposes(int bankId, int year);
    long getTotalAssets(int bankId, int year);
    long getBanksOwnBonds(int bankId, int year);
    long getDebtProducts(int bankId, int year);
    long getNpl(int bankId, int year);
    long getTotalLiabilities(int bankId, int year);
    long getTotalDeposits(int bankId, int year);
}
