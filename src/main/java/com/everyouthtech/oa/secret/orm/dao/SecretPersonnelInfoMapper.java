package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelInfo;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelInfoMapper {
    long countByExample(SecretPersonnelInfoExample example);

    int deleteByExample(SecretPersonnelInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelInfo record);

    int insertSelective(SecretPersonnelInfo record);

    List<SecretPersonnelInfo> selectByExample(SecretPersonnelInfoExample example);

    SecretPersonnelInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelInfo record, @Param("example") SecretPersonnelInfoExample example);

    int updateByExample(@Param("record") SecretPersonnelInfo record, @Param("example") SecretPersonnelInfoExample example);

    int updateByPrimaryKeySelective(SecretPersonnelInfo record);

    int updateByPrimaryKey(SecretPersonnelInfo record);
}