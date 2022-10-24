package cn.com.xuxiaowei.springdoc.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

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
	@JsonProperty
	private Long current;

	/**
	 * 分页条数
	 */
	@JsonProperty
	private Long size;

}
