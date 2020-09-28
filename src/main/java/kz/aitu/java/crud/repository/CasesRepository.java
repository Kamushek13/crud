package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Cases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasesRepository extends CrudRepository <Cases, Long> {
}
