package stepDefinitions;

import common.CommonLibraries;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MenuStepDefinition extends CommonLibraries {

    @Given("I am on the home page {string}")
    public void i_am_on_the_home_page(String url) {
    driver.get(url);
    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
    @When("I mouse over on the header menu option {string}")
    public void i_mouse_over_on_the_header_menu_option(String menuOption) {

        WebElement menu = driver.findElement(By.xpath("//span[text()='"+menuOption+"']"));
        Actions mouseAction = new Actions(driver);
        mouseAction.moveToElement(menu);
        menu.click();
    }

    @When("I click on the menu option")
    public void i_click_on_the_menu_option() {

    }
    @Then("I should be able to see the appropriate page {string}")
    public void i_should_be_able_to_see_the_appropriate_page(String expectedTitle) {

    String actualTitle = driver.getTitle();
    Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


}
