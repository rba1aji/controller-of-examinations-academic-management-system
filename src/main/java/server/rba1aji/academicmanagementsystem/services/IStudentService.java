package server.rba1aji.academicmanagementsystem.services;

import jakarta.security.auth.message.AuthException;
import org.springframework.stereotype.Service;
import server.rba1aji.academicmanagementsystem.models.Student;

import java.util.List;

public interface IStudentService {
    Student register(Student newstudent) throws Exception;

    String registerMultiple(List<Student> studentList) throws AuthException;

    Student getByIdDob(Long id, String dateofbirth);

    List<Student> getAll();

    List<Student> getByBranchidList(List<String> branchidList);

    Student update(Long id, Student student) throws Exception;

    Student getById(Long id) throws Exception;
    List<Student> getByStartidEndid(Long startid, Long endid);
}
