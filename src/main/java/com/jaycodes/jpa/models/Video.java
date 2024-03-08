package com.jaycodes.jpa.models;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import jakarta.persistence.Entity;
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
@Polymorphism(type = PolymorphismType.EXPLICIT)
//@DiscriminatorValue("V")
public class Video extends Resource {

	private int length;
}
