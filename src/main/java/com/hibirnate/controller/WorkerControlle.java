package com.hibirnate.controller;

import com.hibirnate.model.Worker;
import com.hibirnate.service.WorkerService;
import com.hibirnate.service.impl.WorkerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WorkerControlle {

    @GetMapping("/workers")
    public String workerView(Model model) {
        WorkerService workerService = new WorkerServiceImpl();
        List<Worker> workers = workerService.findAll();
        model.addAttribute("workers", workers);
        return "index";
    }
}
