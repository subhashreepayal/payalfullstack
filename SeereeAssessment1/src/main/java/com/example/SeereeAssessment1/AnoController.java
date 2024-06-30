package com.example.assesment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnoController {

    @Autowired
    JdbcTemplate jdbc;

    @GetMapping("/product")
    public String product() {
        return "product";
    }

    @PostMapping("/save_product")
    public String save_product(Model model,
                                @RequestParam("ProdID") String prodID,
                                @RequestParam("prodRate") String prodRate,
                                @RequestParam("prodQty") String prodQty) {

        int orderQty = Integer.parseInt(prodQty);
        int orderValue = Integer.parseInt(prodRate) * orderQty;
        int ProdID = Integer.parseInt(prodID);

        jdbc.update("INSERT INTO ordermaster (prodID, prodRate, orderQty, OrderValue) VALUES (?, ?, ?, ?)",
                ProdID, prodRate, orderQty, orderValue);

        model.addAttribute("sms", "success");
        return "product";
    }
}