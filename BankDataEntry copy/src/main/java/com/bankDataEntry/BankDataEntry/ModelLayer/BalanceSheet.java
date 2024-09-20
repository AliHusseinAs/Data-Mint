package com.bankDataEntry.BankDataEntry.ModelLayer;

import jakarta.persistence.*;

@Entity
@Table(name="Balance_Sheet")
public class BalanceSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "bank_ID")
    private int bankId;
    @Column(name="year")
    private int year;
    @Column(name="Cash_And_CashEQ")
    private long cashAndCashEq;
    @Column(name="bonds")
    private long bonds;
    @Column(name="loans")
    private long loans;
    @Column(name="loans_in_foreign_currency")
    private long loansInForeignCurrency;
    @Column(name="tangible_assets")
    private long tangibleAssets;
    @Column(name="real_estate_for_investment_purposes")
    private long realEstateForInvestmentPurposes;
    @Column(name="total_assets")
    private long totalAssets;
    @Column(name="banks_own_bonds")
    private long banksOwnBonds;
    @Column(name="debt_products")
    private long debtProducts;
    @Column(name="npl")
    private long npl;
    @Column(name="totalLiabilities")
    private long totalLiabilities;
    @Column(name="total_deposits")
    private long totalDeposits;

    public BalanceSheet() {}

    public BalanceSheet(long id, int bankId, int year, long cashAndCashEq, long bonds, long loans, long loansInForeignCurrency, long tangibleAssets, long realEstateForInvestmentPurposes, long totalAssets, long banksOwnBonds, long debtProducts, long npl, long totalLiabilities, long totalDeposits) {
        this.id = id;
        this.bankId = bankId;
        this.year = year;
        this.cashAndCashEq = cashAndCashEq;
        this.bonds = bonds;
        this.loans = loans;
        this.loansInForeignCurrency = loansInForeignCurrency;
        this.tangibleAssets = tangibleAssets;
        this.realEstateForInvestmentPurposes = realEstateForInvestmentPurposes;
        this.totalAssets = totalAssets;
        this.banksOwnBonds = banksOwnBonds;
        this.debtProducts = debtProducts;
        this.npl = npl;
        this.totalLiabilities = totalLiabilities;
        this.totalDeposits = totalDeposits;
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

    public long getCashAndCashEq() {
        return cashAndCashEq;
    }

    public void setCashAndCashEq(long cashAndCashEq) {
        this.cashAndCashEq = cashAndCashEq;
    }

    public long getBonds() {
        return bonds;
    }

    public void setBonds(long bonds) {
        this.bonds = bonds;
    }

    public long getLoans() {
        return loans;
    }

    public void setLoans(long loans) {
        this.loans = loans;
    }

    public long getLoansInForeignCurrency() {
        return loansInForeignCurrency;
    }

    public void setLoansInForeignCurrency(long loansInForeignCurrency) {
        this.loansInForeignCurrency = loansInForeignCurrency;
    }

    public long getTangibleAssets() {
        return tangibleAssets;
    }

    public void setTangibleAssets(long tangibleAssets) {
        this.tangibleAssets = tangibleAssets;
    }

    public long getRealEstateForInvestmentPurposes() {
        return realEstateForInvestmentPurposes;
    }

    public void setRealEstateForInvestmentPurposes(long realEstateForInvestmentPurposes) {
        this.realEstateForInvestmentPurposes = realEstateForInvestmentPurposes;
    }

    public long getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(long totalAssets) {
        this.totalAssets = totalAssets;
    }

    public long getBanksOwnBonds() {
        return banksOwnBonds;
    }

    public void setBanksOwnBonds(long banksOwnBonds) {
        this.banksOwnBonds = banksOwnBonds;
    }

    public long getDebtProducts() {
        return debtProducts;
    }

    public void setDebtProducts(long debtProducts) {
        this.debtProducts = debtProducts;
    }

    public long getNpl() {
        return npl;
    }

    public void setNpl(long npl) {
        this.npl = npl;
    }

    public long getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(long totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public long getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(long totalDeposits) {
        this.totalDeposits = totalDeposits;
    }
}
