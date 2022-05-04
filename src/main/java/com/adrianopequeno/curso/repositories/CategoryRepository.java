package com.adrianopequeno.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianopequeno.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
