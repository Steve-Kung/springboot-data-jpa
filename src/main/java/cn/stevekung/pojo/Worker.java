package cn.stevekung.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//使用JPA注解配置映射关系
@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "tb_worker") //@Table来指定和哪个数据表对应;如果省略默认表名就是worker；
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Worker {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    // JPA @Column 字段命名 默认驼峰转换
    @Column(name = "last_name",length = 50) //这是和数据表对应的一个列
    private String lastName;

    @Column //默认驼峰转换下划线 长度默认255varchar int默认长度11
    private String firstName;

    @Column //省略默认列名就是属性名
    private String email;

    public Worker(String lastName, String firstName, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

}
