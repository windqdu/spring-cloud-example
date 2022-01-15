package com.jett.springcloud.apporder.service;

import com.jett.springcloud.apporder.entity.MyOrder;
import com.jett.springcloud.apporder.mapper.MyBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author wind
 * @date 2022/01/16 1:00
 */
@Service
public class OrderService {

    @Autowired
    private MyBaseMapper myBaseMapper;

    @Autowired
    private StorageFeignService storageFeignService;

    public void placeOrder(String userId, String commodityCode, Integer count) {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        MyOrder order =
            MyOrder.builder().userId(userId).commodityCode(commodityCode).count(count).money(orderMoney.intValue())
                .build();
        myBaseMapper.insert(order);
        storageFeignService.deduct(commodityCode, count);
    }
}
