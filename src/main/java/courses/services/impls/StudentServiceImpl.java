package courses.services.impls;

import courses.entity.Students;
import courses.repositories.StudentsRepository;
import courses.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
   private StudentsRepository studentsRepository;
    @Override
    public List<Students> findAllStudent() {
        return studentsRepository.findAll() ;
    }
}
