package com.example.Library_App.Library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library {


    private int number;
    private String name;
    private String Adrress;
    private List<String> Facilities;

}
