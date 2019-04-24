package com.hibirnate.dao;

import com.hibirnate.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkerDao extends JpaRepository<Worker, Long> {

}
