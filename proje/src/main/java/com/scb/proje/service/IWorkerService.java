package com.scb.proje.service;

import com.scb.proje.entity.Worker;

import java.util.List;

public interface IWorkerService {

    List<Worker> getAll(); //tüm çalışanları getir.

    void addWorker(Worker worker);

    void deleteWorker(Worker worker);

    void updateWorker(Worker worker);

    Worker getById(int id);
}
