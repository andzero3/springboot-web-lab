package com.example.linjiaxuan.controller;

import com.example.linjiaxuan.entity.ECourse;
import com.example.linjiaxuan.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseMapper courseMapper;

    @GetMapping("/course")
    public String courseList(Model model) {
        List<ECourse> courses = courseMapper.selectList(null);
        model.addAttribute("courses", courses);
        return "course";
    }
}
