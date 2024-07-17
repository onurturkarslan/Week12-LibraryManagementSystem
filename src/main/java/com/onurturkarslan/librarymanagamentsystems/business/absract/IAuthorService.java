package com.onurturkarslan.librarymanagamentsystems.business.absract;

import com.onurturkarslan.librarymanagamentsystems.entities.Author;

public interface IAuthorService {
    Author save(Author author);
    Author get(int id);
    Author update(Author author);
    boolean delete(int id);
}
