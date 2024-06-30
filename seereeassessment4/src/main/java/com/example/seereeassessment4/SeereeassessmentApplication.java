package com.example.seereeassessment4;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SeereeassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run( SeereeassessmentApplication.class, args);
	}
	@Autowired
    JdbcTemplate jdbc;
@PostMapping("/getleave")
public List getleave(@RequestParam("emp_id") String emp_id){
	System.out.println("hello getleave");
	String sql = "select * from leave_master where leave_id in (select leave_id from leave_emp_assign where emp_id='"+emp_id+"')";
	List<Map<String, Object>> li = jdbc.queryForList(sql);
	return li;
}
	@GetMapping("/hello")
	public String hello(){
		return "hello seeree";
	}
}