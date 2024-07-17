package com.onurturkarslan.librarymanagamentsystems.dao;

import com.onurturkarslan.librarymanagamentsystems.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
    List<Book> findByCategoriesCategoryId(int categoryId);
}
