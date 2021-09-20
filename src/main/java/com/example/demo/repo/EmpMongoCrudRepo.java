package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.dao.EmpMongoDetailsDao;

public interface EmpMongoCrudRepo extends MongoRepository<EmpMongoDetailsDao, Integer> {

}
