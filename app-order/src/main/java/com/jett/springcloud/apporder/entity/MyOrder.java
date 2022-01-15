package com.jett.springcloud.apporder.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MyOrder {
    private Long id;
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
}
