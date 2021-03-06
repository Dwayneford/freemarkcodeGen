package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelOverseasFunding;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelOverseasFundingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelOverseasFundingMapper {
    long countByExample(SecretPersonnelOverseasFundingExample example);

    int deleteByExample(SecretPersonnelOverseasFundingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelOverseasFunding record);

    int insertSelective(SecretPersonnelOverseasFunding record);

    List<SecretPersonnelOverseasFunding> selectByExample(SecretPersonnelOverseasFundingExample example);

    SecretPersonnelOverseasFunding selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelOverseasFunding record, @Param("example") SecretPersonnelOverseasFundingExample example);

    int updateByExample(@Param("record") SecretPersonnelOverseasFunding record, @Param("example") SecretPersonnelOverseasFundingExample example);

    int updateByPrimaryKeySelective(SecretPersonnelOverseasFunding record);

    int updateByPrimaryKey(SecretPersonnelOverseasFunding record);
}