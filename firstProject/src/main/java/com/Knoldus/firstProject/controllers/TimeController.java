package com.Knoldus.firstProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class TimeController {


    // Runs at http://localhost:8001/status
    @RequestMapping(value = "status")
    @ResponseBody
    public String status() {
        Format f = new SimpleDateFormat("HH.mm.ss");
        return "Running, " + f.format(new Date());
    }


    // Runs at http://localhost:8001/
    @RequestMapping(value = "")
    @ResponseBody
    public String home() {
        Format f = new SimpleDateFormat("HH.mm.ss");
        return "<h1> This is a Home Page.<br> Current Time is: " + f.format(new Date());
    }
}
