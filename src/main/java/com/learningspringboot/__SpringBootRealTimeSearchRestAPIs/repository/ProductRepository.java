package com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.repository;

import com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE "+
            "p.name LIKE CONCAT('%', :query, '%') "+
            "OR p.description LIKE CONCAT('%', :query, '%')"
    )
    List<Product> searchProducts(String query);

//    @Query(value = "SELECT * FROM products p WHERE"+
//            "p.name LIKE CONCAT('%', :query, '%')"+
//            "Or p.description LIKE CONCAT('%', :query, '%')",
//              nativeQuery=true
//    )
//    List<Product> searchProductSql(String query);
}
