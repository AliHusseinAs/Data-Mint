package com.bankDataEntry.BankDataEntry.RepositoryLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.BalanceSheet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoBalanceSheet extends JpaRepository<BalanceSheet, Long> {
    Optional<BalanceSheet> findByBankIdAndYear(Integer bankId, Integer year);
}
