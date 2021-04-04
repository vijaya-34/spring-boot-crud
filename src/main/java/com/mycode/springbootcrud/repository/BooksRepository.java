package com.mycode.springbootcrud.repository;

import com.mycode.springbootcrud.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {
}
