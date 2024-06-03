package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;





public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PATRON IOC INVERSION DEL CONTROL
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		
		List<Cliente>clientes = clienteDAO.findALL();
				clientes.forEach(item ->{
					System.out.print(item.toString());
				});
		
		context.close();
		}

}
