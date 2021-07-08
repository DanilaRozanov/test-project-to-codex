package dao;

import entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRep extends CrudRepository<Item, Long> {

}
