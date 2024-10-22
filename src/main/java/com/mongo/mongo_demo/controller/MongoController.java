package com.mongo.mongo_demo.controller;

import com.mongo.mongo_demo.model.MongoModel;
import com.mongo.mongo_demo.repository.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MongoController {

    @Autowired
    private MongoRepo mongoRepo;

    @PostMapping(path = "/add")
    public String addData(@RequestBody MongoModel mongoModel) {

        String response;
        try {
            mongoRepo.save(mongoModel);
            response = "Data Added Successfully";
        } catch (Exception e) {
            response = "Failed with reason :" + e.getMessage();
        }

        return response;
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteData(@PathVariable int id) {

        mongoRepo.deleteById(id);
        return "Data Deleted Successfully";
    }

    @GetMapping(path = "/findall")
    public List<MongoModel> showData() {

        return mongoRepo.findAll();
    }

}
