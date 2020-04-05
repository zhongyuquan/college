package com.college.handler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.college.dao.UserMapper;
import com.college.entity.Response;
import com.college.entity.User;
import com.college.tool.MyTools;

@Controller
@RequestMapping("UserHandler")

public class UserHandler {
	
	@Autowired
	UserMapper userMapper;


	
	
	
@ResponseBody
@RequestMapping("login")
private Object login(User user,HttpSession session) {
	Response response = new Response();
	if(user.getId()==null||user.getId().length()<5||!MyTools.isEnglishString(user.getId())||user.getPwd()==null||user.getPwd().length()<5) {
		response.setResult(false);
		response.setMessage("账号密码不规范!请重新输入!");
		return response;
	}else {
		user.setPwd(DigestUtils.md5DigestAsHex(user.getPwd().getBytes()));
		try {
			if(userMapper.selectById(user.getId()) != null){
				session.setAttribute("user_id",user.getId());
				session.setMaxInactiveInterval(36000);
				response.setResult(true);
				response.setMessage("登录成功!");
			}
		}catch (Exception e) {
			response.setMessage("登录失败!内部异常!");
		}
	}
	return response;
}

	
@ResponseBody
@RequestMapping("register")
private Object register(User user) {
	Response response = new Response();
	if(user.getId()==null||user.getId().length()<5||!MyTools.isEnglishString(user.getId())||user.getPwd()==null||user.getPwd().length()<5) {
		response.setResult(false);
		response.setMessage("账号密码不规范!请重新输入!");
		return response;
	}else {
		user.setPwd(DigestUtils.md5DigestAsHex(user.getPwd().getBytes()));
		try {
			if(userMapper.selectById(user.getId()) != null){
				response.setMessage("此账号已经存在!");
			}else {
				if (userMapper.insert(user)>0) {
					response.setResult(true);
					response.setMessage("注册成功!账号是:"+user.getId());
				}
			}
		} catch (Exception e) {
			response.setMessage("注册失败!内部异常!");
		}
	}
	return response;
}
}
