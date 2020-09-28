package kz.aitu.java.crud.repository;


import kz.aitu.java.crud.entity.Fond;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FondRepository extends CrudRepository <Fond, Long> {
}
