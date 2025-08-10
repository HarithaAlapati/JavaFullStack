package com.model;

public class AppointmentService {

    private DoctorRepository doctorRepository;

    public void setDoctorRepository(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public String book(String doctorId, String date) {
        if (!doctorRepository.isAvailable(doctorId, date)) {
            return "Doctor not available";
        }
        doctorRepository.bookAppointment(doctorId, date);
        return "Appointment confirmed";
    }
}
