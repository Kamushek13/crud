package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository <Request, Long> {
}
