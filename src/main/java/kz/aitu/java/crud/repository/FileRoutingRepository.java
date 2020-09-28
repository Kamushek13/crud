package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.FileRouting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRoutingRepository extends CrudRepository<FileRouting, Long> {
}
