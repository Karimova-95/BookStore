package ru.bell.bookstore.data;

import lombok.Data;

@Data
public class Author implements Comparable<Author>{
    private Integer id;
    private String name;

    @Override
    public int compareTo(Author o) {
        return this.name.compareTo(o.name);
    }
}
