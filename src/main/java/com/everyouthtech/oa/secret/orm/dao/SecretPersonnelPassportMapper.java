package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelPassport;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelPassportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelPassportMapper {
    long countByExample(SecretPersonnelPassportExample example);

    int deleteByExample(SecretPersonnelPassportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelPassport record);

    int insertSelective(SecretPersonnelPassport record);

    List<SecretPersonnelPassport> selectByExample(SecretPersonnelPassportExample example);

    SecretPersonnelPassport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelPassport record, @Param("example") SecretPersonnelPassportExample example);

    int updateByExample(@Param("record") SecretPersonnelPassport record, @Param("example") SecretPersonnelPassportExample example);

    int updateByPrimaryKeySelective(SecretPersonnelPassport record);

    int updateByPrimaryKey(SecretPersonnelPassport record);
}