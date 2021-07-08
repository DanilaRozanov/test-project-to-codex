package dao;

import entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRep extends CrudRepository<User,Long> {

}
