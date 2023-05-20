package com.example.demo1.repository;

import com.example.demo1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRepository extends JpaRepository <Book, Long> {
}