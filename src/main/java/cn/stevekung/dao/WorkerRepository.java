package cn.stevekung.dao;

        import cn.stevekung.pojo.Worker;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer>{

}
