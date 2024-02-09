package homework3;

public class Employers {
    public String nameAndSurname;
    public String position;
    public String email;
    public int phoneNumber;
    public int salary;
    public int age;
    public String[] listOfEmployers;

    public Employers(String nameSurname, String profession, String mail, int phone, int pay, int years) {
        nameAndSurname = nameSurname;
        position = profession;
        email = mail;
        phoneNumber = phone;
        salary = pay;
        age = years;

    }

    public String getInfo() {
        return "Employee name and surname is : " + nameAndSurname + "\n" +
                "Employee position is : " + position + "\n" +
                "Employee email is : " + email + "\n" +
                "Employee phone number is : " + phoneNumber + "\n" +
                "Employee age is : " + age + "\n" +
                "___________________________________________" + "\n";
        // System.out.println("Employee name and surname is : "+ nameAndSurname);
        //System.out.println("Employee position is : " +position);
        //System.out.println("Employee email is : " +email);
        //System.out.println("Employee phone number is : " + phoneNumber);
        //System.out.println("Employee age is : " + age);
        //System.out.println("___________________________________________");
    }
}
