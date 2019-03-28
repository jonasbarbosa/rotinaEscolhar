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
@Repository("ProfMateriasDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProfMateriasDAO extends JpaRepository<ProfMaterias, java.lang.String> {

  /**
   * Obtém a instância de ProfMaterias utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ProfMaterias entity WHERE entity.id = :id")
  public ProfMaterias findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ProfMaterias utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ProfMaterias entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key prof
   * @generated
   */
  @Query("SELECT entity FROM ProfMaterias entity WHERE entity.prof.id = :id")
  public Page<ProfMaterias> findProfMateriassByProf(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key materias
   * @generated
   */
  @Query("SELECT entity FROM ProfMaterias entity WHERE entity.materias.id = :id")
  public Page<ProfMaterias> findProfMateriassByMaterias(@Param(value="id") java.lang.String id, Pageable pageable);

}
