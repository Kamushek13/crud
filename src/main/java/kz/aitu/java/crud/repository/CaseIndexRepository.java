package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.CaseIndex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CaseIndexRepository extends CrudRepository <CaseIndex, Long> {

}
