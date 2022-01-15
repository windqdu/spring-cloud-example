package com.jett.springcloud.appstorage.controller;

import com.jett.springcloud.appstorage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wind
 * @date 2022/01/16 0:16
 */
@RestController
@Slf4j
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping(path = "/deduct")
    public Boolean deduct(String commodityCode, Integer count) {
        log.info("commodityCode:{}, count:{}", commodityCode, count);
        storageService.deduct(commodityCode, count);

        return true;
    }

}
