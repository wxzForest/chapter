package com;

import com.zbj.zop.gateway.anno.ZopService;

import com.zhubajie.category.api.dto.cate.CategoryDto;
import com.zhubajie.category.api.service.CategoryService;
import com.zhubajie.common.dto.Request;
import com.zhubajie.common.dto.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class GatewayTest {

    @ZopService
    private CategoryService categoryService;

    @Test
    public void gateWay() throws Exception{
        Result<List<CategoryDto>> res = categoryService.getCategoryAll(Request.<String>create().data("data"));
        System.out.println("result:"+res.getData().get(0).getCategoryId());
        org.junit.Assert.assertTrue(res.isSuccess());
    }
}
