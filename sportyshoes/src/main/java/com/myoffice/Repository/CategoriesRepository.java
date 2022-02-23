package com.myoffice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myoffice.Entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
