package com.example.Library_App.LibraryService;

import com.example.Library_App.Library.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Libraryservice {

    private final  static List<Library>  Libraries=new ArrayList<>();

    static {

        Libraries.add(new Library(1,"Mahan-Library","mahan college,Mumbai",List.of("Large Reading Area","A.c","Silent Environment")));
        Libraries.add(new Library(2,"City-Library","Delhi,Delhi",List.of("Large Reading Area","A.c","Silent Environment")));
        Libraries.add(new Library(3,"Swapna-Library","Kolkata,India",List.of("Large Reading Area","A.c","Silent Environment")));
        Libraries.add(new Library(4,"Inherit-Library","bengluru,India",List.of("Large Reading Area","A.c","Silent Environment")));
        Libraries.add(new Library(5,"Star-Library","Chennnai,india",List.of("Large Reading Area","A.c","Silent Environment")));

    }


    public List<Library> findall(){
        return Libraries;
    }

    public  Library FindByName(String name){
        for(Library library: Libraries){
            if(library.getName().equals(name)){
                return library;
            }
        }
        return null;
    }

    public void AddLibrary(Library newLibrary){
        Libraries.add(newLibrary);
    }

    public  void UpdateLibbrary(String name, Library newlibrary){
        Library library=FindByName(name);

        library.setNumber(newlibrary.getNumber());
        library.setName(newlibrary.getName());
        library.setAdrress(newlibrary.getAdrress());
        library.setFacilities(newlibrary.getFacilities());
    }


    public  void DeleteLibrary(String name){
        Library library=FindByName(name);
        Libraries.remove(library);
    }

}
