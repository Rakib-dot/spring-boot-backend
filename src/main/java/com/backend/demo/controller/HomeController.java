package com.backend.demo.controller;

import com.backend.demo.entity.Student;
import com.backend.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/")
public String index() {
    return "Welcome to backend app";
}
@PostMapping("/saveStudent")
    public Student saveData(@RequestBody Student student){
    studentRepository.save(student);
    return student;
}
@GetMapping("/getStudent/{roll}")
public Student getStudentData(@PathVariable int roll){
       Optional<Student> student= studentRepository.findById(roll);
       Student student1= student.get();
       return student1;
    }
@GetMapping("/getAllStudent")
 public List<Student> getAll(){
     List<Student> studentList=  studentRepository.findAll();
     return studentList;
 }
@DeleteMapping("/deleteStudent/{roll}")
    public String deleteStudent(@PathVariable int roll){
   Student student = studentRepository.findById(roll).get();
   if(student!=null){
       studentRepository.delete(student);
   }
    return "Deleted Successfully";
 }
 @PutMapping("/updateData")
    public Student updateStudentData(@RequestBody Student student){
   studentRepository.save(student);
   return student;
 }
}

