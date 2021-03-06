package ${classPath}.vo.result;

import com.everyouthtech.oa.secret.orm.pojo.${ClassName};
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value="${ChineseName}", description="${ChineseName}")
public class ${ClassName}Result {

    @ApiModelProperty(value = "ID", required=true)
    private Long id;



}