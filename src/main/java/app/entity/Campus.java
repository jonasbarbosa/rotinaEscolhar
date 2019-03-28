package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CAMPUS
 * @generated
 */
@Entity
@Table(name = "\"CAMPUS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Campus")
public class Campus implements Serializable {

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
  @Column(name = "campus", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String campus;

  /**
  * @generated
  */
  @Column(name = "endereco", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String endereco;

  /**
   * Construtor
   * @generated
   */
  public Campus(){
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
  public Campus setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém campus
   * return campus
   * @generated
   */
  
  public java.lang.String getCampus(){
    return this.campus;
  }

  /**
   * Define campus
   * @param campus campus
   * @generated
   */
  public Campus setCampus(java.lang.String campus){
    this.campus = campus;
    return this;
  }

  /**
   * Obtém endereco
   * return endereco
   * @generated
   */
  
  public java.lang.String getEndereco(){
    return this.endereco;
  }

  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Campus setEndereco(java.lang.String endereco){
    this.endereco = endereco;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Campus object = (Campus)obj;
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
