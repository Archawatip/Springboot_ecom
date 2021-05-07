package com.sandiaz.ecommerce.dto;

import com.sandiaz.ecommerce.entity.Address;
import com.sandiaz.ecommerce.entity.Customer;
import com.sandiaz.ecommerce.entity.Order;
import com.sandiaz.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
