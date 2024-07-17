package com.onurturkarslan.librarymanagamentsystems.business.absract;

import com.onurturkarslan.librarymanagamentsystems.entities.Category;

public interface ICategoryService {
    Category save(Category category);
    Category get(int id);
    Category update(Category category);
    String delete(int id);
}
