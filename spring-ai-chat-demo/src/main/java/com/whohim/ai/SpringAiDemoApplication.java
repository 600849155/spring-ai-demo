package com.whohim.ai;

import com.whohim.ai.openai.ChainWorkflow;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiDemoApplication.class, args);
	}

	String report = """
			Q3 Performance Summary:
			Our customer satisfaction score rose to 92 points this quarter.
			Revenue grew by 45% compared to last year.
			Market share is now at 23% in our primary market.
			Customer churn decreased to 5% from 8%.
			New user acquisition cost is $43 per user.
			Product adoption rate increased to 78%.
			Employee satisfaction is at 87 points.
			Operating margin improved to 34%.
			""";

//	@Bean
//	public CommandLineRunner commandLineRunner(ChatClient.Builder chatClientBuilder) {
//		return args -> {
//			new ChainWorkflow(chatClientBuilder.build()).chain(report);
//		};
//	}
}
