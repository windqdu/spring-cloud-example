package com.jett.springcloud.apporder.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wind
 * @date 2022/01/16 0:57
 */
@FeignClient(name = "APP-STORAGE")
public interface StorageFeignService {
    /**
     * 减库存
     *
     * @param commodityCode
     * @param count
     * @return
     */
    @GetMapping("storage/deduct")
    Boolean deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);
}
