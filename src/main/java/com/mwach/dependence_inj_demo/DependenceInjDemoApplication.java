package com.mwach.dependence_inj_demo;

import com.mwach.dependence_inj_demo.controllers.ConstructorInjectedController;
import com.mwach.dependence_inj_demo.controllers.GetterInjectedController;
import com.mwach.dependence_inj_demo.controllers.MyController;
import com.mwach.dependence_inj_demo.controllers.ProperlyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependenceInjDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependenceInjDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
		System.out.println(ctx.getBean(ProperlyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }
}
