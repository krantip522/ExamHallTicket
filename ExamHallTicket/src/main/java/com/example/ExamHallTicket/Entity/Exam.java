package com.example.ExamHallTicket.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName;
    private String IName;
    private String yearOfStudying;
    private String seatNumber;
    private String subject;
    private String day;
    private String date;
    private String time;
    
    
    public Exam() {
    	
    }
    
    
	public Exam(Long id, String fName, String iName, String yearOfStudying, String seatNumber, String subject,
			String day, String date, String time) {
		this.id = id;
		this.fName = fName;
		IName = iName;
		this.yearOfStudying = yearOfStudying;
		this.seatNumber = seatNumber;
		this.subject = subject;
		this.day = day;
		this.date = date;
		this.time = time;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getIName() {
		return IName;
	}
	public void setIName(String iName) {
		IName = iName;
	}
	public String getYearOfStudying() {
		return yearOfStudying;
	}
	public void setYearOfStudying(String yearOfStudying) {
		this.yearOfStudying = yearOfStudying;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Exam [id=" + id + ", fName=" + fName + ", IName=" + IName + ", yearOfStudying=" + yearOfStudying
				+ ", seatNumber=" + seatNumber + ", subject=" + subject + ", day=" + day + ", date=" + date + ", time="
				+ time + "]";
	}
    
    
}
