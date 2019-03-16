package courses.controllers;

import courses.entity.Courses;
import courses.repositories.CourseRepository;
import courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/course/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "course/", method = RequestMethod.POST)
    public ResponseEntity<?> appendCourse(@RequestBody Courses courses){

        return new  ResponseEntity<>(courses, HttpStatus.OK);
    }

    @RequestMapping(value = "allcourses/",method = RequestMethod.GET)
    public ResponseEntity<?> getAllCourses(){
        List<Courses> list = courseService.findAllCourse();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }


}
