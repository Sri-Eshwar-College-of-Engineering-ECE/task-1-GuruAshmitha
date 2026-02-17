package com.healthcare;

public class VisitAppointment {

    private int id;
    private int patientId;
    private String schedule;

    public VisitAppointment(int id, int patientId, String schedule) {
        this.id = id;
        this.patientId = patientId;
        this.schedule = schedule;
    }

    public String toString() {
        return "Appointment ID: " + id +
               ", Patient ID: " + patientId +
               ", Date: " + schedule;
    }
}
