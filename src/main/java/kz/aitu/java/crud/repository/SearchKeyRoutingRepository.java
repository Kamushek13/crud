package kz.aitu.java.crud.repository;


import kz.aitu.java.crud.entity.SearchKeyRouting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchKeyRoutingRepository extends CrudRepository  <SearchKeyRouting, Long>{
}
