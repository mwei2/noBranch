package com.wma95.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wma95.model.Model_ldh_52;
import com.wma95.model.Model_wma_95;
import com.wma95.model.Model_hki_31;

@Controller
public class GroupName_controller 
{
	Model_hki_31 hki31 = new Model_hki_31();
	Model_wma_95 wma95 = new Model_wma_95();
	Model_ldh_52 ldh52 = new Model_ldh_52();
		
	@GetMapping("/")
	public String homePage(Model model)
	{
		hki31.setName("Hyunhee Kim");
		hki31.setClickDetail("/hki_31.JPG");
		model.addAttribute("hki31", hki31);
		
		wma95.setName("Wei Ma");
		wma95.setPicLink("/wma_95.png");
		model.addAttribute("wma95", wma95);
		
		ldh52.setName("Lovish Dhanda");
		ldh52.setPictureClick("/lovish.jpg");
		model.addAttribute("ldh52", ldh52);
		return "home";
	}
	
	
	@GetMapping("/hki31")
	public String pageHki31(Model model)
	{
		hki31.setProfile("Hello, I am hyunhee Kim. This is my firtst time studying computer science, so each semester feels like a challenging for me. but I am determined to do my best effort in this group project. I studied video editing so I am very skilled in that part. but I am not very skilled in coding. However I am eager to work hard and improve my coding abilities. thank you.");
		model.addAttribute("hki31", hki31);
		return "hki31";
	}
	
	
	@GetMapping("/wma95")
	public String pageWma95(Model model)
	{
		
		wma95.setAboutMe("I'm from China. I hate to program. I hate English. I hate school group project.");
		model.addAttribute("wma95", wma95);
		return "wma95";
	}
	
	
	
	@GetMapping("/ldh52")
	public String pageLdh52(Model model)
	{
		ldh52.setDescription("I am Lovish Dhanda. I am passionate about programming and always eager to learn \r\n"
				+ "	new things. I enjoy working on challenging projects and collaborating with others.");
		model.addAttribute("ldh52", ldh52);
		return "ldh52";
	}
	
}
