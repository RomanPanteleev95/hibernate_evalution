package com.hibirnate.service.impl;

import com.hibirnate.dao.WorkerDao;
import com.hibirnate.model.Worker;
import com.hibirnate.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    WorkerDao workerDao;

    public void save(Worker worker) {
        workerDao.saveAndFlush(worker);
    }

    public void update(Worker worker) {
        workerDao.saveAndFlush(worker);
    }

    public void delete(Worker worker) {
        workerDao.delete(worker);
    }

    public Worker findById(long id) {
        return workerDao.getOne(id);
    }

    public List<Worker> findAll() {
        return workerDao.findAll();
    }
}
