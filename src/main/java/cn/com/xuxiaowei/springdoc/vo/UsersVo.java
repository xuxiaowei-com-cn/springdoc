package cn.com.xuxiaowei.springdoc.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
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
	private Long usersId;

	/**
	 * 用户名，不能为空，唯一键：uk__users__username
	 */
	private String username;

	/**
	 * 邮箱，唯一键：uk__users__email
	 */
	private String email;

	/**
	 * 邮箱是否验证，不为空，默认值：0
	 */
	private Boolean emailValid;

	/**
	 * 手机号，唯一键：uk__users__phone
	 */
	private String phone;

	/**
	 * 手机号否验证，不为空，默认值：0
	 */
	private String phoneValid;

	/**
	 * 昵称，不能为空，唯一键：uk__users__nickname
	 */
	private String nickname;

	/**
	 * 性别，取表：dict_data.dict_code = 'sex'
	 */
	private String sex;

	/**
	 * 性别展示
	 */
	private String sexLabel;

	/**
	 * 性别说明
	 */
	private String sexExplain;

	/**
	 * 生日
	 */
	private LocalDate birthday;

	/**
	 * 省代码，取表：province_handle.province_code
	 */
	private Integer provinceCode;

	private String provinceName;

	/**
	 * 市代码，取表：city_handle.city_code
	 */
	private Integer cityCode;

	private String cityName;

	/**
	 * 区/县代码，取表：county_handle.county_code
	 */
	private Integer countyCode;

	private String countyName;

	/**
	 * 镇代码，取表：town_handle.town_code
	 */
	private Integer townCode;

	private String townName;

	/**
	 * 居委会代码，取表：village_handle.town_code
	 */
	private Long villageCode;

	private String villageName;

	/**
	 * 详细地址
	 */
	private String detailAddress;

	/**
	 * 是否启用，不能为空
	 */
	private Boolean enabled;

	/**
	 * 帐户未过期，不能为空
	 */
	private Boolean accountNonExpired;

	/**
	 * 凭证未过期，不能为空
	 */
	private Boolean credentialsNonExpired;

	/**
	 * 帐户未锁定，不能为空
	 */
	private Boolean accountNonLocked;

	/**
	 * 更新时间，未更新时为空
	 */
	@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
	@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
	private LocalDateTime updateDate;

	/**
	 * 创建时间，不为空，数据库自动生成
	 */
	@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
	@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
	private LocalDateTime createDate;

	/**
	 * 逻辑删除，0 未删除，1 删除，MySQL 默认值 0，不为 NULL，注解@TableLogic。
	 */
	private Boolean deleted;

	/**
	 * 权限
	 */
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

		private String username;

		private String authority;

		private String explain;

		/**
		 * 更新时间，未更新时为空
		 */
		@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
		@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
		private LocalDateTime updateDate;

		/**
		 * 创建时间，不为空，数据库自动生成
		 */
		@Schema(pattern = DEFAULT_DATE_TIME_FORMAT)
		@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
		private LocalDateTime createDate;

	}

}