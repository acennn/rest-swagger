package asen.restswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@ComponentScan({"asen.restswagger.model"})
//@EntityScan("asen.restswagger.model")
//@EnableJpaRepositories("asen.restswagger.model")
public class RestSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSwaggerApplication.class, args);
    }

}
