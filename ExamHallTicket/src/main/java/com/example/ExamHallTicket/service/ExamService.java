package com.example.ExamHallTicket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamHallTicket.Entity.Exam;
import com.example.ExamHallTicket.dao.ExamDao;

@Service
public class ExamService {
    @Autowired
    private ExamDao examDAO;

    public Exam generateHallTicket(Exam exam) {
        // Generate unique seat number
        long seatCount = examDAO.count();
        String seatNumber = "SEAT" + (seatCount + 1);
        exam.setSeatNumber(seatNumber);

        // Set the subject, day, date, and time for the paper
        // This could be dynamic based on actual exam schedule
        exam.setSubject("Mathematics");
        exam.setDay("Monday");
        exam.setDate("2023-06-10");
        exam.setTime("10:00 AM - 1:00 PM");

        // Save to database
        Exam savedExam = examDAO.save(exam);

        // Print to console
        System.out.println(savedExam);

        return savedExam;
    }

    public List<Exam> getAllExams() {
        return examDAO.findAll();
    }
}
