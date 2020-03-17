package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User: 冬暖
 * Date: 2020/3/10
 * Time: 0:04
 */
public interface ProductDao {
    @Select("select * from product")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "orders",column = "id",javaType = List.class,many = @Many(select = "com.itheima.ssm.dao.OrdersDao.findById"))
    })
    public List<Product> findAll();
}
