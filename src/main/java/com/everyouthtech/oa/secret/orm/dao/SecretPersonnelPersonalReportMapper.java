package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelPersonalReport;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelPersonalReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelPersonalReportMapper {
    long countByExample(SecretPersonnelPersonalReportExample example);

    int deleteByExample(SecretPersonnelPersonalReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelPersonalReport record);

    int insertSelective(SecretPersonnelPersonalReport record);

    List<SecretPersonnelPersonalReport> selectByExample(SecretPersonnelPersonalReportExample example);

    SecretPersonnelPersonalReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelPersonalReport record, @Param("example") SecretPersonnelPersonalReportExample example);

    int updateByExample(@Param("record") SecretPersonnelPersonalReport record, @Param("example") SecretPersonnelPersonalReportExample example);

    int updateByPrimaryKeySelective(SecretPersonnelPersonalReport record);

    int updateByPrimaryKey(SecretPersonnelPersonalReport record);
}