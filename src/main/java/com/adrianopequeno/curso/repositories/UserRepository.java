package com.adrianopequeno.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianopequeno.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
