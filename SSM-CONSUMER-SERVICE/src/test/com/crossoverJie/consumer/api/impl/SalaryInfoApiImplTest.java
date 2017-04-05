package com.crossoverJie.consumer.api.impl;

import com.alibaba.fastjson.JSON;
import com.crossoverjie.consumer.api.SalaryInfoApi;
import com.crossoverjie.consumer.dto.SalaryInfoRsp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Function:
 *
 * @author chenjiec
 *         Date: 2017/4/5 下午10:41
 * @since JDK 1.7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring/*.xml" })
public class SalaryInfoApiImplTest {

    @Autowired
    private SalaryInfoApi salaryInfoApi ;

    @Test
    public void getSalaryInfo() throws Exception {
        SalaryInfoRsp salaryInfo = salaryInfoApi.getSalaryInfo(1);
        System.out.println(JSON.toJSONString(salaryInfo));
    }

}