package courses.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity

public class Roles {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String role;
    private int is_active;


}
