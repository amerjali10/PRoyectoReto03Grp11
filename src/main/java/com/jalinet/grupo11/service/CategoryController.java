/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jalinet.grupo11.service;


import com.jalinet.grupo11.entities.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JaliNet
 */
@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
    @CrossOrigin(origins = "http://132.226.240.254")
    @GetMapping("/all")
      public List<Category> getCategorys() {return categoryService.getAll();};

    @CrossOrigin(origins = "http://132.226.240.254")
    @GetMapping("/{id}")
      public Optional<Category> getCategory(@PathVariable("id") int categoryId) {
          return categoryService.getCategory(categoryId);
      }

    @CrossOrigin(origins = "http://132.226.240.254")
    @PostMapping("/save")
      public Category save(@RequestBody Category category) {return categoryService.save(category);};
      
}
