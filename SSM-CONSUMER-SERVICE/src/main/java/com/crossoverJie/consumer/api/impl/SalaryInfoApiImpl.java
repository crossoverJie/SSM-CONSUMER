package com.crossoverJie.consumer.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.crossoverJie.api.UserInfoApi;
import com.crossoverJie.dto.UserInfoReq;
import com.crossoverJie.dto.UserInfoRsp;
import com.crossoverjie.consumer.api.SalaryInfoApi;
import com.crossoverjie.consumer.dto.SalaryInfoRsp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Function:
 * @author chenjiec
 * Date: 2017/4/4 下午9:51
 * @since JDK 1.7
 */
@Service
public class SalaryInfoApiImpl implements SalaryInfoApi {
    private static Logger logger = LoggerFactory.getLogger(SalaryInfoApiImpl.class);

    @Autowired
    UserInfoApi userInfoApi ;

    /**
     * 获取用户信息
     *
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public SalaryInfoRsp getSalaryInfo(int userId) throws Exception {
        logger.info("薪资查询Id="+userId);

        //返回对象
        SalaryInfoRsp salaryInfoRsp = new SalaryInfoRsp() ;
        UserInfoReq userInfoReq = new UserInfoReq() ;
        userInfoReq.setId(userId);
        //调用远程服务
        UserInfoRsp userInfo = userInfoApi.getUserInfo(userInfoReq);

        salaryInfoRsp.setUsername(userInfo.getUserName());

        return salaryInfoRsp;
    }


}
