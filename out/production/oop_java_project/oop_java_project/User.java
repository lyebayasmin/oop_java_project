package oop_java_project;

public class User {
   protected String name;
   protected String phonenumber;
   protected String email;
   protected String password;

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPhonenumber() {
      return this.phonenumber;
   }

   public void setPhonenumber(String phonenumber) {
      this.phonenumber = phonenumber;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public User(String name, String phonenumber, String email, String password) {
      this.name = name;
      this.phonenumber = phonenumber;
      this.email = email;
      this.password = password;
   }
}
