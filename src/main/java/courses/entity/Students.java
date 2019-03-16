package courses.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Students {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    private String name;
    private String phone;
    private String email;
    private int is_active;
    private String info;
    private int age;

@ManyToMany(mappedBy = "students")
    Set<CurrentCourses> currentCourses;
}
