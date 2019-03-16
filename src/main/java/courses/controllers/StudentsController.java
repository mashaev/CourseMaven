package courses.controllers;

import courses.entity.Students;
import courses.repositories.StudentsRepository;
import courses.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/students/")
public class StudentsController {

    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "append/",method = RequestMethod.POST)
    public ResponseEntity<?> appendStudents(Students students){
         return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @RequestMapping(value = "allstudent/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllStudents(){
        List<Students> list = studentService.findAllStudent();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
