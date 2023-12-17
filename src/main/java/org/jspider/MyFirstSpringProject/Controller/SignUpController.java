package org.jspider.MyFirstSpringProject.Controller;


import org.jspider.MyFirstSpringProject.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpController 
{
	@Autowired
	private SignUpService Service;
	public void register(String sName,String sEmail,String sPass)
	{
		Service.service(sName, sEmail, sPass);
		System.out.println("SignUp successfully");
	}

}
