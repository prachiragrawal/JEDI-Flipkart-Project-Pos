package com.flipkart.bean;

import java.util.Date;

public class Slot {
    private Integer slotId;
    private Integer centerId;
    private Date startTime;
    private Date endTime;
    private Integer availableSeats;

    // Constructor
    public Slot(Integer slotId, Integer centerId, Date startTime, Date endTime, Integer availableSeats) {
        this.slotId = slotId;
        this.centerId = centerId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.availableSeats = availableSeats;
    }

    // Getter and setter methods
    public Integer getSlotId() {
        return slotId;
    }

    public void setSlotId(Integer slotId) {
