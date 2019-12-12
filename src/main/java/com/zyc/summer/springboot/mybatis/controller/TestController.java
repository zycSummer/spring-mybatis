package com.zyc.summer.springboot.mybatis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyc.summer.springboot.mybatis.dao.UmsRoleMapper;
import com.zyc.summer.springboot.mybatis.entity.UmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UmsRoleMapper umsRoleMapper;

    @GetMapping("/test")
    private List<UmsRole> findAll() {
        List<UmsRole> umsRoles = umsRoleMapper.selectAll();
        return umsRoles;
    }

    @GetMapping("/pageInfo")
    private List<UmsRole> pageInfo() {
        // PageHelper 使用非常简单，只需要设置页码和每页显示笔数即可
        PageHelper.startPage(0, 2);

        // 设置分页查询条件
        Example example = new Example(UmsRole.class);
        PageInfo<UmsRole> pageInfo = new PageInfo<>(umsRoleMapper.selectByExample(example));

        // 获取查询结果
        List<UmsRole> umsRoles = pageInfo.getList();
        for (UmsRole umsRole : umsRoles) {
            System.out.println(umsRole);
        }
        return umsRoles;
    }
}
