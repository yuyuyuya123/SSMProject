package com.ex.service;

import com.ex.entity.Dept;
import com.ex.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public Dept queryDeptByNo(Integer deptNo) {
        Dept dept = deptMapper.queryDeptByNo(deptNo);
        return dept;
    }
}
