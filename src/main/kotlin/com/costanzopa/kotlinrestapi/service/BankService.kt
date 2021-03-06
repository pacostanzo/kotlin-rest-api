package com.costanzopa.kotlinrestapi.service

import com.costanzopa.kotlinrestapi.model.Bank
import com.costanzopa.kotlinrestapi.repository.impl.BankMockRepository
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class BankService(@Qualifier("mock") private val repository: BankMockRepository) {
    fun getAll(): Collection<Bank> = repository.getAll()
    fun getById(accountNumber: String): Bank = repository.getById(accountNumber)
    fun create(bank: Bank): Bank = repository.create(bank)
    fun update(bank: Bank): Bank = repository.update(bank)
    fun deleteById(accountNumber: String): Unit = repository.deleteById(accountNumber)

}