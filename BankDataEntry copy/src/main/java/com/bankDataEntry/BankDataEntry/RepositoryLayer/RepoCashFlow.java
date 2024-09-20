package com.bankDataEntry.BankDataEntry.RepositoryLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.CashFlow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoCashFlow extends JpaRepository<CashFlow, Long> {
    Optional<CashFlow> findByBankIdAndYear(Integer bankId, Integer year);
}
