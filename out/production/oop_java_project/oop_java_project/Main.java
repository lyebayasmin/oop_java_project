package oop_java_project;

import java.util.Scanner;

public class Main {
   static Scanner s;
   static Database database = new Database();

   public static void main(String[] args) {
      System.out.println("Welcome to Domestic Dream Team!");

      int n;
      do {
         System.out.println("1. Login");
         System.out.println("2. New User");
         s = new Scanner(System.in);
         n = s.nextInt();
         switch(n) {
         case 1:
            login();
            break;
         case 2:
            newUser();
         }
      } while(n != 0);

   }

   private static void login() {
      System.out.println("Enter phone number: ");
      s = new Scanner(System.in);
      String phonenumber = s.next();
      System.out.println("Enter password");
      s = new Scanner(System.in);
      String password = s.next();
      database.login(phonenumber, password);
   }

   private static void newUser() {
      System.out.println("Enter name:");
      String name = s.next();
      System.out.println("Enter phone number");
      String phonenumber = s.next();
      System.out.println("Enter email: ");
      String email = s.next();
      System.out.println("Enter password");
      String password = s.next();
      System.out.println("1. Admin");
      System.out.println("2. Normal User");
      int n = s.nextInt();
      switch(n) {
      case 1:
         System.out.println("Admin account created");
         User user = new Admin(name, phonenumber, email, password);
         database.addUser(user);
         break;
      case 2:
         System.out.println("Normal user account created");
         User nuser = new NormalUser(name, phonenumber, email, password);
         database.addUser(nuser);
      }

      database.getArraylist();
   }
}
