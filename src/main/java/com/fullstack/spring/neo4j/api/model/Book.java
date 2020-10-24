package com.fullstack.spring.neo4j.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NodeEntity
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String bookName;
    private String author;
    private double price;
    private String publicationDate;
}
