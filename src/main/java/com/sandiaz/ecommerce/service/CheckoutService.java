package com.sandiaz.ecommerce.service;

import com.sandiaz.ecommerce.dto.Purchase;
import com.sandiaz.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
