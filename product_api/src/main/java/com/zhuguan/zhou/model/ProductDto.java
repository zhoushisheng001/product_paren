package com.zhuguan.zhou.model;

/**
 * 商品服务类
 */
public class ProductDto extends BaseDTO {

    public ProductDto() {
    }

    public ProductDto(String id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    private String id;
    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private int price;

    /**
     * 库存
     */
    private int store;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
