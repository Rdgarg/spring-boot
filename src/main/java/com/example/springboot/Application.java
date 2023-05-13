package com.example.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Map;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Map<String, KeyValueDAO> ss = context.getBeansOfType(KeyValueDAO.class);
		System.out.println("fdsa");
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//			System.out.println("Lets inspect bean provided by spring");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//
//			for(String bean : beanNames) {
//				System.out.println(bean);
//			}
//
//		};
//	}

//	@Bean
//	public KeyValueDAO getKeyValueDao() {
//
//	}

}
