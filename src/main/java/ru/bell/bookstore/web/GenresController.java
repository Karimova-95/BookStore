package ru.bell.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genres")
public class GenresController {

    @GetMapping("")
    public String getGenres() {
        return "/genres/index";
    }
}
