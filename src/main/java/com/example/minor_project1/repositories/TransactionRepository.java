package com.example.minor_project1.repositories;

import com.example.minor_project1.model.Book;
import com.example.minor_project1.model.Student;
import com.example.minor_project1.model.Transaction;
import com.example.minor_project1.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer > {

    Transaction findTopByStudentAndBookAndTransactionTypeOrderByIdDesc(Student student, Book book, TransactionType transactionType);
}
