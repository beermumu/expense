public class Person {
    private double pocket;
    Excome excome = new Excome();
    Income income = new Income();

    public Double getPocket() {
        pocket = income.sum() - excome.sum();
        return pocket;
    }
}