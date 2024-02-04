package homework3;

public class Main {
    public static void main(String[] args) {
        Employers employer1 = new Employers("Sergio Loe", "Developer", "sergioloe@gg.com", 881388, 3000, 25);
        employer1.getInfo();
        Employers employer2 = new Employers("Gennadiy Pop", "HR", "gennadiypop@gg.com", 885512, 1300, 42);
        employer2.getInfo();
        Employers employer3 = new Employers("Mark Rewie", "Business Analyst", "markrewie@gg.com", 887171, 1700, 32);
        employer3.getInfo();
        Employers employer4 = new Employers("Viktor Lorens", "QA", "viktorlorens@gg.com", 883399, 2000, 33);
        employer4.getInfo();
        Employers employer5 = new Employers("Alex Gibbs", "Project Manager", "alexgibbs@gg.com", 889999, 4000, 45);
        employer5.getInfo();

        Employers[] employersArray = new Employers[5];
        employersArray[0] = employer1;
        employersArray[1] = employer2;
        employersArray[2] = employer3;
        employersArray[3] = employer4;
        employersArray[4] = employer5;

        System.out.println("Employers older than 40 years : " + "\n");
        for (Employers employer : employersArray) {
            if (employer.age > 40) {
                System.out.println(employer.getInfo());
            }
        }


    }
}
