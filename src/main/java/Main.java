import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
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
        System.out.println("Press 6 : Exit");
        System.out.println("-----------------------------------");

        while (true){
            System.out.print("Press you number : ");
            Integer order = sc.nextInt();
            if (order == 1){
                System.out.print("Money : ");
                double money = sc.nextDouble();
                p.addMoney(money);
            }
            if (order == 2){
                System.out.print("Money : ");
                double money = sc.nextDouble();
                p.getMoney(money);
            }
            if (order == 3){
                System.out.println("Your money :" + p.getPocket());
            }
            if (order == 4){
                System.out.println("Your Income : " + p.getIncomeList());
            }
            if (order == 5){
                System.out.println("Your Excome : " + p.getExcomeList());
            }
            if (order == 6){
                System.out.println("Thank for use my program");
                break;
            }
        }
    }
}
