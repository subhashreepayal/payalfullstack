package com.example.assesment1;

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
public class Assesment1Application {

    public static void main(String[] args) {
        SpringApplication.run(Assesment1Application.class, args);
    }
    @Autowired
    JdbcTemplate jdbc;
    
    @PostMapping("/products")
    public List<Map<String, Object>> getproduct(@RequestParam("prodName") String prodName) {
        String sql = "select * from productmaster where prodName='" + prodName + "'";
        List<Map<String, Object>> li = jdbc.queryForList(sql);
        return li;
    }
 
@GetMapping("/hello")
public String hello(){
	return "hello seeree";
}

}