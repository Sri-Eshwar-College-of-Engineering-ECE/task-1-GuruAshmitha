package com.healthcare;

import java.util.*;

public class PortalMain {

    public static void main(String[] args) {

        List<UserAccount> users = new ArrayList<>();
        List<PatientRecord> patients = new ArrayList<>();
        List<VisitAppointment> appointments = new ArrayList<>();

        // Sample data
        users.add(new UserAccount(1, "user1", "1234"));
        patients.add(new PatientRecord(1, "John", 30));
        appointments.add(new VisitAppointment(1, 1, "2026-02-20"));

        System.out.println("===== Healthcare Patient Portal =====");

        System.out.println("\n--- Users ---");
        for(UserAccount u : users) {
            System.out.println(u);
        }

        System.out.println("\n--- Patients ---");
        for(PatientRecord p : patients) {
            System.out.println(p);
        }

        System.out.println("\n--- Appointments ---");
        for(VisitAppointment a : appointments) {
            System.out.println(a);
        }
    }
}
