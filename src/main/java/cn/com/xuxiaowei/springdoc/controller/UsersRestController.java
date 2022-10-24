package cn.com.xuxiaowei.springdoc.controller;

import cn.com.xuxiaowei.springdoc.bo.UsersPageBo;
import cn.com.xuxiaowei.springdoc.vo.UsersVo;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * 用户
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
//@Tag(name = "UsersRestController", description = "用户接口")
@RestController
@RequestMapping("/users")
public class UsersRestController {

	/**
	 * 用户列表数据
	 * @param request 请求
	 * @param response 响应
	 * @param usersPageBo 分页查询用户参数
	 */
//	@Operation(summary = "分页查询用户", description = "返回分页查询用户数据")
	@PostMapping("/page")
	public List<UsersVo> page(HttpServletRequest request, HttpServletResponse response,
			@Valid @RequestBody UsersPageBo usersPageBo) {

		return null;
	}

}
