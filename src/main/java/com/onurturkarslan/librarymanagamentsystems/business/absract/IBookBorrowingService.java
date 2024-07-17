package com.onurturkarslan.librarymanagamentsystems.business.absract;

import com.onurturkarslan.librarymanagamentsystems.entities.BookBorrowing;

public interface IBookBorrowingService {
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing get(int id);
    BookBorrowing update(BookBorrowing bookBorrowing);
    boolean delete(int id);
}
