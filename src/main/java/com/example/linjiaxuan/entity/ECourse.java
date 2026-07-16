package com.example.linjiaxuan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("course")
public class ECourse {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String courseName;
    private String courseNo;
    private String teacherName;
    private String className;
    private String courseDay;
    private String coursePeriod;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public String getCourseNo() { return courseNo; }
    public void setCourseNo(String courseNo) { this.courseNo = courseNo; }
    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }
    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }
    public String getCourseDay() { return courseDay; }
    public void setCourseDay(String courseDay) { this.courseDay = courseDay; }
    public String getCoursePeriod() { return coursePeriod; }
    public void setCoursePeriod(String coursePeriod) { this.coursePeriod = coursePeriod; }

    @Override
    public String toString() {
        return "ECourse{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", courseNo='" + courseNo + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", className='" + className + '\'' +
                ", courseDay='" + courseDay + '\'' +
                ", coursePeriod='" + coursePeriod + '\'' +
                '}';
    }
}
