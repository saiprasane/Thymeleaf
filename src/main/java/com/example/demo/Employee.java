package com.example.demo;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ToString
public class Employee {

	private Integer eno;
	private String name;
	private Double salary;

}
