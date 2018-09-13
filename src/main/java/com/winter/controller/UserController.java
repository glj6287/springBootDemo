package com.winter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.winter.common.Result;
import com.winter.common.ResultGenerator;
import com.winter.model.User;
import com.winter.service.user.UserService;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
    
    @ResponseBody
    @RequestMapping(value = "/allV2/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Result<List<User>> findAllUserV2(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
    	//{"code":200,"message":"SUCCESS",
    	//"data":[{"userId":1,"userName":"1","password":"1","phone":"1"},
    	//{"userId":2,"userName":"2","password":"2","phone":"2"},{"userId":222,"userName":"222","password":"2222","phone":"222"}]}
        return ResultGenerator.genSuccessResult(userService.findAllUser(pageNum,pageSize));
    }
    
    @ResponseBody
    @RequestMapping(value = "/hello", produces = {"application/json;charset=UTF-8"})
    public String hello(){
    	return "hello";
    }
    
    @ResponseBody
    @RequestMapping(value = "/helloV2", produces = {"application/json;charset=UTF-8"})
    public Result<?> helloV2(){
    	return ResultGenerator.genSuccessResult();
    }
    
    @ResponseBody
    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public Result<Object> login(){
    	User user = new User();
    	user.setUserId(2222);
		return userService.login(user);
    }
}
