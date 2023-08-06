package org.nishchhal.project1.model;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private String firstName;
	private String lastName;
	private String course;
	private String country;

	// Constructors, getters, setters
	// ...
}
