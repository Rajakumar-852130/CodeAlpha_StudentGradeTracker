package com.codealpha.gradetracker.service;

import com.codealpha.gradetracker.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GradeService {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public double calculateAverage() {
        if (students.isEmpty()) return 0;
        return students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public double getHighestScore() {
        if (students.isEmpty()) return 0;
        return students.stream()
                .mapToDouble(Student::getGrade)
                .max()
                .orElse(0.0);
    }

    public double getLowestScore() {
        if (students.isEmpty()) return 0;
        return students.stream()
                .mapToDouble(Student::getGrade)
                .min()
                .orElse(0.0);
    }

    public void clearAll() {
        students.clear();
    }
}
