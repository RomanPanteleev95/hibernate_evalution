package com.hibirnate;

import com.hibirnate.model.Worker;
import com.hibirnate.service.WorkerService;
import com.hibirnate.service.impl.WorkerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        WorkerService workerService = new WorkerServiceImpl();
        List<Worker> workers = workerService.findAll();
        System.out.println(workers);
//        Worker worker = workerService.findById(1L);
//        System.out.println(worker);
//        Worker worker1 = new Worker("Roman", 14);
//        workerService.save(worker1);
//        worker.setName("Grisha");
//        workerService.update(worker);
//        workerService.delete(worker);
    }
}
