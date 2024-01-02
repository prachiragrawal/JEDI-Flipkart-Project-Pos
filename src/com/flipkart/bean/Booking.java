package com.flipkart.bean;

import java.util.Date;

public class Booking {
    private Integer bookingId;
    private Integer customerId;
    private Integer centerId;
    private Integer slotId;
    private Double amount;
    private Date bookingDate;

    // Constructor
    public Booking(Integer bookingId, Integer customerId, Integer centerId, Integer slotId, Double amount, Date bookingDate) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.centerId = centerId;
        this.slotId = slotId;
        this.amount = amount;
        this.bookingDate = bookingDate;
    }

    // Getter and setter methods
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    public Integer getSlotId() {
        return slotId;
    }

    public void setSlotId(Integer slotId) {
        this.slotId = slotId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
