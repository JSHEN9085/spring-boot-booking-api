package com.jshen.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController(){
        bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("Ibis", 90.0, 4));
        bookings.add(new HotelBooking("Marriot", 140.99, 1));
    }

    @GetMapping
    public List<HotelBooking> getAll(){
        return bookings;
    }


}
