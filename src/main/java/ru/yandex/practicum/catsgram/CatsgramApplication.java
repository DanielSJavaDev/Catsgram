package ru.yandex.practicum.catsgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.yandex.practicum.catsgram.controller.SimpleController;

@ComponentScan(basePackageClasses = SimpleController.class)
@SpringBootApplication
public class CatsgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatsgramApplication.class, args);
	}

}
