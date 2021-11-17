package com.todomvc;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Steps extends BaseMethod {


    @Step("Empty ToDo List")
    public void toDo() {
        String checkBuySomeMilk = findElement(Selector.TODO).getText();
        Assert.assertEquals("todos", checkBuySomeMilk);

    }

    @Step("write <text> to text box and press enter")
    public void iWriteBuySomeMilk(String text) {
        findElement(Selector.TEXT_BOX).sendKeys(text + Keys.ENTER);

    }

    @Step("I should see buy some milk item in ToDo list")
    public void iShouldSeeBuySomeMilk() {
        String checkBuySomeMilk = findElement(Selector.BUY_SOME_MILK).getText();
        Assert.assertEquals("buy some milk", checkBuySomeMilk);

    }

    @Step("I should see enjoy the assignment item insterted todo list below buy some milk item")
    public void iShouldSeeMilkAndAssignment() {
        String checkBuySomeMilk = findElement(Selector.BUY_SOME_MILK).getText();
        Assert.assertEquals("buy some milk", checkBuySomeMilk);
        String checkEnjoyAssignment = findElement(Selector.ENJOY_THE_ASSIGNMENT).getText();
        Assert.assertEquals("enjoy the assignment", checkEnjoyAssignment);
    }

    @Step("I should see buy some milk item marked as done")
    public void shouldSeeMilkItem() {
        boolean isDisplay = findElement(Selector.CHECKBOX_COMPLETED).isDisplayed();
        Assert.assertTrue("Ustu Cizili Degil", isDisplay);
    }

    @Step("write <text> and click checbox")
    public void writeAndClickCheckbox(String text) {
        findElement(Selector.TEXT_BOX).sendKeys(text + Keys.ENTER);
        findElement(Selector.CHECKBOX).click();

    }

    @Step("I click on checkbox")
    public void unMarkedBuySomeMilk() {
        findElement(Selector.CHECKBOX).click();
    }

    @Step("I should see buy some milk item marked as undone")
    public void shouldSeeUnDone() {
        boolean isDisplay = findElement(By.xpath("//li[@class='todo']")).isDisplayed();
        Assert.assertTrue("Ustu Cizili Degil", isDisplay);
    }

    @Step("I click on delete button next to item")
    public void deleteButton() {
        hoverElement(Selector.HOVER_ITEM);
        wait.until(ExpectedConditions.elementToBeClickable(Selector.DELETE));
        findElement(Selector.DELETE).click();
    }

    @Step("List should be empty")
    public void thenListShouldBeEmpty() {
        boolean checkActive = findElement(Selector.ACTIVE).isDisplayed();
        Assert.assertFalse("Liste Bos Degil", checkActive);
    }

    @Step("list with <text> and <text2> item in order")
    public void iWriteWhileAndDrink(String text, String text2) {
        findElement(Selector.TEXT_BOX).sendKeys( text + Keys.ENTER);
        findElement(Selector.TEXT_BOX).sendKeys( text2 + Keys.ENTER);

    }

    @Step("I click on delete button next to rest for a while item")
    public void deleteRestForAWhile() {
        hoverElement(Selector.HOVER_ITEM);
        wait.until(ExpectedConditions.elementToBeClickable(Selector.DELETE));
        findElement(Selector.DELETE).click();
    }

    @Step("I should see drink water item in ToDo list")
    public void checkDrinkWater() {
        String checkDrinkWater = findElement(Selector.DRINK_WATER).getText();
        Assert.assertEquals("drink water", checkDrinkWater);

    }

}