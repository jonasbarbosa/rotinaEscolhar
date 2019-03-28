package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AULA
 * @generated
 */
@Entity
@Table(name = "\"AULA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Aula")
public class Aula implements Serializable {

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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_materias", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Materias materias;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_campus", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Campus campus;

  /**
   * Construtor
   * @generated
   */
  public Aula(){
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
  public Aula setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Aula setData(java.util.Date data){
    this.data = data;
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
  public Aula setMaterias(Materias materias){
    this.materias = materias;
    return this;
  }

  /**
   * Obtém campus
   * return campus
   * @generated
   */
  
  public Campus getCampus(){
    return this.campus;
  }

  /**
   * Define campus
   * @param campus campus
   * @generated
   */
  public Aula setCampus(Campus campus){
    this.campus = campus;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aula object = (Aula)obj;
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
