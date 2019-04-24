package com.hibirnate.service;

import com.hibirnate.model.Worker;

import java.util.List;

public interface WorkerService {
    void save(Worker worker);
    void update(Worker worker);
    void delete(Worker worker);
    Worker findById(long id);
    List<Worker> findAll();
}
