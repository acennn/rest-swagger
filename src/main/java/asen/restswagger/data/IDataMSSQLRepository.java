package asen.restswagger.data;


import asen.restswagger.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository("IDataMSSQLRepositoryAAAAAAAAAAAAAAAAAA")
public interface IDataMSSQLRepository extends CrudRepository<User, String> {
}
