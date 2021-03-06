package ${classPath}.service.impl;

import org.apache.commons.beanutils.PropertyUtils;
import com.everyouthtech.foundation.bean.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.everyouthtech.foundation.bean.CUDResult;
import com.everyouthtech.foundation.bean.PageHelperResult;
import com.everyouthtech.foundation.jdbc.dynamic.DataSourceContextHolder;
import com.everyouthtech.foundation.jdbc.dynamic.DynamicDataSourceAnnotation;
import com.everyouthtech.foundation.jdbc.log.DBAccessLogger;
import com.everyouthtech.foundation.jdbc.log.DBOperationType;
import com.everyouthtech.secret.service.${ClassName}Service;
import com.everyouthtech.secret.vo.param.${ClassName}Param;
import com.everyouthtech.secret.vo.result.${ClassName}Result;
import com.everyouthtech.oa.secret.orm.dao.${ClassName}Mapper;
import com.everyouthtech.oa.secret.orm.pojo.${ClassName};
import com.everyouthtech.oa.secret.orm.pojo.${ClassName}Example;


@Service("${className}Service")
public class ${ClassName}ServiceImpl implements ${ClassName}Service {

	@Autowired
	private ${ClassName}Mapper ${className}Mapper;

	@Override
	public PageHelperResult<${ClassName}Result> get${ClassName}sList(${ClassName}Param ${className}Param) throws Exception {
        if(${className}Param.getPageNumber() != null && ${className}Param.getPageSize() != null){
            // 设置分页（使用插件）
            PageHelper.startPage(${className}Param.getPageNumber(), ${className}Param.getPageSize());
        }

        // 依据查询条件，准备criteria进行查询。
        ${ClassName}Example example = new ${ClassName}Example();
        ${ClassName}Example.Criteria criteria = example.createCriteria();
        // TODO 完成${ClassName}Example.Criteria criteria的搜索条件赋值。

        // 完成排序字段的设置
        if (${className}Param.getSortby() != null && !${className}Param.getSortby().equals("")) {
            if (${className}Param.getOrder() != null && !${className}Param.getOrder().equals("")) {
                example.setOrderByClause(${className}Param.getSortby() + " " + ${className}Param.getOrder());
            } else {
                example.setOrderByClause(${className}Param.getSortby());
            }
        }
        List<${ClassName}> ${className}s = ${className}Mapper.selectByExample(example);

        // TODO  使用其他业务逻辑获取${ClassName}Result的其他参数。
        List<${ClassName}Result> ${className}Results = new ArrayList<${ClassName}Result>();
        if (${className}s.size()>0){
            for (${ClassName} ${className} : ${className}s) {
                // 完成${className}对象到${className}Result的转换
                ${ClassName}Result ${className}Result = new ${ClassName}Result();
                // TODO 请使用其他业务逻辑获取${ClassName}Result的其他参数。
                PropertyUtils.copyProperties(${className}Result,${className});
                ${className}Results.add(${className}Result);
            }
        }

        PageHelperResult<${ClassName}Result> page${ClassName}Results = new PageHelperResult<>();
        //返回所有参数
        page${ClassName}Results.setRows(${className}Results);
        //获取总记录数的语句必须在后面，否则分页插件不起作用。
        page${ClassName}Results.setTotal(${className}Mapper.countByExample(example));

        return page${ClassName}Results;
    }

    @Override
    public ${ClassName}Result get${ClassName}ById(Long id) throws Exception {
        // 根据主键ID获取${className}
        ${ClassName} ${className} = ${className}Mapper.selectByPrimaryKey(id);

        if(${className} != null){
            // 完成${className}对象到${className}Result的转换
            ${ClassName}Result ${className}Result = new ${ClassName}Result();
            PropertyUtils.copyProperties(${className},${className}Result);
            // TODO  使用其他业务逻辑获取${ClassName}Result的其他参数。
            return ${className}Result;
        }

        return null;
    }

    @Override
    @DBAccessLogger(accessTable="t_${className}", accessType = DBOperationType.CREATE)
    public CUDResult create${ClassName}(${ClassName} ${className}) throws Exception {
        Integer returnVal = ${className}Mapper.insertSelective(${className});
        return new CUDResult(returnVal, ${className}.getId());
    }

    @Override
    @DBAccessLogger(accessTable="t_${className}", accessType = DBOperationType.UPDATE)
    public CUDResult update${ClassName}(${ClassName} ${className}) throws Exception {
        Integer returnVal = ${className}Mapper.updateByPrimaryKeySelective(${className});
        return new CUDResult(returnVal, ${className}.getId());
    }


    @Override
    @DBAccessLogger(accessTable="t_${className}", accessType = DBOperationType.DELETE)
    public Response delete${ClassName}ByIds(List<Long> ids) throws Exception {
        ${ClassName}Example ${className}Example = new ${ClassName}Example();
        ${className}Example.or().andIdIn(ids);
        ${className}Mapper.deleteByExample(${className}Example);
        return new Response().success();
    }

    @Override
    public Response save${ClassName}s(List<${ClassName}Param> ${className}Params) throws Exception{
        if (${className}Params.size()>0){
            for (${ClassName}Param ${className}Param : ${className}Params) {
                ${ClassName} ${className} = new ${ClassName}();
                PropertyUtils.copyProperties(${className},${className}Param);
                if (!StringUtils.isEmpty(${className}.getId())){
                    this.update${ClassName}(${className});
                }else {
                    this.create${ClassName}(${className});
                }
            }
        }
        return new Response().success();
    }
}
