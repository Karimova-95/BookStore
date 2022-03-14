package ru.bell.bookstore.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAuthorsDataA() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'A%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataB() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'B%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataC() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'C%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataD() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'D%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataE() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'E%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataF() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'F%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataG() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'G%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataH() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'H%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataI() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'I%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataJ() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'J%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataK() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'K%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataL() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'L%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataM() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'M%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataN() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'N%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataO() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'O%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataP() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'P%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataQ() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'Q%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataR() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'R%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataS() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'S%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataT() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'T%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataU() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'U%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataV() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'V%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataW() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'W%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataX() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'X%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataY() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'Y%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }

    public List<Author> getAuthorsDataZ() {
        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors WHERE name LIKE 'Z%'", (ResultSet rs, int row) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setName(rs.getString("name"));
            return author;
        }); 
        return new ArrayList<Author>(authors);
    }
}
