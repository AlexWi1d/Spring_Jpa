package com.jaycodes.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaycodes.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
