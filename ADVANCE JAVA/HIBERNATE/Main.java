package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User("Ram", "ram@gmail.com");
        session.save(user);

        transaction.commit();
        session.close();

        System.out.println("User saved successfully!");
    }
}
