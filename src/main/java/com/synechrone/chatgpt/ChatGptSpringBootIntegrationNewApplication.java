package com.synechrone.chatgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import io.github.flashvayne.chatgpt.service.ChatgptService;

@SpringBootApplication
@RestController
public class ChatGptSpringBootIntegrationNewApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(ChatGptSpringBootIntegrationNewApplication.class, args);
	}
	
	@Autowired
	private ChatgptService chatgptService;
	
	 @GetMapping("/send")
	    public String sendMessage(@RequestParam String message) {
		return chatgptService.sendMessage(message);
		// return "index";
	 }

}
