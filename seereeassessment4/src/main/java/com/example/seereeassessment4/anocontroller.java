package com.example.seereeassessment4;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AnoController {
    @Autowired
    JdbcTemplate jdbc;

    @GetMapping("/leave")
    public String leave(Model model) {
        String sql = "select * from emp";
        List<Map<String, Object>> li = jdbc.queryForList(sql);
        model.addAttribute("emp", li);
        System.out.println(li.get(0));
        return "leave";
    }
}