package com.onurturkarslan.librarymanagamentsystems.business.absract;

import com.onurturkarslan.librarymanagamentsystems.entities.Book;

public interface IBookService {
    Book save(Book book);
    Book get(int id);
    Book update(Book book);
    boolean delete(int id);
}
