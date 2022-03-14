package ru.bell.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bell.bookstore.data.AuthorService;
import ru.bell.bookstore.data.BookService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/bookshop")
public class MainPageController {

    private final BookService bookService;
    private final AuthorService authorService;

    @Autowired
    public MainPageController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("bookData", bookService.getBooksData());
        model.addAttribute("searchPlaceholder", "new search placeholder");
        model.addAttribute("serverTime", new Date());
        model.addAttribute("placeholderTextPart2", "SERVER");
        model.addAttribute("messageTemplate", "searchbar.placeholder2");
        return "index";
    }

    @GetMapping("/genres")
    public String getGenres() {
        return "/genres/index";
    }

    @GetMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authorDataA", authorService.getAuthorsDataA());
        model.addAttribute("authorDataB", authorService.getAuthorsDataB());
        model.addAttribute("authorDataC", authorService.getAuthorsDataC());
        model.addAttribute("authorDataD", authorService.getAuthorsDataD());
        model.addAttribute("authorDataE", authorService.getAuthorsDataE());
        model.addAttribute("authorDataF", authorService.getAuthorsDataF());
        model.addAttribute("authorDataG", authorService.getAuthorsDataG());
        model.addAttribute("authorDataH", authorService.getAuthorsDataH());
        model.addAttribute("authorDataI", authorService.getAuthorsDataI());
        model.addAttribute("authorDataJ", authorService.getAuthorsDataJ());
        model.addAttribute("authorDataK", authorService.getAuthorsDataK());
        model.addAttribute("authorDataL", authorService.getAuthorsDataL());
        model.addAttribute("authorDataM", authorService.getAuthorsDataM());
        model.addAttribute("authorDataN", authorService.getAuthorsDataN());
        model.addAttribute("authorDataO", authorService.getAuthorsDataO());
        model.addAttribute("authorDataP", authorService.getAuthorsDataP());
        model.addAttribute("authorDataQ", authorService.getAuthorsDataQ());
        model.addAttribute("authorDataR", authorService.getAuthorsDataR());
        model.addAttribute("authorDataS", authorService.getAuthorsDataS());
        model.addAttribute("authorDataT", authorService.getAuthorsDataT());
        model.addAttribute("authorDataU", authorService.getAuthorsDataU());
        model.addAttribute("authorDataV", authorService.getAuthorsDataV());
        model.addAttribute("authorDataW", authorService.getAuthorsDataW());
        model.addAttribute("authorDataX", authorService.getAuthorsDataX());
        model.addAttribute("authorDataY", authorService.getAuthorsDataY());
        model.addAttribute("authorDataZ", authorService.getAuthorsDataZ());
        return "/authors/index";
    }
}
