package com.model;

import java.util.List;
import java.util.Map;

public class DoctorRepository {

    private Map<String, List<String>> doctorSchedule;

    public void setDoctorSchedule(Map<String, List<String>> doctorSchedule) {
        this.doctorSchedule = doctorSchedule;
    }

    public boolean isAvailable(String doctorId, String date) {
        if (!doctorSchedule.containsKey(doctorId)) return false;
        return doctorSchedule.get(doctorId).contains(date);
    }

    public void bookAppointment(String doctorId, String date) {
        doctorSchedule.get(doctorId).remove(date);
    }
}
