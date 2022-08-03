package com.scb.proje.repository;

import com.scb.proje.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IWorkerRepo {

    List<Worker> getAll(); //tüm çalışanları getir.

    void addWorker(Worker worker);

    void deleteWorker(Worker worker);

    void updateWorker(Worker worker);

    Worker getById(int id);
}
