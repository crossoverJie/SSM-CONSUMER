package com.crossoverJie.consumer.api.dubbo.service;


import com.crossoverJie.consumer.api.dubbo.pojo.Datasource;
import com.crossoverJie.consumer.api.dubbo.pojo.DatasourceExample;

import java.util.List;

/**
 * Function:
 *
 * @author chenjiec
 *         Date: 2016/12/9 上午12:16
 * @since JDK 1.7
 */
public interface DataSourceService {
    List<Datasource> selectByExample(DatasourceExample example);

    Datasource selectByPrimaryKey(Integer id);


}
