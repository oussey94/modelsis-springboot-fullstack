package com.ousseynou.mbodji.backendmodelsis.repository;

import com.ousseynou.mbodji.backendmodelsis.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
