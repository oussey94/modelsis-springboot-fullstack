package com.ousseynou.mbodji.backendmodelsis.repository;

import com.ousseynou.mbodji.backendmodelsis.entities.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeProductRepository extends JpaRepository<ProductType, Long> {
}
