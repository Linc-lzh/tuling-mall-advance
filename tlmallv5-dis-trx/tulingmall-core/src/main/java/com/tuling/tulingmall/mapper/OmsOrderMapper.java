package com.tuling.tulingmall.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.tuling.tulingmall.model.OmsOrder;
import com.tuling.tulingmall.model.OmsOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@DS("order")
public interface OmsOrderMapper {
    long countByExample(OmsOrderExample example);

    int deleteByExample(OmsOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    List<OmsOrder> selectByExample(OmsOrderExample example);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);
}