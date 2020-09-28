package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Authorization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationRepository extends CrudRepository<Authorization, Long> {
}
