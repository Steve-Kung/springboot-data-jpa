package cn.stevekung.controller;

import cn.stevekung.pojo.Worker;
import cn.stevekung.service.WorkerService;
import cn.stevekung.service.WorkerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpa")
public class WorkerController {

    @Autowired
    WorkerServiceImpl workerService;

    @GetMapping("/getAllWorkers")
    public List<Worker> getAllWorkers(){
        return workerService.getAllWorkers();
    }

    @GetMapping("/getWorkerById/{id}")
    Worker getWorkerById(@PathVariable("id") Integer id){
        return workerService.getWorkerById(id);
    }

    @GetMapping("/deleteWorkerById/{id}")
    void deleteWorkerById(@PathVariable("id") Integer id){
        workerService.deleteWorkerById(id);
    }

    @GetMapping("/addWorker")
    void addWorker(){
        Worker worker = new Worker("steve", "kung", "stevekung98@163.com");
        workerService.addWorker(worker);
    }

    @GetMapping("/updateWorker")
    void updateWorker(){
        Worker worker = new Worker(1,"steve01", "kung01", "stevekung0198@163.com");
        workerService.updateWorker(worker);
    }
}
