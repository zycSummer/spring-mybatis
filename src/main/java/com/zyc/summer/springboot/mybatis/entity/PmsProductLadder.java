package com.zyc.summer.springboot.mybatis.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "pms_product_ladder")
public class PmsProductLadder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    /**
     * 满足的商品数量
     */
    private Integer count;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 折后价格
     */
    private BigDecimal price;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return product_id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取满足的商品数量
     *
     * @return count - 满足的商品数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置满足的商品数量
     *
     * @param count 满足的商品数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取折后价格
     *
     * @return price - 折后价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置折后价格
     *
     * @param price 折后价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}