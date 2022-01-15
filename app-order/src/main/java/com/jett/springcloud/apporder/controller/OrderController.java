package com.jett.springcloud.apporder.controller;

import com.jett.springcloud.apporder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wind
 * @date 2022/01/16 0:59
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/placeOrder/commit")
    public Boolean placeOrderCommit() {
        orderService.placeOrder("1", "product-1", 1);
        return true;
    }
}
