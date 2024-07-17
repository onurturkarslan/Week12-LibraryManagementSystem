package com.onurturkarslan.librarymanagamentsystems.dao;

import com.onurturkarslan.librarymanagamentsystems.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
}
