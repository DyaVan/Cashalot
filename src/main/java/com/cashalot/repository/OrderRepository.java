package com.cashalot.repository;

import com.cashalot.domain.appflow.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByStatus(String status);

}
