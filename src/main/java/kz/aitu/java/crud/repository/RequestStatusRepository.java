package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.RequestStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestStatusRepository extends CrudRepository <RequestStatus, Long> {
}
