package courses.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "teachers")
public class Teachers {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int teacher_id;
    private String name;
    private String phone;
    private int is_active;

    @OneToMany(mappedBy = "teachers")
Set<CurrentCourses> coursesSet;


}
