package com.mongo.mongo_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "mongo_table")
public class MongoModel {

    @Id
    private int id;
    private String name;
    private String address;
    private String contactnum;
}
