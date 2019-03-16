package courses.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
    private int id;
    @Column(name = "login")
    private String login;
    @Column(name = "passworld")
    private String pwd;
    @Column(name = "fio")
    private String name;
    @Column(name = "is_active")
    private int is_active;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id",nullable = true)
    private Roles user_id;




}
