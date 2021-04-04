package com.mycode.springbootcrud.service;

import com.mycode.springbootcrud.model.Books;
import com.mycode.springbootcrud.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }

    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }

    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }

    public void delete(int bookid) {
        booksRepository.deleteById(bookid);
    }
}
