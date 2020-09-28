package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.RemoveAct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoveActRepository extends CrudRepository <RemoveAct, Long> {
}
