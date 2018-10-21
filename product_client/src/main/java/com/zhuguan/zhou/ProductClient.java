package com.zhuguan.zhou;

import com.zhuguan.zhou.api.ProductApi;
import com.zhuguan.zhou.model.ProductDto;
import com.zhuguan.zhou.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@FeignClient(name = "product-paren", fallback = ProductClient.ProductServiceClient.class)
public interface ProductClient extends ProductApi {

    @Component
    public static class ProductServiceClient implements ProductClient {

        @Override
        public ResponseData<ProductDto> getProductInfoById(String id) {
            return null;
        }

        @Override
        public ResponseData<List<ProductDto>> getgetProductInfoList() {
            System.out.println("==========>服务已经熔断了<===========");
            return null;
        }

        @Override
        public ResponseData<List<ProductDto>> getProductDtoByName(HttpServletRequest request) {
            return null;
        }
    }
}
