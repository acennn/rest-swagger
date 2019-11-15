package asen.restswagger.service;

import asen.restswagger.data.IDataMSSQLRepository;
import asen.restswagger.data.IDataMongoRepository;
import asen.restswagger.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    IDataMongoRepository mongoRepository;
    IDataMSSQLRepository mssqlRepository;

    @Autowired
    public UserService(IDataMongoRepository mongoRepository, IDataMSSQLRepository mssqlRepository) {
        this.mongoRepository = mongoRepository;
        this.mssqlRepository = mssqlRepository;
    }

    public void save() {

        this.mongoRepository.save(new User("AsMongo", "BoMongo"));
        this.mssqlRepository.save(new User("AsMSSQL", "BoMSSQL"));
    }
}
