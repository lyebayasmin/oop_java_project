package oop_java_project;

public class Admin extends User {
   public Admin(String name, String phonenumber, String email, String password) {
      super(name, phonenumber, email, password);
   }

   public String getName() {
      return this.name;
   }

   public String getPhonenumber() {
      return this.phonenumber;
   }

   public String email() {
      return this.email;
   }

   public void setName(String name) {
      super.setName(name);
   }

   public void setPhonenumber(String phonenumber) {
      super.setName(phonenumber);
   }

   public void setEmail(String email) {
      super.setName(email);
   }
}
