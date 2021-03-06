package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.ParentsDictorySecret;
import com.everyouthtech.oa.secret.orm.pojo.ParentsDictorySecretExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentsDictorySecretMapper {
    long countByExample(ParentsDictorySecretExample example);

    int deleteByExample(ParentsDictorySecretExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ParentsDictorySecret record);

    int insertSelective(ParentsDictorySecret record);

    List<ParentsDictorySecret> selectByExample(ParentsDictorySecretExample example);

    ParentsDictorySecret selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ParentsDictorySecret record, @Param("example") ParentsDictorySecretExample example);

    int updateByExample(@Param("record") ParentsDictorySecret record, @Param("example") ParentsDictorySecretExample example);

    int updateByPrimaryKeySelective(ParentsDictorySecret record);

    int updateByPrimaryKey(ParentsDictorySecret record);
}