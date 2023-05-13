package com.example.springboot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface KeyValueDAO extends CrudRepository<KeyValue, String> {

}

//public interface KeyValueDAO {
//
//}
