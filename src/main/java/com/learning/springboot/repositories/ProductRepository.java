package com.learning.springboot.repositories;

import com.learning.springboot.models.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("FROM Product ")
    List<Product> findAllProducts();

    @Query("FROM Product WHERE id = :id")
    Optional<Product> findByProductId(@Param("id") Long id);

    @Query("FROM Product WHERE productName = :productName")
    List<Product> findByProductName(@Param("productName") String productName);

    @Modifying
    @Transactional
    @Query("DELETE FROM Product WHERE id = :id")
    void deleteProductById(@Param("id") Long id);

    @Query("SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM Product p where p.id = :id")
    boolean existsById(@Param("id") @NonNull Long id);
}
