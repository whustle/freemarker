package com.lz.controller;

import com.lz.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * MyController class
 *
 * @author wjh
 * @date 2018/11/2
 */
@Controller
public class MyController {
	/*字符串*/
	@RequestMapping("/demo1")
	public String demo1(Model model){
		model.addAttribute("name","jack");
		return "first";
	}
	/*对象*/
	@RequestMapping("/demo2")
	public String demo2(Model model){
		User user = new User();
		user.setId(1);
		user.setUsername("wang");
		user.setAge(20);
		model.addAttribute("user",user);
		return "first";
	}
	@RequestMapping("/demo3")
	public String demo3(Model model){
		CopyOnWriteArrayList<User> list =new CopyOnWriteArrayList<>();
		User user1 = new User();
		user1.setId(1);
		user1.setUsername("wang");
		user1.setAge(20);
		User user2 = new User();
		user2.setId(2);
		user2.setUsername("tom");
		user2.setAge(21);

		User user3 = new User();
		user3.setId(3);
		user3.setUsername("jack");
		user3.setAge(22);

		User user4 = new User();
		user4.setId(4);
		user4.setUsername("mark");
		user4.setAge(23);

		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		model.addAttribute("userList",list);
		return "first";
	}
}
