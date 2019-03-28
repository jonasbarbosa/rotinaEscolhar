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
@Repository("AulaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AulaDAO extends JpaRepository<Aula, java.lang.String> {

  /**
   * Obtém a instância de Aula utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Aula entity WHERE entity.id = :id")
  public Aula findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Aula utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Aula entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key materias
   * @generated
   */
  @Query("SELECT entity FROM Aula entity WHERE entity.materias.id = :id")
  public Page<Aula> findAulasByMaterias(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key campus
   * @generated
   */
  @Query("SELECT entity FROM Aula entity WHERE entity.campus.id = :id")
  public Page<Aula> findAulasByCampus(@Param(value="id") java.lang.String id, Pageable pageable);

}
