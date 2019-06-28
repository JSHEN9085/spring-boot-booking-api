package com.jshen.booking;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController(){
        bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("Ibis", 90.0, 4));
        bookings.add(new HotelBooking("Marriot", 140.99, 1));
    }

    @GetMapping("bookings")
    public List<HotelBooking> getAll(){
        return bookings;
    }

    @GetMapping("/bookings/affordable/{budget}") //variable "{budget}" must has the same name as the argument below
    public List<HotelBooking> getAffordable(@PathVariable double budget){
        return bookings.stream().filter(x -> x.getPricePerNight() <= budget).collect(Collectors.toList());
    }

    @PostMapping("/bookings")
    public List<HotelBooking> createBooking(@RequestBody HotelBooking hotelBooking){
        bookings.add(hotelBooking);

        return bookings;
    }


}
