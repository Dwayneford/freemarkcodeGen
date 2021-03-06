package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelPositionChange;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelPositionChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelPositionChangeMapper {
    long countByExample(SecretPersonnelPositionChangeExample example);

    int deleteByExample(SecretPersonnelPositionChangeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelPositionChange record);

    int insertSelective(SecretPersonnelPositionChange record);

    List<SecretPersonnelPositionChange> selectByExample(SecretPersonnelPositionChangeExample example);

    SecretPersonnelPositionChange selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelPositionChange record, @Param("example") SecretPersonnelPositionChangeExample example);

    int updateByExample(@Param("record") SecretPersonnelPositionChange record, @Param("example") SecretPersonnelPositionChangeExample example);

    int updateByPrimaryKeySelective(SecretPersonnelPositionChange record);

    int updateByPrimaryKey(SecretPersonnelPositionChange record);
}