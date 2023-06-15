package com.atul.bookMyShow.util;

import com.atul.bookMyShow.model.Hall;
import com.atul.bookMyShow.model.Movie;
import com.atul.bookMyShow.model.Seat;

import java.util.*;

public class HallUtil {

    public static Hall createHall(int it, Movie movie, int nuOfSeats) {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i < nuOfSeats; i++) {
            Seat seat = new Seat(i, i);
        }

        return null;
    }
}
