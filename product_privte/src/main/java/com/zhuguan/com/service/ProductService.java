package com.zhuguan.com.service;

import com.zhuguan.zhou.model.ProductDto;

import java.util.List;

public interface ProductService {

    ProductDto getProductInfoById(String id);

    List<ProductDto> getgetProductInfoList();
}
