package dao;

import java.util.List;

public interface eva_tch_notas_evaluacionServicio {
	
	//Signatura del metodo insertarNota
	public void insertarNota(eva_tch_notas_evaluación notas);
	
	//Signatura del metodo buscarNotas
	public List<eva_tch_notas_evaluación>buscarNotas();

}
