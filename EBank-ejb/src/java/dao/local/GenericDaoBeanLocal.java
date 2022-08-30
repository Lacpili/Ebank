/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.local;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @param <E> L'entité qui implemente le GéneriqueDaoBean
 * @param <ID> La clé primaire 
 */
public interface GenericDaoBeanLocal<E extends Serializable, ID> {

    /**
     * Persiste l'objet passé en paramètre.
     *
     * @param e L'objet à persister.
     */
    void addOne(E e);

    E addOneWithFlush(E e);

    E updateOne(E e);

    void deleteOne(E e);

    void deleteOne(ID id);

    void deleteAll();

    E getOne(ID id);

    List<E> getAll();

    Long count();

    boolean exists(ID id);
}
