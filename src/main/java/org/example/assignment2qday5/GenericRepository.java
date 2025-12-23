package org.example.assignment2qday5;

import java.util.ArrayList;
import java.util.List;

// 3. GENERIC REPOSITORY
class GenericRepository<T> {

    private List<T> data = new ArrayList<>();

    void save(T item) {
        data.add(item);
    }

    List<T> findAll() {
        return data;
    }
}
