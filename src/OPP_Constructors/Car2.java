package OPP_Constructors;

import java.io.FilterOutputStream;

public class Car2 {

    String model;
    int year;



    Car2(){
        model ="yyy";
        year= 1955;
        System.out.println(" DC");
    }
    public Car2(String model_name, int year_created) {
        this("3000");
        this.model = model_name;
        this.year = year_created;
    }
    Car2(String model_name){
        this.model = model_name;
    }

    }

