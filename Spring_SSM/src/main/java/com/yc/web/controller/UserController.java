package com.yc.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yc.bean.User;
import com.yc.services.UserService;
import com.yc.web.dto.JsonModel;

@Api(value="/user",tags="用户模块")
@RestController   //      restful 风格       1. 返回数据  ->  json格式       2. http 请求方法:   get   post    ->   put  delete   ...  
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user_login.action")
	@ResponseBody
	public JsonModel userLogin(User user, HttpSession session, JsonModel jsonModel) {
		if (user != null && user.getUsername() != null && !user.getUsername().equals("") && user.getPassword() != null
				&& !user.getPassword().equals("")) {
			User users = userService.login(user);
			if (users != null) {
				session.setAttribute("user", users);
				jsonModel.setCode(1);
				jsonModel.setObj(users);
			} else {
				jsonModel.setCode(0);
				jsonModel.setErrorMsg("用户名或密码错误");
			}
		} else {
			jsonModel.setCode(0);
			jsonModel.setErrorMsg("用户名或密码不能为空");
		}
		return jsonModel;
	}
	@ApiOperation(value="用户注册",notes="用户注册")
	@ApiImplicitParam(name="user",value="User",required=true,dataType="User")
	@GetMapping("user_register.action")
	@ResponseBody
	public JsonModel registerUser(User user, JsonModel jsonModel) {
		boolean flag = userService.register(user);
		if (flag) {
			jsonModel.setCode(1);
			jsonModel.setObj(user);
		} else {
			jsonModel.setCode(0);
			jsonModel.setErrorMsg("注册失败");
		}
		return jsonModel;
	}
	
	@RequestMapping(value="/user_isUserExists.action")
	@ResponseBody
	public JsonModel isUserExists (User user,JsonModel jsonModel) {
		User users = userService.login(user);
		if(users == null) {
			jsonModel.setCode(1);
		}else {
			jsonModel.setCode(0);
		}
		return jsonModel;
	}

}
