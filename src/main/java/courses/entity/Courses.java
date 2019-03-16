package courses.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Courses {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private int courseId;
 private String courseName;
private int price;
private int isActive;
private String duration;




}
