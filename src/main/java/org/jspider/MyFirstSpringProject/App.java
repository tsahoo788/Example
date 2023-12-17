package org.jspider.MyFirstSpringProject;

import org.jspider.MyFirstSpringProject.Controller.SignUpController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.jspider.MyFirstSpringProject")
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext apc = new AnnotationConfigApplicationContext(App.class);
		SignUpController s = apc.getBean(SignUpController.class);
		s.register("Miller", "da@gmail.com","da@123" );
		
	}
}
// write a spring program to store a product information in the database
