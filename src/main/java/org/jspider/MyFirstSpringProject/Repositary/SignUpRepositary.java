package org.jspider.MyFirstSpringProject.Repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jspider.MyFirstSpringProject.Entity.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpRepositary 
{
	@Autowired
	SignUp signUp;
	
	public void signUp(String sName,String sEmail,String sPass)
	{
		signUp.setsName(sName);
		signUp.setsEmail(sEmail);
		signUp.setsPass(sPass);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myFirstHibJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(signUp);
		
		em.getTransaction().commit();
		em.close();
		
	}

}
