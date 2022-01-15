package com.jett.springcloud.appstorage.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jett.springcloud.appstorage.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wind
 * @date 2022/01/16 0:18
 */
@Service
public class StorageService {

    @Autowired
    private BaseMapper<Storage> baseMapper;

    public void deduct(String commodityCode, Integer count) {
        QueryWrapper<Storage> queryWrapper = new QueryWrapper<>();

        queryWrapper.setEntity(Storage.builder().commodityCode(commodityCode).build());

        Storage storage1 = baseMapper.selectOne(queryWrapper);
        storage1.setCount(storage1.getCount() - count);

        baseMapper.updateById(storage1);

    }
}
