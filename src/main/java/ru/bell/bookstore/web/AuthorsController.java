package ru.bell.bookstore.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bell.bookstore.data.Author;
import ru.bell.bookstore.data.AuthorService;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorsController {

    private final AuthorService authorService;

    @ModelAttribute("authorsData")
    public Map<String, List<Author>> getAuthors() {
        return authorService.getAuthorsData();
    }
    @GetMapping("")
    public String getAuthorsPage() {
        return "/authors/index";
    }

    @GetMapping("/slug")
    public String getAuthorsSlug() {
        return "/authors/slug";
    }
}
