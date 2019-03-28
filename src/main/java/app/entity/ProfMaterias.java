package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PROFMATERIAS
 * @generated
 */
@Entity
@Table(name = "\"PROFMATERIAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ProfMaterias")
public class ProfMaterias implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_prof", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Prof prof;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_materias", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Materias materias;

  /**
   * Construtor
   * @generated
   */
  public ProfMaterias(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public ProfMaterias setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém prof
   * return prof
   * @generated
   */
  
  public Prof getProf(){
    return this.prof;
  }

  /**
   * Define prof
   * @param prof prof
   * @generated
   */
  public ProfMaterias setProf(Prof prof){
    this.prof = prof;
    return this;
  }

  /**
   * Obtém materias
   * return materias
   * @generated
   */
  
  public Materias getMaterias(){
    return this.materias;
  }

  /**
   * Define materias
   * @param materias materias
   * @generated
   */
  public ProfMaterias setMaterias(Materias materias){
    this.materias = materias;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ProfMaterias object = (ProfMaterias)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
