package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("MateriasDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface MateriasDAO extends JpaRepository<Materias, java.lang.String> {

  /**
   * Obtém a instância de Materias utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Materias entity WHERE entity.id = :id")
  public Materias findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Materias utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Materias entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Aula entity WHERE entity.materias.id = :id")
  public Page<Aula> findAula(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProfMaterias entity WHERE entity.materias.id = :id")
  public Page<ProfMaterias> findProfMaterias(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.prof FROM ProfMaterias entity WHERE entity.materias.id = :id")
  public Page<Prof> listProf(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ProfMaterias entity WHERE entity.materias.id = :instanceId AND entity.prof.id = :relationId")
  public int deleteProf(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM Materias entity WHERE entity.user.id = :id")
  public Page<Materias> findMateriassByUser(@Param(value="id") java.lang.String id, Pageable pageable);

}
