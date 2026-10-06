package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteUserDetails {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = session.get(User.class, 1);
        if (user != null) {
            session.delete(user);
        }

        transaction.commit();
        session.close();
        System.out.println("User deleted!");
    }
}
