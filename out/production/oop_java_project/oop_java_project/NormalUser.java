package oop_java_project;

public class NormalUser extends User {
   public NormalUser(String name, String phonenumber, String email, String password) {
      super(name, phonenumber, email, password);
   }

   public String getName() {
      return this.name;
   }

   public String getPhonenumber() {
      return this.phonenumber;
   }

   public String getEmail() {
      return this.email;
   }

   public String getPassword() {
      return this.password;
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

   public void setPassword(String password) {
      super.setPassword(password);
   }
}
