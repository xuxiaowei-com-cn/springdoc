package cn.com.xuxiaowei.springdoc.bo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 分页查询用户参数
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
public class UsersPageBo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 当前页
	 */
	private Long current;

	/**
	 * 分页条数
	 */
	private Long size;

}
