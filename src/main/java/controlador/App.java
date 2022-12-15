package controlador;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import consultas.consultas;
import dao.eva_tch_notas_evaluación;

@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("contexto.xml"); 
		consultas consulta = context.getBean(consultas.class);
		
		System.out.println("Accedemos al metodo que inserta en base de datos");
		consulta.insertarUnaNota(new eva_tch_notas_evaluación("2","15/12/2022",2,"3",4,"PR"));
		
		System.out.println("Salumos del metodo insertarNota");
		System.out.println("Accedemos al metodo que devuelve el select de Base de Datos");
		System.out.println("Lista notas: "+ consulta.buscarTodasNotas());
		

	}

}
