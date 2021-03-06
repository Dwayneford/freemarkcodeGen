package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.Regulation;
import com.everyouthtech.oa.secret.orm.pojo.RegulationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegulationMapper {
    long countByExample(RegulationExample example);

    int deleteByExample(RegulationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Regulation record);

    int insertSelective(Regulation record);

    List<Regulation> selectByExample(RegulationExample example);

    Regulation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Regulation record, @Param("example") RegulationExample example);

    int updateByExample(@Param("record") Regulation record, @Param("example") RegulationExample example);

    int updateByPrimaryKeySelective(Regulation record);

    int updateByPrimaryKey(Regulation record);
}