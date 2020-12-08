package com.practice.displaytime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
		LocalDateTime dateL = LocalDateTime.now();
		DateTimeFormatter dateF = DateTimeFormatter.ofPattern("E dd-MM-yyyy");
		String date = dateL.format(dateF);
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalDateTime timeL = LocalDateTime.now();
		DateTimeFormatter timeF = DateTimeFormatter.ofPattern("HH:mm:ss a");
		String time = timeL.format(timeF);
		model.addAttribute("time", time);
		return "time.jsp";
	}

}
