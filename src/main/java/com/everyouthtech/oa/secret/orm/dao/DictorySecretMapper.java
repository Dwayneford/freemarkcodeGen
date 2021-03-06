package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.DictorySecret;
import com.everyouthtech.oa.secret.orm.pojo.DictorySecretExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictorySecretMapper {
    long countByExample(DictorySecretExample example);

    int deleteByExample(DictorySecretExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DictorySecret record);

    int insertSelective(DictorySecret record);

    List<DictorySecret> selectByExample(DictorySecretExample example);

    DictorySecret selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DictorySecret record, @Param("example") DictorySecretExample example);

    int updateByExample(@Param("record") DictorySecret record, @Param("example") DictorySecretExample example);

    int updateByPrimaryKeySelective(DictorySecret record);

    int updateByPrimaryKey(DictorySecret record);
}