package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.exam.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
