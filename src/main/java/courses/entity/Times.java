package courses.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Data
@Table(name = "time")
public class Times {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int time_id;
    private LocalTime time;

    @ManyToMany(mappedBy = "times")
    Set<CurrentCourses> courses;

}
