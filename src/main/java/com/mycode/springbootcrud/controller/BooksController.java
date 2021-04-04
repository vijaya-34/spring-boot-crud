package com.mycode.springbootcrud.controller;

import com.mycode.springbootcrud.model.Books;
import com.mycode.springbootcrud.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/books")
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @PostMapping("/books")
    public int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    @GetMapping("/books/{bookid}")
    public Books getBook(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }

    @PutMapping("/books")
    public Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }

    @DeleteMapping("/books/{bookid}")
    public void deleteBook(@PathVariable("bookid") int bookid) {
        booksService.delete(bookid);
    }

}
