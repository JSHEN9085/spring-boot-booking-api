package com.jshen.booking;

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int numberOfNight;

    public HotelBooking(String hotelName, double pricePerNight, int numberOfNight) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.numberOfNight = numberOfNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public double getTotalPrice() {
        return pricePerNight * numberOfNight;
    }
}
