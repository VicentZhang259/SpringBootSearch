package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;  
  
@RestController  
//@RequestMapping(value="/index")  
@RequestMapping("/hello")  
public class HelloController {  
      
    //@RequestMapping(value="/hello")  
	@RequestMapping("")
    public String helloworld(){  
        return "hello world!";  
    }  
	
	// 从 application.properties 中读取配置，如取不到默认值为Hello
    @Value("${application.hello:Hello}")
    private String hello;
	@RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {
        System.out.println("HelloController.helloJsp().hello=" + hello);
        map.put("hello", hello);
        return "helloJsp";
    }
	@RequestMapping("/nameList")
	public List<User> getUserMap(){
		List<User> uList = new ArrayList<User>();
		User u1 = new User();
		User u2 = new User();
		u1.setName("zhangsan");
		u1.setId(1);
		u1.setAccount("9527");
		u2.setId(2);
		u2.setName("lisi");
		u2.setAccount("250");
		uList.add(u1);
		uList.add(u2);
		return uList;
	}

}  