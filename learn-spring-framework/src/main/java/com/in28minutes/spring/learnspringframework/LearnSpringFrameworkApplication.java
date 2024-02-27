package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		//MarioGame game = new MarioGame();
		//PacmanGame game = new PacmanGame();

		//SuperContraGame game1 = new SuperContraGame();
		//MarioGame runner = new MarioGame(game);
		//GameRunner runner = new GameRunner(game1);
		//GamingConsole game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);

		runner.run();

		//MyWebController controller = context.getBean(MyWebController.class);
		//System.out.println(controller.returnValueFromBusinessService());
	}

}
