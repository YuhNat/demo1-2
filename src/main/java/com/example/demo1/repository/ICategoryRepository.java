package com.example.demo1.repository;

import com.example.demo1.entity.Book;
import com.example.demo1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ICategoryRepository extends JpaRepository <Category, Long> {
}
