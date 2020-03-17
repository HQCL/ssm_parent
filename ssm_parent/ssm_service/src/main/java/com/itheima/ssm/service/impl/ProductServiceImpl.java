package com.itheima.ssm.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 冬暖
 * Date: 2020/3/10
 * Time: 0:13
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public PageInfo findAll(Integer currentPage, Integer pageSize) {
        if(currentPage == null ){
            currentPage = 1;
        }
        if(pageSize == null){
            pageSize = 3;
        }
        //开启分页插件
        PageHelper.startPage(currentPage,pageSize);
        List<Product> products = productDao.findAll();
        PageInfo info = new PageInfo(products);
        return info;
    }
}
