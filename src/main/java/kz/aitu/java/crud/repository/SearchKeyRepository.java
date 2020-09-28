package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.SearchKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchKeyRepository extends CrudRepository <SearchKey, Long> {
}
