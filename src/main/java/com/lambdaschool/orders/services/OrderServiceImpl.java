package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "orderServices")
public class OrderServiceImpl implements OrderServices
{
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return orderRepository.save(order);
    }
}
