package com.zhuguan.zhou.api;

import com.zhuguan.zhou.model.ProductDto;
import com.zhuguan.zhou.response.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ProductApi {

    @RequestMapping(value = "/product/getProductInfoById", method = RequestMethod.GET)
    ResponseData<ProductDto> getProductInfoById(@RequestParam("id") String id);

    @RequestMapping(value = "/product/getgetProductInfoList",method =RequestMethod.POST)
    ResponseData<List<ProductDto>> getgetProductInfoList();

    @GetMapping(value = "/product/getProductDtoByName")
    ResponseData<List<ProductDto>> getProductDtoByName (HttpServletRequest request);

}
