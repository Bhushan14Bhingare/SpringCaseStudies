package com.bhushan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.entity.Projects;

public interface IProjectRepository extends JpaRepository<Projects, Integer> {

}
