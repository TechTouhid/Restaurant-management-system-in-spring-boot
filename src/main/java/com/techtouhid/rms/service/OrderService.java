package com.techtouhid.rms.service;

import com.techtouhid.rms.model.Order;
import com.techtouhid.rms.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {
    @Autowired
    private IOrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }
}
