package courses.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "days")
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int day_id;
    private String name;
    private int is_active;

  /* @ManyToMany(mappedBy = "days")
    Set<CurrentCourses> courses;*/


}
