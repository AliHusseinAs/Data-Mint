package com.bankDataEntry.BankDataEntry.ModelLayer;

import jakarta.persistence.*;

@Entity
@Table(name="income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="bank_Id")
    private int bankId;
    @Column(name="year")
    private int year;
    @Column(name="interest_income")
    private long interestIncome;
    @Column(name="interest_income_from_loans")
    private long interestIncomeFromLoans;
    @Column(name="interest_from_securities")
    private long interestFromSecurities;
    @Column(name="interest_expense")
    private long interestExpense;
    @Column(name="interest_to_deposits")
    private long interestToDeposits;
    @Column(name="interest_payments_to_used_loans")
    private long interestPaymentsToUsedLoans;
    @Column(name="net_interest_income")
    private long netInterestIncome;
    @Column(name="non_interest_income")
    private long nonInterestIncome;
    @Column(name="net_total_income")
    private long netTotalIncome;
    @Column(name="earnings_per_share")
    private long earningsPerShare;

    public Income() {}

    public Income(long id, int bankId, int year, long interestIncome, long interestIncomeFromLoans, long interestFromSecurities, long interestExpense, long interestToDeposits, long interestPaymentsToUsedLoans, long netInterestIncome, long nonInterestIncome, long netTotalIncome, long earningsPerShare) {
        this.id = id;
        this.bankId = bankId;
        this.year = year;
        this.interestIncome = interestIncome;
        this.interestIncomeFromLoans = interestIncomeFromLoans;
        this.interestFromSecurities = interestFromSecurities;
        this.interestExpense = interestExpense;
        this.interestToDeposits = interestToDeposits;
        this.interestPaymentsToUsedLoans = interestPaymentsToUsedLoans;
        this.netInterestIncome = netInterestIncome;
        this.nonInterestIncome = nonInterestIncome;
        this.netTotalIncome = netTotalIncome;
        this.earningsPerShare = earningsPerShare;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getInterestIncome() {
        return interestIncome;
    }

    public void setInterestIncome(long interestIncome) {
        this.interestIncome = interestIncome;
    }

    public long getInterestIncomeFromLoans() {
        return interestIncomeFromLoans;
    }

    public void setInterestIncomeFromLoans(long interestIncomeFromLoans) {
        this.interestIncomeFromLoans = interestIncomeFromLoans;
    }

    public long getInterestFromSecurities() {
        return interestFromSecurities;
    }

    public void setInterestFromSecurities(long interestFromSecurities) {
        this.interestFromSecurities = interestFromSecurities;
    }

    public long getInterestExpense() {
        return interestExpense;
    }

    public void setInterestExpense(long interestExpense) {
        this.interestExpense = interestExpense;
    }

    public long getInterestToDeposits() {
        return interestToDeposits;
    }

    public void setInterestToDeposits(long interestToDeposits) {
        this.interestToDeposits = interestToDeposits;
    }

    public long getInterestPaymentsToUsedLoans() {
        return interestPaymentsToUsedLoans;
    }

    public void setInterestPaymentsToUsedLoans(long interestPaymentsToUsedLoans) {
        this.interestPaymentsToUsedLoans = interestPaymentsToUsedLoans;
    }

    public long getNetInterestIncome() {
        return netInterestIncome;
    }

    public void setNetInterestIncome(long netInterestIncome) {
        this.netInterestIncome = netInterestIncome;
    }

    public long getNonInterestIncome() {
        return nonInterestIncome;
    }

    public void setNonInterestIncome(long nonInterestIncome) {
        this.nonInterestIncome = nonInterestIncome;
    }

    public long getNetTotalIncome() {
        return netTotalIncome;
    }

    public void setNetTotalIncome(long netTotalIncome) {
        this.netTotalIncome = netTotalIncome;
    }

    public long getEarningsPerShare() {
        return earningsPerShare;
    }

    public void setEarningsPerShare(long earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }
}
