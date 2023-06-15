package com.atul.bookMyShow;

import com.atul.bookMyShow.model.Hall;
import com.atul.bookMyShow.model.Movie;
import com.atul.bookMyShow.model.Theater;
import com.atul.bookMyShow.model.User;
import com.atul.bookMyShow.util.HallUtil;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        //1. creates users
        User atul = new User(1, "Atul");
        User arush = new User(2, "Arush");

        //2. create cities
        List<String> cities = Arrays.asList("Meerut", "Hyderabad", "delhi", "Agra");

        //3. creates Movies
        Movie avengers = new Movie(1, "Avengers", cities);
        Movie ironMan = new Movie(1, "Iron Man", cities);


        //2. create theaters
        Hall waveScreenOne = HallUtil.createHall(1, avengers, 60);
        Hall waveScreenTwo = HallUtil.createHall(2, avengers, 60);
        Hall waveScreenThree = HallUtil.createHall(3, avengers, 60);
        List<Hall> waveHalls = Arrays.asList(waveScreenOne, waveScreenTwo, waveScreenThree) ;
        Theater wave = new Theater(1, "Meerut", waveHalls);






        //3. creates movies
    }

}
