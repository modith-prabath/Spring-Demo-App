package com.springframework.Spring5webapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.springframework.Spring5webapp.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
