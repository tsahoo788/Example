package org.jspider.MyFirstSpringProject.Service;

import org.jspider.MyFirstSpringProject.Repositary.SignUpRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService 
{
	@Autowired
	SignUpRepositary repo;
	
	public void service(String sName,String sEmail,String sPass) 
	{
		repo.signUp(sName,sEmail,sPass);
	}
}
