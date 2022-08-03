package com.scb.proje.service;

import com.scb.proje.entity.Worker;
import com.scb.proje.repository.IWorkerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService implements IWorkerService{

    private final IWorkerRepo iWorkerRepo;

    public WorkerService(IWorkerRepo iWorkerRepo) {
        this.iWorkerRepo = iWorkerRepo;
    }

    @Override
    public List<Worker> getAll() {
        return iWorkerRepo.getAll();
    }

    @Override
    public void addWorker(Worker worker) {
        iWorkerRepo.addWorker(worker);
    }

    @Override
    public void deleteWorker(Worker worker) {
        iWorkerRepo.deleteWorker(worker);

    }

    @Override
    public void updateWorker(Worker worker) {
        iWorkerRepo.updateWorker(worker);
    }

    @Override
    public Worker getById(int id) {
        return iWorkerRepo.getById(id);
    }
}
