package com.example.bookstoreapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private Double price;
    private String isbn;
}


