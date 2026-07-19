package com.spring.security_example;

public class Student {
    private Long id;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Student(Long id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    private String name;
    private Integer marks;


}
