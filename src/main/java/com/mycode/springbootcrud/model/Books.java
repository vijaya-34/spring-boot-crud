package com.mycode.springbootcrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Books {
    @Column
    @Id
    private int bookid;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;

}
