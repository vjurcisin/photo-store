package sk.kukla.jurcisin.vincent.photostore.repository;

import org.springframework.data.repository.CrudRepository;
import sk.kukla.jurcisin.vincent.photostore.model.User;

/**
 * Created by vincent on 3.11.2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    // TODO add
}
