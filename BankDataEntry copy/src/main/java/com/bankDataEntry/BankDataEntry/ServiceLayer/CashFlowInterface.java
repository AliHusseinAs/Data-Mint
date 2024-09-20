package com.bankDataEntry.BankDataEntry.ServiceLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.CashFlow;
import jakarta.persistence.Column;

public interface CashFlowInterface {
    void removeBankingCashFlow(Long id);
    void addBankingCashFlowData(CashFlow cashFlow);
    long getNetCashFlowFromBankingOperations(int bankId, int year);
    long getCashFlowRelatedToInvestmentActivities(int bankId, int year);
    long getCashFlowForFinancingPurposes(int bankId, int year);
    long getIncreaseInCashAndCashEQ(int bankId, int year);
    long getDecreaseInCashAndCashEQ(int bankId, int year);
    long getCashAndCashEqInTheBeginningOfThePeriod(int bankId, int year);
    long getCashAndCashEqInTheEndOfThePeriod(int bankId, int year);
    long getDividendPerShare(int bankId, int year);
}
