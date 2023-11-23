package com.app.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	
	
	@Column(name="BookId")
	@Id
	@SequenceGenerator(name="Gen1",sequenceName = "Book-seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "Gen1",strategy = GenerationType.SEQUENCE)
	private Integer bid;
	
	@Column(name="BookName")
	private String bName;

}
