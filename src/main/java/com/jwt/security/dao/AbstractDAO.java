/**
 * ****************************************************************************
 *
 * Copyright (c) 2016, Mindfire Solutions and/or its affiliates. All rights
 * reserved.
 * ___________________________________________________________________________________
 *
 *
 * NOTICE: All information contained herein is, and remains the property of
 * Mindfire and its suppliers,if any. The intellectual and technical concepts
 * contained herein are proprietary to Mindfire Solutions. and its suppliers and
 * may be covered by us and Foreign Patents, patents in process, and are
 * protected by trade secret or copyright law. Dissemination of this information
 * or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Mindfire Solutions
 */
package com.jwt.security.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author baldeep
 * @param <PK>
 * @param <T>
 */
public interface AbstractDAO<PK extends Serializable, T> {

    public T getByKey(PK key);

    public void persist(T entity);

    public void delete(T entity);

    public void update(T entity);

    public List<T> getAll();

    public List<T> findByField(String fieldName, Object fieldValue);

    public T findByUniqueField(String fieldName, Object fieldValue);

    public Long count();
    
    public List<T> findByFields(HashMap<String, Object> hmap);
    
    public T findByUniqueFields(HashMap<String, Object> hmap);
    
    public Long countByCriteria(HashMap<String, Object> hmap);
    
    public Criteria createEntityCriteria();
    
    public List<T> findByField(HashMap<String, Object> hmap, String orderByfieldName, String orderType);
}
