package tech.csm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emptab")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eId")
	private Integer empId;

	@Column(name = "ename")
	private String empName;

	@Column(name = "egen")
	private String empGen;

	@Column(name = "esal")
	private Double empSal;

	@Column(name = "edept")
	private String empDept;

	@Column(name = "eaddr")
	private String empAddr;
}
