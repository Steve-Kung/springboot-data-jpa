package cn.stevekung.service;

import cn.stevekung.dao.WorkerRepository;
import cn.stevekung.pojo.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    WorkerRepository workerRepository;

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorkerById(Integer id) {
        return workerRepository.getOne(id);
    }

    @Override
    public void deleteWorkerById(Integer id) {
        workerRepository.deleteById(id);
    }

    @Override
    public void addWorker(Worker worker) {
        workerRepository.save(worker);
    }

    @Override
    // JPA 新增和修改用的都是save. 它根据实体类的id是否为0来判断是进行增加还是修改
    public void updateWorker(Worker worker) {
        workerRepository.save(worker);
    }
}
