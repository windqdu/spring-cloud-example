package com.jett.springcloud.appstorage.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Storage {
  private Long id;
  private String commodityCode;
  private Long count;
}
