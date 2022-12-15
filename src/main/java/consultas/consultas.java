package consultas;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import dao.eva_tch_notas_evaluación;
import dao.eva_tch_notas_evaluaciónServicioImpl;

@Component
public class consultas {
	
	//Aqui realizamos la inyección de independencias
	@Autowired
	private eva_tch_notas_evaluaciónServicioImpl eimpl;
	
	@Transactional
	public void insertarUnaNota(eva_tch_notas_evaluación Eva_tch_notas_evaluación) {
		eimpl.insertarNota(Eva_tch_notas_evaluación);
	}
	
	@Transactional
	public void insertarListaNota(Collection<eva_tch_notas_evaluación> colEva) {
		for (eva_tch_notas_evaluación notas : colEva) {
			eimpl.insertarNota(notas);
		}
	}
	
	@Transactional
	public List<eva_tch_notas_evaluación>buscarTodasNotas(){
		return eimpl.buscarNotas();
		
	}

}
