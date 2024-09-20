package com.bankDataEntry.BankDataEntry.ServiceLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.CashFlow;
import com.bankDataEntry.BankDataEntry.RepositoryLayer.RepoCashFlow;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CashFlowImpl implements CashFlowInterface{

    private RepoCashFlow repoCashFlow;

    public CashFlowImpl(RepoCashFlow repoCashFlow) {
        this.repoCashFlow = repoCashFlow;
    }

    @Override
    public void removeBankingCashFlow(Long id) {
        repoCashFlow.deleteById(id);
    }

    @Override
    public void addBankingCashFlowData(CashFlow cashFlow) {
        repoCashFlow.save(cashFlow);
    }

    @Override
    public long getNetCashFlowFromBankingOperations(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getNetCashFlowFromBankingOperations).orElse(-1L);
    }

    @Override
    public long getCashFlowRelatedToInvestmentActivities(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getCashFlowRelatedToInvestmentActivities).orElse(-1L);
    }

    @Override
    public long getCashFlowForFinancingPurposes(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getCashFlowForFinancingPurposes).orElse(-1L);
    }

    @Override
    public long getIncreaseInCashAndCashEQ(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getIncreaseInCashAndCashEQ).orElse(-1L);
    }

    @Override
    public long getDecreaseInCashAndCashEQ(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getDecreaseInCashAndCashEQ).orElse(-1L);
    }

    @Override
    public long getCashAndCashEqInTheBeginningOfThePeriod(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getCashAndCashEqInTheBeginningOfThePeriod).orElse(-1L);
    }

    @Override
    public long getCashAndCashEqInTheEndOfThePeriod(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getCashAndCashEqInTheEndOfThePeriod).orElse(-1L);
    }

    @Override
    public long getDividendPerShare(int bankId, int year) {
        Optional<CashFlow> cashFlow = repoCashFlow.findByBankIdAndYear(bankId, year);
        return cashFlow.map(CashFlow :: getDividendPerShare).orElse(-1L);
    }
}
