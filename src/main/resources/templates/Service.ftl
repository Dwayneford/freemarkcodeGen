package ${classPath}.service;

import com.everyouthtech.foundation.bean.Response;
import com.everyouthtech.foundation.bean.CUDResult;
import com.everyouthtech.foundation.bean.PageHelperResult;
import com.everyouthtech.secret.vo.param.${ClassName}Param;
import com.everyouthtech.secret.vo.result.${ClassName}Result;
import com.everyouthtech.oa.secret.orm.pojo.${ClassName};

import java.util.List;

public interface ${ClassName}Service {
	/**
	 * 依据查询条件${ClassName}Param返回查询结果${ClassName}Result列表。
	 * @param ${className}Param
	 * @return PageHelperResult<${ClassName}Result>
    * @throws Exception
    */
    public PageHelperResult<${ClassName}Result> get${ClassName}sList(${ClassName}Param ${className}Param) throws Exception;
    /**
    * 依据主键id返回${className}。
    * @param id
    * @return ${ClassName}Result
    * @throws Exception
    */
    public ${ClassName}Result get${ClassName}ById(Long id) throws Exception;
    /**
    * 创建${className}，必填字段不可以为null。
    * @param ${className}
    * @return CUDResult
    * @throws Exception
    */
    public CUDResult create${ClassName}(${ClassName} ${className}) throws Exception;
    /**
    * 更新${className}，可以全部更新或部分更新。
    * @param ${className}
    * @return CUDResult
    * @throws Exception
    */
    public CUDResult update${ClassName}(${ClassName} ${className}) throws Exception;
    /**
    * 根据主键ID删除${className}。
    * @param ids  主键ID
    * @return CUDResult
    * @throws Exception
    */
    public Response delete${ClassName}ByIds(List<Long> ids) throws Exception;


    /**
    * 批量保存${className}
    * @param ${className}Params
    * @return
    * @throws Exception
    */
    public Response save${ClassName}s(List< ${ClassName}Param> ${className}Params) throws Exception;
}
