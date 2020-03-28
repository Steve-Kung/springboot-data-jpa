package cn.stevekung.service;

import cn.stevekung.pojo.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> getAllWorkers();
    Worker getWorkerById(Integer id);
    void deleteWorkerById(Integer id);
    void addWorker(Worker worker);
    void updateWorker(Worker worker);
}
