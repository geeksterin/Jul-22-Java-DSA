import java.io.*;
import java.util.*;

class Movie {
    String name, leadActor, leadActress;
    int rating, money, profit;
}

public class A_HR_ClassesAndObjects1_1 {

    public static void main(String[] args) {
        
        Movie batman1 = new Movie();
        batman1.name = "batman 1";
        batman1.rating = 8;
        batman1.money = 200000;
        batman1.profit = 5000;
        batman1.leadActor = "Rachel Gupta & Nikhil Chinapa";
        batman1.leadActress = "Disha";
        
        Movie batman2 = new Movie();
        batman2.name = "batman 2";
        batman2.rating = 9;
        batman2.money = 500000;
        batman2.profit = 8000;
        batman2.leadActor = "Rannvijay Singha & Prince Narula";
        batman2.leadActress = "Neha Dhupia";
        
        Movie batman3 = new Movie();
        batman3.name = "batman 3";
        batman3.rating = 10;
        batman3.money = 700000;
        batman3.profit = 6000;
        batman3.leadActor = "Rachel Gupta & Prince Narula";
        batman3.leadActress = "Neha Dhupia";
        
        
        System.out.println(batman1.rating);
        System.out.println(batman1.money);
        System.out.println(batman1.profit);
        System.out.println(batman1.leadActor);
        System.out.println(batman1.leadActress);
        
        System.out.println(batman2.rating);
        System.out.println(batman2.money);
        System.out.println(batman2.profit);
        System.out.println(batman2.leadActor);
        System.out.println(batman2.leadActress);
        
        System.out.println(batman3.rating);
        System.out.println(batman3.money);
        System.out.println(batman3.profit);
        System.out.println(batman3.leadActor);
        System.out.println(batman3.leadActress);
        
    }
}