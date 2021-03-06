package ${classPath}.vo.param;

import com.everyouthtech.foundation.bean.PageHelperParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value="${ChineseName}", description="${ChineseName}")
public class ${ClassName}Param extends PageHelperParam implements Serializable {

    @ApiModelProperty(value = "ID", required=true)
    private Long id;


}