package courses.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class CurrentCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int cur_course_id;
    private int course_id;
    private int is_active;
    private String start_date;
    private String end_date;


    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teachers teachers;

    @ManyToMany
    @JoinTable(name = "student_courses",
    joinColumns = @JoinColumn(name = "cur_course_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Students> students;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Courses courses;

    @ManyToMany
            @JoinTable(name = "course_days",
            joinColumns = @JoinColumn(name = "cur_curses_days"),
            inverseJoinColumns = @JoinColumn(name = "days_id"))

    Set<Days> days;

    @ManyToMany
            @JoinTable(name = "course_times",
            joinColumns = @JoinColumn(name = "cur_course_id"),
            inverseJoinColumns = @JoinColumn(name = "time_id"))
    Set<Times> times;
}
