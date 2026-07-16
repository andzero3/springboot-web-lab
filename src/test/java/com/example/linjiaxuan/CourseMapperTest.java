package com.example.linjiaxuan;

import com.example.linjiaxuan.entity.ECourse;
import com.example.linjiaxuan.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest(classes = LinJiaXuanApplication.class)
public class CourseMapperTest {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void testSelectAllCourses() {
        System.out.println("========== 查询所有课程信息 ==========");
        List<ECourse> courses = courseMapper.selectList(null);
        for (ECourse c : courses) {
            System.out.println(c);
        }
        System.out.println("======================================");
        System.out.println("共 " + courses.size() + " 条记录");
    }

    @Test
    public void testSelectByTeacherName() {
        System.out.println("========== 按老师姓名查询 ==========");
        List<ECourse> list = courseMapper.selectList(null);
        List<ECourse> result = list.stream()
                .filter(c -> "林嘉轩".equals(c.getTeacherName()))
                .collect(Collectors.toList());
        for (ECourse c : result) {
            System.out.println(c);
        }
        System.out.println("======================================");
    }
}
