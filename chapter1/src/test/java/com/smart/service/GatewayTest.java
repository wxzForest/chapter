package com.smart.service;

import com.zbj.zop.gateway.anno.ZopService;
import com.zhubajie.category.api.dto.cate.CategoryDto;
import com.zhubajie.category.api.service.CategoryService;
import com.zhubajie.common.dto.Request;
import com.zhubajie.common.dto.Result;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class GatewayTest {

    @ZopService
    private CategoryService categoryService;

    @Test
    public void gateWay() throws Exception{
        Request request=new Request();
        request.setData("data");
        Result<List<CategoryDto>> res = categoryService.getCategoryAll(request);
        //System.out.println("categoryid"+result.getData().get(0).getCategoryId());
        Assert.assertTrue(res.isSuccess());

    }
}
