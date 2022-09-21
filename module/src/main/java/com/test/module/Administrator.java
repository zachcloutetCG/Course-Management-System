package com.test.module;

import java.util.ArrayList;

public class Administrator extends User {

  private ArrayList<Instructor> instructors = new ArrayList<>();
  private ArrayList<Student> students = new ArrayList<>();

  private void createInstructor() {
    instructors.add(new Instructor());
  }

  private void createStudent() {
    students.add(new Student());
  }
}
   


    

