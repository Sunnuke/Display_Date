package com.practice.displaytime;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DisplaytimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplaytimeApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate date = LocalDate.now();
		String currDate = "" + date;
		model.addAttribute("date", currDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime date = LocalTime.now();
		String currDate = "" + date;
		model.addAttribute("date", currDate);
		return "time.jsp";
	}

}
