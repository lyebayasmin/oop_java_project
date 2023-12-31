package oop_java_project;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name, String phonenumber, String email, String password) {
        super(name, phonenumber, email , password);
        this.functions = new Functions[] {
                new Addworker(),
                new Removeworker(),
                new Updateworker(),
                new Searchworker(),
                new Seeorders(),
                new Seecomplaints(),
                new Seemsg(),
                new DeleteallData(),
                new Exit()


            };
        }

    public String getName() {
        return name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public String email() {
        return email;
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
    @Override
    public void menu(){
        System.out.println("*****Admin Menu***** \n");
        System.out.println("1. Add Worker \n");
        System.out.println("2. Remove Worker: \n");
        System.out.println("3. Update worker: \n");
        System.out.println("4. Search Worker: \n");
        System.out.println("5. See Orders: \n");
        System.out.println("6. See Complaints \n");
        System.out.println("7. See Messages: \n");
        System.out.println("8. Delete All Data: \n");
        System.out.println("9. Exit\n");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        functions[n-1].function();
    }





}
