package ${classPath}.controller;

import com.everyouthtech.foundation.advice.exception.ServiceException;
import com.everyouthtech.secret.service.${ClassName}Service;
import com.everyouthtech.secret.vo.param.${ClassName}Param;
import com.everyouthtech.secret.vo.result.${ClassName}Result;
import com.everyouthtech.oa.secret.orm.pojo.${ClassName};
import com.everyouthtech.foundation.bean.Response;
import com.everyouthtech.foundation.bean.BaseController;
import com.everyouthtech.foundation.bean.CUDResult;
import com.everyouthtech.foundation.bean.PageHelperResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * ${ChineseName}表Controller
 *
 * @author 恒扬禾
 * @date ${date}
 */
@Api(tags={"${ChineseName}"})
@RestController
@RequestMapping("/api/secret")
public class ${ClassName}Controller extends BaseController{

	@Autowired
	private ${ClassName}Service ${className}Service;

	/**
	 * 依据查询条件${ClassName}Param返回查询结果。
	 * @param ${className}Param
	 * @return Response
	 * @throws Exception
	 */
    @ApiOperation(value = "分页查询${ChineseName}")
	@RequestMapping(value = "/${className}s", method = RequestMethod.POST)
	//@RequiresPermissions("${className}:list")
	public Response list${ClassName}s(@RequestBody ${ClassName}Param ${className}Param) throws Exception {
		PageHelperResult<${ClassName}Result> ${className}Results = ${className}Service.get${ClassName}sList(${className}Param);
        return new Response().success(${className}Results);
    }

    /**
    * 依据主键id返回${className}。
    * @param id
    * @return Response
    * @throws Exception
    */
    @ApiOperation(value = "通过id查询${ChineseName}详细信息")
    @RequestMapping(value = "/${className}s/{id}", method = RequestMethod.GET)
    //@RequiresPermissions("${className}:info")
    public Response get${ClassName}(@PathVariable("id") Long id) throws Exception {
        ${ClassName}Result ${className}Result = ${className}Service.get${ClassName}ById(id);
        return new Response().success(${className}Result);
    }

    /**
    * 创建${className}，必填字段不可以为null。
    * @param ${className}Param
    * @return Response
    * @throws Exception
    */
    @ApiOperation(value = "添加或修改${ChineseName}")
    @RequestMapping(value = "/${className}", method = RequestMethod.POST)
    //@RequiresPermissions("${className}:save")
    public Response create${ClassName}(@RequestBody ${ClassName}Param ${className}Param) throws Exception {
        ${ClassName} ${className} = new ${ClassName}();
        if (!StringUtils.isEmpty(${className}Param)){
            PropertyUtils.copyProperties(${className},${className}Param);
        }else {
            throw new ServiceException("请传入${ChineseName}对象!");
        }
        if (StringUtils.isEmpty(${className}Param.getId())){
            ${className}Service.create${ClassName}(${className});
        }else {
            ${className}Service.update${ClassName}(${className});
        }
        return new Response().success();
    }

    /**
    * 更新指定ID的${className}，可以全部更新或部分更新。
    * @param ${className}
    * @return Response
    * @throws Exception
    */
    @RequestMapping(value = "/${className}s/{id}", method = RequestMethod.PUT)
    //@RequiresPermissions("${className}:update")
    public Response update${ClassName}(@PathVariable("id") Long id,
    @RequestBody @Valid ${ClassName} ${className}) throws Exception {
        ${className}.setId(id);
        ${className}Service.update${ClassName}(${className});
        return new Response().success();
    }

    /**
    * 根据主键ID批量删除${className}。
    * @param ids  主键ID
    * @return Response
    * @throws Exception
    */
    @ApiOperation(value = "通过id批量删除${ChineseName}")
    @RequestMapping(value = "/${className}s", method = RequestMethod.DELETE)
    //@RequiresPermissions("${className}:delete")
    public Response delete${ClassName}(@RequestBody List<Long> ids) throws Exception {
        ${className}Service.delete${ClassName}ByIds(ids);
        return new Response().success();
    }
}
