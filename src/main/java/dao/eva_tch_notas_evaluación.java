package dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eva_tch_notas_evaluacion",schema="sc_evaluacion")
public class eva_tch_notas_evaluación {
	
	//Atributos
	@Column(name="md_uuid")
	private String md_uuid;
	@Column(name="md_fch")
	private String md_fch;
	@Id
	@Column(name="id_nota_evaluacion",unique=true, nullable=false)
	private int id_nota_evaluacion;
	@Column(name="cod_alumno")
	private String cod_alumno;
	@Column(name="nota_evaluacion")
	private int nota_evaluacion;
	@Column(name="cod_evaluacion")
	private String cod_evaluacion;
	
	//Getters y Setters
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public String getMd_fch() {
		return md_fch;
	}
	public void setMd_fch(String md_fch) {
		this.md_fch = md_fch;
	}
	public int getId_nota_evaluacion() {
		return id_nota_evaluacion;
	}
	public void setId_nota_evaluacion(int id_nota_evaluacion) {
		this.id_nota_evaluacion = id_nota_evaluacion;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	public int getNota_evaluacion() {
		return nota_evaluacion;
	}
	public void setNota_evaluacion(int nota_evaluacion) {
		this.nota_evaluacion = nota_evaluacion;
	}
	public String getCod_evaluacion() {
		return cod_evaluacion;
	}
	public void setCod_evaluacion(String cod_evaluacion) {
		this.cod_evaluacion = cod_evaluacion;
	}
	
	//Constructores
	
	public eva_tch_notas_evaluación(String md_uuid, String md_fch, int id_nota_evaluacion, String cod_alumno,
			int nota_evaluacion, String cod_evaluacion) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_nota_evaluacion = id_nota_evaluacion;
		this.cod_alumno = cod_alumno;
		this.nota_evaluacion = nota_evaluacion;
		this.cod_evaluacion = cod_evaluacion;
	}
	
	public eva_tch_notas_evaluación() {
		super();
	}
	

}
