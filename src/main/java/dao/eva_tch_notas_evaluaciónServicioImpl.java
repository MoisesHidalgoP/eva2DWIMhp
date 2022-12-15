package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class eva_tch_notas_evaluaciónServicioImpl implements eva_tch_notas_evaluacionServicio {
	
	@PersistenceContext
	private EntityManager em;
	
     
	//Metodo que realiza un insert a Base de datos
	public void insertarNota(eva_tch_notas_evaluación notas) {
		// TODO Auto-generated method stub
		em.persist(notas);
		
	}

	//Metodo que devuelve un select de la Base de datos
	public List<eva_tch_notas_evaluación> buscarNotas() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT notasEva FROM eva_tch_notas_evaluación notasEva").getResultList();
	}
	
	

}
