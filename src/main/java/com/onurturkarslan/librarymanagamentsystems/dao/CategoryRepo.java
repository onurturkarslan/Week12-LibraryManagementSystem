package com.onurturkarslan.librarymanagamentsystems.dao;

import com.onurturkarslan.librarymanagamentsystems.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
