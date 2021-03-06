package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelRelatedProject;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelRelatedProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelRelatedProjectMapper {
    long countByExample(SecretPersonnelRelatedProjectExample example);

    int deleteByExample(SecretPersonnelRelatedProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelRelatedProject record);

    int insertSelective(SecretPersonnelRelatedProject record);

    List<SecretPersonnelRelatedProject> selectByExample(SecretPersonnelRelatedProjectExample example);

    SecretPersonnelRelatedProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelRelatedProject record, @Param("example") SecretPersonnelRelatedProjectExample example);

    int updateByExample(@Param("record") SecretPersonnelRelatedProject record, @Param("example") SecretPersonnelRelatedProjectExample example);

    int updateByPrimaryKeySelective(SecretPersonnelRelatedProject record);

    int updateByPrimaryKey(SecretPersonnelRelatedProject record);
}