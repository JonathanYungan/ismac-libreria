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
		
		
		
		//CRUD : CREATE, READ, UPDATE, DELETE
		
		//ADD
		Cliente cliente = new Cliente(0,"1712164381","Naomi","Yanez","mi casa..","0987654321","naomisa@gmail.com");
		clienteDAO.add(cliente);
		
		//UP
		Cliente cliente2 = new Cliente(0,"1712164381","Sofia","Yanez","mi casa.. mas adentro","0987654321","Sofia@gmail.com");
		clienteDAO.up(cliente);
		
		// del
		//clienteDAO.del(1);
		//findOne
		
		clienteDAO.del(1);
		System.out.println("************************* DEL *************************"+clienteDAO.findOne(1));
		//finALL
		//List<Cliente> clientes = clienteDAO,findALL();
		clienteDAO.findALL().forEach(item -> {System.out.println(item.toString());});
		
		
		
		
		
		
		List<Cliente>clientes = clienteDAO.findALL();
				clientes.forEach(item ->{
					System.out.println(item.toString());
				});
		
		context.close();
		}

}
