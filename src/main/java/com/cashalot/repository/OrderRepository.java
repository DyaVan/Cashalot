package com.cashalot.repository;

import com.cashalot.domain.appflow.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {
}
