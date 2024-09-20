package com.bankDataEntry.BankDataEntry.ServiceLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.Income;
import com.bankDataEntry.BankDataEntry.RepositoryLayer.RepoIncome;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IncomeImpl implements IncomeInterface{
    private final RepoIncome repoIncome;

    public IncomeImpl(RepoIncome repoIncome) {
        this.repoIncome = repoIncome;
    }

    @Override
    public void deleteBankingIncomeData(Long id) {
        repoIncome.deleteById(id);
        // the UI of this will be a new page were user will be able to see what
        // data was added and has a button { delete } once clicked the data all is deleted
        // but, if I'll use it then no need for extra page, a delete request via postman
        // and it will work fine
    }

    @Override
    public void addBankingIncomeData(Income income) {
        repoIncome.save(income);
    }

    @Override
    public long getInterestIncome(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getInterestIncome).orElse(-1L);
    }

    @Override
    public long getInterestFromSecurities(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getInterestFromSecurities).orElse(-1L);
    }

    @Override
    public long getInterestExpense(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getInterestExpense).orElse(-1L);
    }

    @Override
    public long getInterestToDeposits(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getInterestToDeposits).orElse(-1L);
    }

    @Override
    public long getInterestPaymentsToUsedLoans(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getInterestPaymentsToUsedLoans).orElse(-1L);
    }

    @Override
    public long getNetInterestIncome(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getNetInterestIncome).orElse(-1L);
    }

    @Override
    public long getNonInterestIncome(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getNonInterestIncome).orElse(-1L);
    }

    @Override
    public long getNetTotalIncome(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getNetTotalIncome).orElse(-1L);
    }

    @Override
    public long getEarningsPerShare(int bankId, int year) {
        Optional<Income> income = repoIncome.findByBankIdAndYear(bankId, year);
        return income.map(Income :: getEarningsPerShare).orElse(-1L);
    }
}
