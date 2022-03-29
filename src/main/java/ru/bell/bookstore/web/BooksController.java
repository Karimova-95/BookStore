package ru.bell.bookstore.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bell.bookstore.data.Book;
import ru.bell.bookstore.data.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {

    private final BookService bookService;

    @GetMapping("/recent")
    public String getRecentBooks(){
        return  "/books/recent";
    }

    @ModelAttribute("booksList")
    public List<Book> bookList(){
        return bookService.getBooksData();
    }
    @GetMapping("/popular")
    public String recentBookPage(){
        return "books/popular";
    }
}
