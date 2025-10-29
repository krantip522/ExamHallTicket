package com.example.ExamHallTicket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ExamHallTicket.Entity.Exam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ExamDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Exam save(Exam exam) {
        entityManager.persist(exam);
        return exam;
    }

    public long count() {
        return (long) entityManager.createQuery("SELECT COUNT(e) FROM Exam e").getSingleResult();
    }

    public List<Exam> findAll() {
        return entityManager.createQuery("FROM Exam", Exam.class).getResultList();
    }
}
