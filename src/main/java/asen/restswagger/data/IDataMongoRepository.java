package asen.restswagger.data;

import asen.restswagger.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository("IDataMongoRepository")
public interface IDataMongoRepository extends MongoRepository<User, String> {
//    public String findById(String id);
}
