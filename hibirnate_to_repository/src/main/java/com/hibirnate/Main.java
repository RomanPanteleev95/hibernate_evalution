package com.hibirnate;

import com.hibirnate.model.Worker;
import com.hibirnate.service.WorkerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories("com.hibirnate.dao")
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Main.class, args);
        WorkerService workerService = applicationContext.getBean(WorkerService.class);
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
