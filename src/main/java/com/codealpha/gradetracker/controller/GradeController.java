package com.codealpha.gradetracker.controller;

import com.codealpha.gradetracker.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("students", gradeService.getAllStudents());
        model.addAttribute("average", String.format("%.2f", gradeService.calculateAverage()));
        model.addAttribute("highest", gradeService.getHighestScore());
        model.addAttribute("lowest", gradeService.getLowestScore());
        return "index";
    }

    @PostMapping("/add")
    public String addStudent(@RequestParam String name, @RequestParam double grade) {
        gradeService.addStudent(name, grade);
        return "redirect:/";
    }

    @PostMapping("/clear")
    public String clear() {
        gradeService.clearAll();
        return "redirect:/";
    }
}
