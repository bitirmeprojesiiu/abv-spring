package com.bitirme.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bitirme.model.Exam;
import com.bitirme.service.BitirmeService;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class BitirmeController {

	@Autowired
	private BitirmeService bitirmeService;
	
	/*@RequestMapping("/exams")
	@ResponseBody
	public String findAll()
	{
		/*ModelAndView mav = new ModelAndView();
		mav.addObject("exams", bitirmeService.findExams());
		mav.setViewName("exams");
		return mav;
		String result = "<html>";
		
		for(Exam exam : bitirmeService.findAll()){
			result += "<div>"+ exam.toString() + "</div>";
		}
		return result + "</html>";
	}*/
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/exams")
	public String exams() {
		return "exams";
	}

	@RequestMapping("/candidates")
	public String candidates() {
		return "candidates";
	}
}
