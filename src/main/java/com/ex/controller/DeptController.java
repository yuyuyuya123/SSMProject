package com.ex.controller;

import com.ex.entity.Dept;
import com.ex.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
//@RequestMapping("controller")
public class DeptController {
    @Autowired
    @Qualifier("deptServiceImpl")
    DeptServiceImpl deptService;

    @RequestMapping("/queryOneByNo")
    public String queryOne( Map<String,Dept> map){
        Dept dept = deptService.queryDeptByNo(10);
        map.put("dept",dept);
        return "result"; //forward:/views/result.jsp
    }
}
