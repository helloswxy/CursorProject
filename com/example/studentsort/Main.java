package com.example.studentsort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 85));
        students.add(new Student("李四", 92));
        students.add(new Student("王五", 78));

        // 按分数从高到低排序
        students.sort((s1, s2) -> s2.getScore() - s1.getScore());

        // 输出排序结果
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getScore());
        }
    }    
} 