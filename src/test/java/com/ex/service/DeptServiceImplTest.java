package com.ex.service;

import com.ex.entity.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/** 
* DeptServiceImpl Tester. 
* 
* @author <Authors name> 
* @since 03/22/2020
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml","classpath*:applicationContext-controller.xml"})
@WebAppConfiguration(value = "src/main/webapp")
public class DeptServiceImplTest {
/** 
* 
* Method: queryDeptByNo(Integer deptNo) 
* 
*/
@Autowired
DeptServiceImpl deptService;

@Test
public void testQueryDeptByNo() throws Exception {
    Dept dept = deptService.queryDeptByNo(10);
    System.out.println(dept);
} 


} 
