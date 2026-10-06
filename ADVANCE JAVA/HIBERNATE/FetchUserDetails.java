package com.example;

import org.hibernate.Session;

public class FetchUserDetails {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        User user = session.get(User.class, 1);
        if (user != null) {
            System.out.println("User ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
        }

        session.close();
    }
}
