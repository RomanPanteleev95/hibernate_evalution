package com.hibirnate.dao;

import com.hibirnate.model.Worker;

import java.util.List;

public interface WorkerDao {
    void save(Worker worker);
    void update(Worker worker);
    void delete(Worker worker);
    Worker findById(long id);
    List<Worker> findAll();
}
