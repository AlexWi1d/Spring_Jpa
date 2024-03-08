package com.jaycodes.jpa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Author extends BaseEntity {
//	@Id
//	@GeneratedValue
//	private Integer id;
	@Column()
	private String firstName;
//	@Column(nullable = false)
	private String lastnNme;
	@Column(unique = true, nullable = false)
	private String email;
	private int age;

//	@Column(updatable = false, nullable = false)
//	private LocalDateTime createdAt;
//
//	@Column(insertable = false)
//	private LocalDateTime lastModifirdAt;

	@ManyToMany(mappedBy = "authors")
	private List<Course> courses;
}
