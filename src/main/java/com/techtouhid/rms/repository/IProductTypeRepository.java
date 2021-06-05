package com.techtouhid.rms.repository;


import com.techtouhid.rms.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType, Long> {

}