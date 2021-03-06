package com.everyouthtech.oa.secret.orm.dao;

import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelFamilyMember;
import com.everyouthtech.oa.secret.orm.pojo.SecretPersonnelFamilyMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecretPersonnelFamilyMemberMapper {
    long countByExample(SecretPersonnelFamilyMemberExample example);

    int deleteByExample(SecretPersonnelFamilyMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SecretPersonnelFamilyMember record);

    int insertSelective(SecretPersonnelFamilyMember record);

    List<SecretPersonnelFamilyMember> selectByExample(SecretPersonnelFamilyMemberExample example);

    SecretPersonnelFamilyMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SecretPersonnelFamilyMember record, @Param("example") SecretPersonnelFamilyMemberExample example);

    int updateByExample(@Param("record") SecretPersonnelFamilyMember record, @Param("example") SecretPersonnelFamilyMemberExample example);

    int updateByPrimaryKeySelective(SecretPersonnelFamilyMember record);

    int updateByPrimaryKey(SecretPersonnelFamilyMember record);
}