import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class CCBTest {

    Person person = new Person();

    @Given("a user no money in pocket = 0")
    public void a_user_no_money_in_pocket(){
        assertEquals(person.getPocket(),0.00);
    }
    @Given(" Add Money with Minus")
    public  void  Add_Money_with_Minus(){
        assertEquals(person.getPocket(),0.00);
    }
    @Given("a user have 50.00 money in pocket")
    public  void a_user_have_50_00_money_in_pocket(){
        person.addMoney(50.00);
        assertEquals(person.getPocket(),50.00);
    }
    @When("I add money to 50.00")
    public void i_add_money_to(double money){
        person.addMoney(money);
    }
    @Then("My pocket have 50.00")
    public void my_pocket_have_money(){
        assertTrue(person.getPocket()>0);
    }
    @When("I add money to -50")
    public void I_add_money_to(double money){
        person.addMoney(-money);
    }
    @Then("Show \"Cannot add money with minus\"")
    public void Show_Cannot_add_money_with_minus(){
        assertTrue(person.getPocket()==0);
    }
    @When("I get money to 50")
    public void I_get_money_to(double money){
        person.addMoney(money);
    }
    @Then("My pockey have 0.00")
    public void My_pocket_have_zero(){
        assertTrue(person.getPocket()<50.00);
    }
}
