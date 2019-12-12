package com.zyc.summer.springboot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pms_product_vertify_record")
public class PmsProductVertifyRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 审核人
     */
    @Column(name = "vertify_man")
    private String vertifyMan;

    private Integer status;

    /**
     * 反馈详情
     */
    private String detail;

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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取审核人
     *
     * @return vertify_man - 审核人
     */
    public String getVertifyMan() {
        return vertifyMan;
    }

    /**
     * 设置审核人
     *
     * @param vertifyMan 审核人
     */
    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取反馈详情
     *
     * @return detail - 反馈详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置反馈详情
     *
     * @param detail 反馈详情
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}