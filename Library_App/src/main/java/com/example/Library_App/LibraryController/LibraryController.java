package com.example.Library_App.LibraryController;


import com.example.Library_App.Library.Library;
import com.example.Library_App.LibraryService.Libraryservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/V1")
public class LibraryController {

    @Autowired
    Libraryservice service;

    @GetMapping("FindAll")
    public List<Library> FindallLibrary(){
          return   service.findall();
    }


    @GetMapping("findByName/username/{username}")
    public Library findByName(@PathVariable String username){
       return  service.FindByName(username);
    }


    @PostMapping("AddLibrary")
    public void AddLibrary(@RequestBody Library newLibrary){
        service.AddLibrary(newLibrary);
    }


    @PutMapping("UpdateLibrary/name/{name}")
    public void UpdateLibrary(@PathVariable String name, @RequestBody Library newLibrary){
        service.UpdateLibbrary(name,newLibrary);
    }


    @DeleteMapping("DeleteLibrary/name/{name}")
    public void DeleteLibrary(@PathVariable String name){
     service.DeleteLibrary(name);
        }

}
