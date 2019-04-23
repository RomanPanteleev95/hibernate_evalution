package com.hibirnate.service.impl;

import com.hibirnate.dao.WorkerDao;
import com.hibirnate.dao.impl.WorkerDaoImpl;
import com.hibirnate.model.Worker;
import com.hibirnate.service.WorkerService;

import java.util.List;

public class WorkerServiceImpl implements WorkerService {

    WorkerDao workerDao = new WorkerDaoImpl();

    public void save(Worker worker) {
        workerDao.save(worker);
    }

    public void update(Worker worker) {
        workerDao.update(worker);
    }

    public void delete(Worker worker) {
        workerDao.delete(worker);
    }

    public Worker findById(long id) {
        return workerDao.findById(id);
    }

    public List<Worker> findAll() {
        return workerDao.findAll();
    }
}
