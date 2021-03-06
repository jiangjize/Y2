package cn.jjz.repostitory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 123 on 2017/10/07.
 */
public interface DomainRepository<T,PK extends Serializable>{
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}