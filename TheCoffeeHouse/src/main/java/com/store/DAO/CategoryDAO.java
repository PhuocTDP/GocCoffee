package com.store.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.Category;





public interface CategoryDAO extends JpaRepository<Category, String>{
}
