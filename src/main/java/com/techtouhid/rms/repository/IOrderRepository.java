package com.techtouhid.rms.repository;

import com.techtouhid.rms.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepository extends JpaRepository<Order, Long> {
}
