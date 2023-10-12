package com.example.demo.model;





import java.util.Collection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="User" ,uniqueConstraints=@UniqueConstraint(columnNames="Email"))
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="first_name")
	private String LastName;
	
	private String Email;
	
	private Long Mobile;
	
	private String Password;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="users_roles", joinColumns=@JoinColumn(name="user_id",referencedColumnName="id"), inverseJoinColumns=@JoinColumn(name="role_id", referencedColumnName="id"))
	private Collection<Role> roles;
	
}
