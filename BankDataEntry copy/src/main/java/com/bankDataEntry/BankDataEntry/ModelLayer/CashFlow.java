package com.bankDataEntry.BankDataEntry.ModelLayer;

import jakarta.persistence.*;

@Entity
@Table(name="Cash_Flow")
public class CashFlow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="bank_ID")
    private int bankId;
    @Column(name="year")
    private int year;
    @Column(name="net_Cash_Flow_From_Banking_Operations")
    private long netCashFlowFromBankingOperations;
    @Column(name="cash_Flow_Related_To_Investment_Activities")
    private long cashFlowRelatedToInvestmentActivities;
    @Column(name="cash_Flow_For_Financing_Purposes")
    private long cashFlowForFinancingPurposes;
    @Column(name="increase_In_Cash_And_CashEQ")
    private long increaseInCashAndCashEQ;
    @Column(name="decrease_In_Cash_And_CashEQ")
    private long decreaseInCashAndCashEQ;
    @Column(name="cash_And_Cash_Eq_In_The_Beginning_Of_The_Period")
    private long cashAndCashEqInTheBeginningOfThePeriod;
    @Column(name="cash_And_Cash_Eq_In_The_End_Of_The_Period")
    private long cashAndCashEqInTheEndOfThePeriod;
    @Column(name="dividend_per_share")
    private long dividendPerShare;

    public CashFlow() {}

    public CashFlow(long id, int bankId, int year, long netCashFlowFromBankingOperations, long cashFlowRelatedToInvestmentActivities, long cashFlowForFinancingPurposes, long increaseInCashAndCashEQ, long decreaseInCashAndCashEQ, long cashAndCashEqInTheBeginningOfThePeriod, long cashAndCashEqInTheEndOfThePeriod, long dividendPerShare) {
        this.id = id;
        this.bankId = bankId;
        this.year = year;
        this.netCashFlowFromBankingOperations = netCashFlowFromBankingOperations;
        this.cashFlowRelatedToInvestmentActivities = cashFlowRelatedToInvestmentActivities;
        this.cashFlowForFinancingPurposes = cashFlowForFinancingPurposes;
        this.increaseInCashAndCashEQ = increaseInCashAndCashEQ;
        this.decreaseInCashAndCashEQ = decreaseInCashAndCashEQ;
        this.cashAndCashEqInTheBeginningOfThePeriod = cashAndCashEqInTheBeginningOfThePeriod;
        this.cashAndCashEqInTheEndOfThePeriod = cashAndCashEqInTheEndOfThePeriod;
        this.dividendPerShare = dividendPerShare;
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

    public long getNetCashFlowFromBankingOperations() {
        return netCashFlowFromBankingOperations;
    }

    public void setNetCashFlowFromBankingOperations(long netCashFlowFromBankingOperations) {
        this.netCashFlowFromBankingOperations = netCashFlowFromBankingOperations;
    }

    public long getCashFlowRelatedToInvestmentActivities() {
        return cashFlowRelatedToInvestmentActivities;
    }

    public void setCashFlowRelatedToInvestmentActivities(long cashFlowRelatedToInvestmentActivities) {
        this.cashFlowRelatedToInvestmentActivities = cashFlowRelatedToInvestmentActivities;
    }

    public long getCashFlowForFinancingPurposes() {
        return cashFlowForFinancingPurposes;
    }

    public void setCashFlowForFinancingPurposes(long cashFlowForFinancingPurposes) {
        this.cashFlowForFinancingPurposes = cashFlowForFinancingPurposes;
    }

    public long getIncreaseInCashAndCashEQ() {
        return increaseInCashAndCashEQ;
    }

    public void setIncreaseInCashAndCashEQ(long increaseInCashAndCashEQ) {
        this.increaseInCashAndCashEQ = increaseInCashAndCashEQ;
    }

    public long getDecreaseInCashAndCashEQ() {
        return decreaseInCashAndCashEQ;
    }

    public void setDecreaseInCashAndCashEQ(long decreaseInCashAndCashEQ) {
        this.decreaseInCashAndCashEQ = decreaseInCashAndCashEQ;
    }

    public long getCashAndCashEqInTheBeginningOfThePeriod() {
        return cashAndCashEqInTheBeginningOfThePeriod;
    }

    public void setCashAndCashEqInTheBeginningOfThePeriod(long cashAndCashEqInTheBeginningOfThePeriod) {
        this.cashAndCashEqInTheBeginningOfThePeriod = cashAndCashEqInTheBeginningOfThePeriod;
    }

    public long getCashAndCashEqInTheEndOfThePeriod() {
        return cashAndCashEqInTheEndOfThePeriod;
    }

    public void setCashAndCashEqInTheEndOfThePeriod(long cashAndCashEqInTheEndOfThePeriod) {
        this.cashAndCashEqInTheEndOfThePeriod = cashAndCashEqInTheEndOfThePeriod;
    }

    public long getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(long dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }
}
