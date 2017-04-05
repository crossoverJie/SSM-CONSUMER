package com.crossoverjie.consumer.api;

import com.crossoverjie.consumer.dto.SalaryInfoRsp;

/**
 * Function:薪资API
 * @author chenjiec
 * Date: 2017/4/4 下午9:46
 * @since JDK 1.7
 */
public interface SalaryInfoApi {

    /**
     * 获取用户信息
     * @param userId
     * @return
     * @throws Exception
     */
    public SalaryInfoRsp getSalaryInfo(int userId) throws Exception;
}
