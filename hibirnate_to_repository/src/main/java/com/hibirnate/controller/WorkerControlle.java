package com.hibirnate.controller;

import com.hibirnate.model.Worker;
import com.hibirnate.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WorkerControlle {

    @Autowired
    WorkerService workerService;

    @GetMapping("/workers")
    public String workerView(Model model) {
        List<Worker> workers = workerService.findAll();
        model.addAttribute("workers", workers);
        return "index";
    }
}
