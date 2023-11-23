package com.app.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Column(name="StudentId")
	@Id
	@SequenceGenerator(name="Gen2",sequenceName = "Student-seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "Gen2",strategy = GenerationType.SEQUENCE)
	private Integer sid;
	
	@Column
	private String studentName;
	
	@ManyToOne
	@JoinColumn(name="FKBID")
	private Book book;

}
