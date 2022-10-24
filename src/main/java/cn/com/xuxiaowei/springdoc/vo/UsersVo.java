package cn.com.xuxiaowei.springdoc.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
//import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static cn.com.xuxiaowei.springdoc.utils.DateUtils.DEFAULT_DATE_TIME_FORMAT;

/**
 * <p>
 * 用户表。
 * </p>
 *
 * @author xuxiaowei
 * @since 2022-04-06
 */
@Data
public class UsersVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户主键，自增
	 */
	@JsonProperty
	private Long usersId;

	/**
	 * 用户名，不能为空，唯一键：uk__users__username
	 */
	@JsonProperty
	private String username;

	/**
	 * 邮箱，唯一键：uk__users__email
	 */
	@JsonProperty
	private String email;

	/**
	 * 邮箱是否验证，不为空，默认值：0
	 */
	@JsonProperty
	private Boolean emailValid;

	/**
	 * 手机号，唯一键：uk__users__phone
	 */
	@JsonProperty
	private String phone;

	/**
	 * 手机号否验证，不为空，默认值：0
	 */
	@JsonProperty
	private String phoneValid;

	/**
	 * 昵称，不能为空，唯一键：uk__users__nickname
	 */
	@JsonProperty
	private String nickname;

	/**
	 * 性别，取表：dict_data.dict_code = 'sex'
	 */
	@JsonProperty
	private String sex;

	/**
	 * 性别展示
	 */
	@JsonProperty
	private String sexLabel;

	/**
	 * 性别说明
	 */
	@JsonProperty
	private String sexExplain;

	/**
	 * 生日
	 */
	@JsonProperty
	private LocalDate birthday;

	/**
	 * 省代码，取表：province_handle.province_code
	 */
	@JsonProperty
	private Integer provinceCode;

	@JsonProperty
	private String provinceName;

	/**
	 * 市代码，取表：city_handle.city_code
	 */
	@JsonProperty
	private Integer cityCode;

	@JsonProperty
	private String cityName;

	/**
	 * 区/县代码，取表：county_handle.county_code
	 */
	@JsonProperty
	private Integer countyCode;

	@JsonProperty
	private String countyName;

	/**
	 * 镇代码，取表：town_handle.town_code
	 */
	@JsonProperty
	private Integer townCode;

	@JsonProperty
	private String townName;

	/**
	 * 居委会代码，取表：village_handle.town_code
	 */
	@JsonProperty
	private Long villageCode;

	@JsonProperty
	private String villageName;

	/**
	 * 详细地址
	 */
	@JsonProperty
	private String detailAddress;

	/**
	 * 是否启用，不能为空
	 */
	@JsonProperty
	private Boolean enabled;

	/**
	 * 帐户未过期，不能为空
	 */
	@JsonProperty
	private Boolean accountNonExpired;

	/**
	 * 凭证未过期，不能为空
	 */
	@JsonProperty
	private Boolean credentialsNonExpired;

	/**
	 * 帐户未锁定，不能为空
	 */
	@JsonProperty
	private Boolean accountNonLocked;

	/**
	 * 更新时间，未更新时为空
	 */
	@JsonProperty
//	@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
	@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
	private LocalDateTime updateDate;

	/**
	 * 创建时间，不为空，数据库自动生成
	 */
	@JsonProperty
//	@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
	@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
	private LocalDateTime createDate;

	/**
	 * 逻辑删除，0 未删除，1 删除，MySQL 默认值 0，不为 NULL，注解@TableLogic。
	 */
	@JsonProperty
	private Boolean deleted;

	/**
	 * 权限
	 */
	@JsonProperty
	private List<AuthoritiesVo> authoritiesVoList;

	/**
	 * <p>
	 * 权限表。
	 * </p>
	 *
	 * @author xuxiaowei
	 * @since 2022-04-06
	 */
	@Data
	public static class AuthoritiesVo implements Serializable {

		private static final long serialVersionUID = 1L;

		@JsonProperty
		private String username;

		@JsonProperty
		private String authority;

		@JsonProperty
		private String explain;

		/**
		 * 更新时间，未更新时为空
		 */
		@JsonProperty
//		@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
		@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
		private LocalDateTime updateDate;

		/**
		 * 创建时间，不为空，数据库自动生成
		 */
		@JsonProperty
//		@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
		@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
		private LocalDateTime createDate;

	}

}
