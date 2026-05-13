package com.example.bookPortal.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {


    @GetMapping("/books")
    public ResponseEntity<String> fetchBooks() {
        return ResponseEntity.ok("Books");
    }
    // Test Cases:-
    // 1.) Books Exist = 200 OK + List Of Books
    // 2.) No Books Exist = 200 OK + Empty list
    // 3.) DB disconnected = 500 Internal server Error
    // 4.) Wrong Endpoint = 404 Not Found

    @GetMapping("/save")
    public String save() {
        return "Request saved";
    }

    @GetMapping("/message")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/akshant")
    public ResponseEntity<String> akshantApi() {
        return ResponseEntity.ok("Akshant API Added");
    }

    @GetMapping("/author")
     public ResponseEntity<String> fetchauthor() {
        return ResponseEntity.ok("Author");
    }
    
}
