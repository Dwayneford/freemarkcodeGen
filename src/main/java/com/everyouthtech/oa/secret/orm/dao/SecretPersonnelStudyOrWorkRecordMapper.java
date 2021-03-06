package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelStudyOrWorkRecord;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelStudyOrWorkRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelStudyOrWorkRecordMapper {
    long countByExample(SecretPersonnelStudyOrWorkRecordExample example);

    int deleteByExample(SecretPersonnelStudyOrWorkRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelStudyOrWorkRecord record);

    int insertSelective(SecretPersonnelStudyOrWorkRecord record);

    List<SecretPersonnelStudyOrWorkRecord> selectByExample(SecretPersonnelStudyOrWorkRecordExample example);

    SecretPersonnelStudyOrWorkRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelStudyOrWorkRecord record, @Param("example") SecretPersonnelStudyOrWorkRecordExample example);

    int updateByExample(@Param("record") SecretPersonnelStudyOrWorkRecord record, @Param("example") SecretPersonnelStudyOrWorkRecordExample example);

    int updateByPrimaryKeySelective(SecretPersonnelStudyOrWorkRecord record);

    int updateByPrimaryKey(SecretPersonnelStudyOrWorkRecord record);
}