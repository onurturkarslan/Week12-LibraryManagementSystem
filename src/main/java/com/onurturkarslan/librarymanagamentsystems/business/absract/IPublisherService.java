package com.onurturkarslan.librarymanagamentsystems.business.absract;

import com.onurturkarslan.librarymanagamentsystems.entities.Publisher;

public interface IPublisherService {
    Publisher save(Publisher publisher);
    Publisher get(int id);
    Publisher update(Publisher publisher);
    boolean delete(int id);
}
