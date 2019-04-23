package com.hibirnate.dao.impl;


import com.hibirnate.dao.WorkerDao;
import com.hibirnate.model.Worker;
import com.hibirnate.util.HibirnateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class WorkerDaoImpl implements WorkerDao {
    public void save(Worker worker) {
        Session session = HibirnateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(worker);
        transaction.commit();
        session.close();
    }

    public void update(Worker worker) {
        Session session = HibirnateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(worker);
        transaction.commit();
        session.close();
    }

    public void delete(Worker worker) {
        Session session = HibirnateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(worker);
        transaction.commit();
        session.close();
    }

    public Worker findById(long id) {
        return HibirnateSessionFactoryUtil.getSessionFactory().openSession().get(Worker.class, id);
    }

    public List<Worker> findAll() {
        return HibirnateSessionFactoryUtil.getSessionFactory().openSession().createQuery("FROM Worker").list();
    }
}
