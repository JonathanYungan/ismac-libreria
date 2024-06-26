package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;




public class PrincipalAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PATRON IOC INVERSION DEL CONTROL
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImp2",AutorDAO.class);
		
		
		
		//CRUD : CREATE, READ, UPDATE, DELETE
		
		//ADD
		Autor autor = new Autor(0,"Naomi","Yanez","Pais","por la esquinita","0987654321","naomisa@gmail.com");
		//autorDAO.add(autor);
		
		//UP
		Autor autor2 = new Autor(54,"Naomi lop","Yanez","Pais","por la esquinita","0987654321","naomisa@gmail.com");
		//autorDAO.up(autor2);
		
		// del
		autorDAO.del(54);
		//findOne
		
		//autorDAO.del(1);
		//System.out.println("************************* DEL *************************"+autorDAO.findOne(1));
		//finALL
		//List<Autor> autors = AutorDAO,findALL();
		autorDAO.findALL().forEach(item -> {System.out.println(item.toString());});
		
		
		
		
		
		
		//List<Autor>autors = AutorDAO.findALL();
		//autorDAO.findALL().forEach(item ->{	System.out.println(item.toString());});
		
		context.close();
		}

}
