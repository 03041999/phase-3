package com.myoffice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myoffice.Entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
