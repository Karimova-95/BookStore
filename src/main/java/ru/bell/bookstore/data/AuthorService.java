package ru.bell.bookstore.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Map<String, List<Author>> getAuthorsData() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setFirstName(rs.getString("first_name"));
            author.setLastName(rs.getString("last_name"));
            return author;
        });
        Collections.sort(authors);
        return authors.stream().collect(Collectors.groupingBy((Author a) -> a.getLastName().substring(0, 1).toUpperCase()));
    }
}
