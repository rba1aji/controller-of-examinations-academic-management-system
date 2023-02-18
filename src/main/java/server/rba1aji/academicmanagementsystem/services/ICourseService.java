package server.rba1aji.academicmanagementsystem.services;

import org.springframework.stereotype.Service;
import server.rba1aji.academicmanagementsystem.models.Course;

import java.util.List;

public interface ICourseService {
    Course register(Course course);
    List<Course> getByDegreeBranchSemesterBatch(String degree, String branch, Integer semester, String batch);
    Course update(Course course);
    Course delete(Course course);
}
