package com.mh.test.student;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Student implements Serializable {

    @SequenceGenerator(
            name="seq_student",
            sequenceName ="seq_student",
            initialValue = 1,
            allocationSize = 1
    )

    @Id
    @GeneratedValue(generator = "seq_student")
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public Student(){}

    public Student(Long id, String name, Integer age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
