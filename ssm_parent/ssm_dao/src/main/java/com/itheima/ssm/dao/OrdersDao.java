package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Orders;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User: 冬暖
 * Date: 2020/3/10
 * Time: 0:09
 */
public interface OrdersDao {

    @Select("select * from orders where productId = #{productId}")
    public List<Orders> findById(@Param("productId")String productId);
}
