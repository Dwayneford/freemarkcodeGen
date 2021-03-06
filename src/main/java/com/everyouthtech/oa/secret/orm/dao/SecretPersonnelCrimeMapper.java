package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelCrime;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelCrimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelCrimeMapper {
    long countByExample(SecretPersonnelCrimeExample example);

    int deleteByExample(SecretPersonnelCrimeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelCrime record);

    int insertSelective(SecretPersonnelCrime record);

    List<SecretPersonnelCrime> selectByExample(SecretPersonnelCrimeExample example);

    SecretPersonnelCrime selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelCrime record, @Param("example") SecretPersonnelCrimeExample example);

    int updateByExample(@Param("record") SecretPersonnelCrime record, @Param("example") SecretPersonnelCrimeExample example);

    int updateByPrimaryKeySelective(SecretPersonnelCrime record);

    int updateByPrimaryKey(SecretPersonnelCrime record);
}