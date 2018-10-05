package com.zhuguan.com.service.impl;

import com.zhuguan.com.service.ProductService;
import com.zhuguan.zhou.model.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final static Map<String, ProductDto> daoMap = new HashMap<>();

    static {
        daoMap.put("123", new ProductDto("123", "苹果手机5", 4500, 300));
        daoMap.put("124", new ProductDto("124", "苹果手机6", 5500, 400));
        daoMap.put("125", new ProductDto("125", "苹果手机7", 6500, 500));
        daoMap.put("126", new ProductDto("126", "苹果手机8", 7500, 600));
        daoMap.put("127", new ProductDto("127", "苹果手机9", 8500, 700));
        daoMap.put("128", new ProductDto("128", "电冰箱", 4500, 500));
    }


    @Override
    public ProductDto getProductInfoById(String id) {
        return daoMap.get(id);
    }

    @Override
    public List<ProductDto> getgetProductInfoList() {
        List<ProductDto> productDtoList = new ArrayList<>(daoMap.values());
        return productDtoList;
    }
}
