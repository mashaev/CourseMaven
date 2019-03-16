package courses.services.impls;

import courses.entity.Courses;
import courses.repositories.CourseRepository;
import courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    @Autowired
   private CourseRepository courseRepository;
    @Override
    public List<Courses> findAllCourse() {
        return courseRepository.findAll() ;
    }
}
