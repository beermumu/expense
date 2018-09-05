import java.util.ArrayList;

public class Person {
    private double pocket;
    ArrayList<String> incomeList = new ArrayList<String>();
    ArrayList<String> excomeList = new ArrayList<String>();

    public void addMoney(double money){
        if (money >= 0){
            pocket += money;
            incomeList.add(Double.toString(money));
        }else{
            System.out.println("Cannot add money with minus");
        }
    }
    public void getMoney(double money){
        if (money >= 0 ){
                pocket -= money;
                excomeList.add(Double.toString(money));
        }else{
                System.out.println("Cannot add money with minus");
        }
    }
    public double getPocket() {
        return pocket;
    }

    public ArrayList getIncomeList() {
        return incomeList;
    }

    public ArrayList getExcomeList() {
        return excomeList;
    }
}
