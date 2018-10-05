package com.zhuguan.com.controller;

import com.zhuguan.com.service.ProductService;
import com.zhuguan.zhou.api.ProductApi;
import com.zhuguan.zhou.model.ProductDto;
import com.zhuguan.zhou.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements ProductApi {

    @Autowired
    private ProductService productService;

    @Override
    public ResponseData<ProductDto> getProductInfoById(@RequestParam("id") String id) {
        ResponseData<ProductDto> resp = new ResponseData<>();
        resp.setData(productService.getProductInfoById(id)).ok();
        return resp;
    }

    @Override
    public ResponseData<List<ProductDto>> getgetProductInfoList() {
        ResponseData<List<ProductDto>> resp = new ResponseData<>();
        resp.setData(productService.getgetProductInfoList()).ok();
        return resp;
    }
}
