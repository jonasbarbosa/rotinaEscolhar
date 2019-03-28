package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PROF
 * @generated
 */
@Entity
@Table(name = "\"PROF\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Prof")
public class Prof implements Serializable {

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
  @Column(name = "professor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String professor;

  /**
   * Construtor
   * @generated
   */
  public Prof(){
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
  public Prof setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém professor
   * return professor
   * @generated
   */
  
  public java.lang.String getProfessor(){
    return this.professor;
  }

  /**
   * Define professor
   * @param professor professor
   * @generated
   */
  public Prof setProfessor(java.lang.String professor){
    this.professor = professor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Prof object = (Prof)obj;
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
