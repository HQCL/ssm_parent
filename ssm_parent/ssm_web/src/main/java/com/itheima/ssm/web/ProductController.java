package com.itheima.ssm.web;

import com.github.pagehelper.PageInfo;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: 冬暖
 * Date: 2020/3/10
 * Time: 0:15
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String findAll(Model model,@RequestParam(name = "currentPage",defaultValue = "1",required = false) Integer currentPage, @RequestParam(name = "pageSize",defaultValue = "3",required = false) Integer pageSize){
        PageInfo pageInfo = productService.findAll(currentPage, pageSize);
        model.addAttribute("page",pageInfo);
        return "product-list";
    }
}
