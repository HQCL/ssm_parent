package com.itheima.ssm.service;

import com.github.pagehelper.PageInfo;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * User: 冬暖
 * Date: 2020/3/10
 * Time: 0:12
 */
public interface ProductService {

    //查询所有的商品信息
    public PageInfo findAll(Integer currentPage, Integer pageSize);
}
