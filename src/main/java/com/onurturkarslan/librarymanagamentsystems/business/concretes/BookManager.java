package com.onurturkarslan.librarymanagamentsystems.business.concretes;

import com.onurturkarslan.librarymanagamentsystems.business.absract.IBookService;
import com.onurturkarslan.librarymanagamentsystems.core.exception.NotFoundException;
import com.onurturkarslan.librarymanagamentsystems.core.utilies.Msg;
import com.onurturkarslan.librarymanagamentsystems.dao.BookRepo;
import com.onurturkarslan.librarymanagamentsystems.dao.CategoryRepo;
import com.onurturkarslan.librarymanagamentsystems.entities.Book;
import com.onurturkarslan.librarymanagamentsystems.entities.Category;
import org.springframework.stereotype.Service;

@Service
public class BookManager implements IBookService {
    private final BookRepo bookRepo;
    private final CategoryRepo categoryRepo;
    public BookManager(BookRepo bookRepo, CategoryRepo categoryRepo) {
        this.bookRepo = bookRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Book save(Book book) {
        Book savedBook = this.bookRepo.save(book);
        // Kategorileri kaydedin
        for (Category category : book.getCategories()) {
            category.getBooks().add(savedBook);
            categoryRepo.save(category);
        }
        return savedBook;
    }

    @Override
    public Book get(int id) {
        return this.bookRepo.findById(id).orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND));
    }

    @Override
    public Book update(Book book) {
        Book existingBook = this.bookRepo.findById(book.getBookId())
                .orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND));

        // Mevcut borrowings koleksiyonunu koruyun
        if (book.getBorrowings() == null) {
            book.setBorrowings(existingBook.getBorrowings());
        }

        return this.bookRepo.save(book);
    }


    @Override
    public boolean delete(int id) {
        Book book = this.get(id);
        bookRepo.delete(book);
        return true;
    }
}