package Controller;

import Model.Student;
import Servise.StudentGroupService;

public class StudentGroupController {
    private final StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
