package com.deepseek_app.ai.deepseek_spring_integration;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Sauravsku
 */
@SpringBootApplication
public class DeepseekSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepseekSpringIntegrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ChatClient.Builder builder) {
		return args -> {
			ChatClient chatClient = builder.build();
			String response = chatClient.prompt("Tell me how to call").call().content();
			System.out.println(response);
		};
	}

}
