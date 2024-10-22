package com.mongo.mongo_demo.repository;

import com.mongo.mongo_demo.model.MongoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<MongoModel, Integer> {


}