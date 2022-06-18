package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String HelloWorld(Model model) {

	LocalDateTime nowDate = LocalDateTime.now();

	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒 E曜日");

	String formatNowDate = dtf2.format(nowDate);

	model.addAttribute("message", "本日の日時と曜日をお知らせします。");
	model.addAttribute("day", formatNowDate);

	return "helloworld";
    }

}