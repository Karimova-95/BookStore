package ru.bell.bookstore.data;

import lombok.Data;

@Data
public class Author implements Comparable<Author> {

    private Integer id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Author o) {
        return this.getLastName().compareTo(o.getLastName());
    }
}
