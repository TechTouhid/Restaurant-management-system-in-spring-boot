package com.techtouhid.rms.service;

import com.techtouhid.rms.model.Order;
import com.techtouhid.rms.model.Product;
import com.techtouhid.rms.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {
    @Autowired
    private IOrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> listAll(){
        return orderRepository.findAll();
    }

    public void delete(long id) {
        orderRepository.deleteById(id);
    }

    public Order get(long id) {
        return orderRepository.findById(id).get();
    }
}
