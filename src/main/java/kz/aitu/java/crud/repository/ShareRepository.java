package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends CrudRepository <Share, Long> {
}
