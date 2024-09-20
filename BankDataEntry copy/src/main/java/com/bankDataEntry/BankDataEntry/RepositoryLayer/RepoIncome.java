package com.bankDataEntry.BankDataEntry.RepositoryLayer;

import com.bankDataEntry.BankDataEntry.ModelLayer.Income;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoIncome extends JpaRepository<Income, Long> {
    Optional<Income> findByBankIdAndYear(Integer bankId, Integer year);
}
