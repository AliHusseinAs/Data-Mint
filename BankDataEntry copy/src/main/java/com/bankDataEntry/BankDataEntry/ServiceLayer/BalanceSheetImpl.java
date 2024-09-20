package com.bankDataEntry.BankDataEntry.ServiceLayer;


import com.bankDataEntry.BankDataEntry.ModelLayer.BalanceSheet;
import com.bankDataEntry.BankDataEntry.RepositoryLayer.RepoBalanceSheet;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BalanceSheetImpl implements BalanceSheetInterface{

    private RepoBalanceSheet repoBalanceSheet;

    public BalanceSheetImpl(RepoBalanceSheet repoBalanceSheet) {
        this.repoBalanceSheet = repoBalanceSheet;
    }

    @Override
    public void removeBankingData(Long id) {
        repoBalanceSheet.deleteById(id);
    }

    @Override
    public void addBankingData(BalanceSheet balanceSheet) {
        repoBalanceSheet.save(balanceSheet);
    }

    @Override
    public Long getCashAndCashEq(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getCashAndCashEq).orElse(-1L);
    }

    @Override
    public long getBonds(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getBonds).orElse(-1L);
    }

    @Override
    public long getLoans(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getLoans).orElse(-1L);
    }

    @Override
    public long getLoansInForeignCurrency(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getLoansInForeignCurrency).orElse(-1L);
    }

    @Override
    public long getTangibleAssets(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getTangibleAssets).orElse(-1L);
    }

    @Override
    public long getRealEstateForInvestmentPurposes(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getRealEstateForInvestmentPurposes).orElse(-1L);
    }

    @Override
    public long getTotalAssets(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getTotalAssets).orElse(-1L);
    }

    @Override
    public long getBanksOwnBonds(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getBanksOwnBonds).orElse(-1L);
    }

    @Override
    public long getDebtProducts(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getDebtProducts).orElse(-1L);
    }

    @Override
    public long getNpl(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getNpl).orElse(-1L);
    }

    @Override
    public long getTotalLiabilities(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getTotalLiabilities).orElse(-1L);
    }

    @Override
    public long getTotalDeposits(int bankId, int year) {
        Optional<BalanceSheet> balanceS = repoBalanceSheet.findByBankIdAndYear(bankId, year);
        return balanceS.map(BalanceSheet :: getTotalDeposits).orElse(-1L);
    }
}
