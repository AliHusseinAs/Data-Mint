package com.bankDataEntry.BankDataEntry.ServiceLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.Income;
import jakarta.persistence.Column;

public interface IncomeInterface {
    void deleteBankingIncomeData(Long id);
    void addBankingIncomeData(Income income);
    long getInterestIncome(int bankId, int year);
    long getInterestFromSecurities(int bankId, int year);
    long getInterestExpense(int bankId, int year);
    long getInterestToDeposits(int bankId, int year);
    long getInterestPaymentsToUsedLoans(int bankId, int year);
    long getNetInterestIncome(int bankId, int year);
    long getNonInterestIncome(int bankId, int year);
    long getNetTotalIncome(int bankId, int year);
    long getEarningsPerShare(int bankId, int year);
}
