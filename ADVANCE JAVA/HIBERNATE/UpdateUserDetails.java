package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateUserDetails {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = session.get(User.class, 1);
        if (user != null) {
            user.setEmail("ram123@gmail.com");
            session.update(user);
        }

        transaction.commit();
        session.close();
        System.out.println("User updated!");
    }
}
