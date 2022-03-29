package ru.bell.bookstore.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.bell.bookstore.data.AuthorService;
import ru.bell.bookstore.data.Book;
import ru.bell.bookstore.data.BookService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainPageController {

    private final BookService bookService;

    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks() {
        return bookService.getBooksData();
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/cart")
    public String getCart() {
        return "cart";
    }

    @GetMapping("/postponed")
    public String getPostponed() {
        return "postponed";
    }

    @GetMapping("/signin")
    public String signIn() {
        return "signin";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }

    @GetMapping("/documents")
    public String getDocuments() {
        return "documents/index";
    }

    @GetMapping("/documents/slug")
    public String getDocumentsSlug() {
        return "documents/slug";
    }

    @GetMapping("/search")
    public String search() {
        return "search/index";
    }

    @GetMapping("/faq")
    public String getFaq() {
        return "faq";
    }

    @GetMapping("/contacts")
    public String getContacts() {
        return "contacts";
    }
}
