import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Income income = new Income();
        Excome excome = new Excome();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Welcome to InExCome");
        System.out.println("-----------------------------------");
        System.out.println(" ");
        System.out.println("What you want to do?");
        System.out.println("-----------------------------------");
        System.out.println("Press 1 : Add money");
        System.out.println("Press 2 : Get money");
        System.out.println("Press 3 : Show money in pocket");
        System.out.println("Press 4 : Show Income History");
        System.out.println("Press 5 : Show Excome History");
        System.out.println("Press 6 : Edit Income");
        System.out.println("Press 6 : Edit Excome");
        System.out.println("Press 7 : Exit");
        System.out.println("-----------------------------------");

        while (true) {
            System.out.print("Press you number : ");
            Integer order = sc.nextInt();
            if (order == 1) {
                System.out.print("Money : ");
                double money = sc.nextDouble();
                System.out.print("Date : ");
                String date = sc.next();
                System.out.print("Catagory : ");
                String cat = sc.next();
                System.out.print("Description : ");
                String des = sc.next();
                income.add(money, date, cat, des);
            }
            if (order == 2) {
                System.out.print("Money : ");
                double money = sc.nextDouble();
                System.out.print("Date : ");
                String date = sc.next();
                System.out.print("Catagory : ");
                String cat = sc.next();
                System.out.print("Description : ");
                String des = sc.next();
                excome.add(money, date, cat, des);
            }
            if (order == 3) {
                System.out.println("Your money :" + person.getPocket());
            }
            if (order == 4) {
                System.out.println("Your Income : " + income.getAmountList());
            }
            if (order == 5) {
                System.out.println("Your Excome : " + excome.getAmountList());
            }
            if (order == 6) {
                System.out.println("Your Income : " + income.getAmountList());
                System.out.print("Which index do u want to edit : ");
                int index = sc.nextInt();
                System.out.print("Press 1 edit Money");
                System.out.print("Press 2 edit Date");
                System.out.print("Press 4 edit Catagory");
                System.out.print("Press 5 edit Description ");
                System.out.print("Press Number : ");
                int loc = sc.nextInt();
                System.out.print("New Input: ");
                String input = sc.next();
                income.edit(index,loc, input);
            }
            if (order == 7) {
                System.out.println("Your Income : " + excome.getAmountList());
                System.out.print("Which index do u want to edit : ");
                int index = sc.nextInt();
                System.out.print("Press 1 edit Money");
                System.out.print("Press 2 edit Date");
                System.out.print("Press 4 edit Catagory");
                System.out.print("Press 5 edit Description ");
                System.out.print("Press Number : ");
                int loc = sc.nextInt();
                System.out.print("New Input: ");
                String input = sc.next();
                excome.edit(index,loc, input);
            }
            if (order == 8) {
                System.out.println("Thank for use my program");
                break;
            }
        }
    }
}
