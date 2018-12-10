package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Model {
    protected static ArrayList<String> list=new ArrayList<String>( Arrays.asList("ATB | ул.Гагарина | 7778844 | Milka | 100 | 23.50 | 2350"));

    public void Basa2(){
        for(String list : list){
            System.out.println(list);
        }
    }
}