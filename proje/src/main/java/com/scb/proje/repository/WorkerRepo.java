package com.scb.proje.repository;

import com.scb.proje.entity.Worker;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class WorkerRepo implements IWorkerRepo{
    private EntityManager entityManager;

    Session session = entityManager.unwrap(Session.class);

    @Autowired
    public WorkerRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Worker> getAll() {
        List<Worker> worker = session.createQuery("from worker",Worker.class).getResultList();
        return worker;
    }

    @Override
    public void addWorker(Worker worker) {
        session.save(worker);
    }

    @Override
    public void deleteWorker(Worker worker) {
        session.delete(worker);
    }

    @Override
    public void updateWorker(Worker worker) {
        session.saveOrUpdate(worker);
    }

    @Override
    public Worker getById(int id) {
        Worker worker = session.get(Worker.class,id);
        return worker;
    }
}
