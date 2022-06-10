package com.springframework.Spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.springframework.Spring5webapp.Books;

public interface BookRepository extends CrudRepository<Books, Long>  {

}
