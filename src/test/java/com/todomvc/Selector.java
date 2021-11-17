package com.todomvc;

import org.openqa.selenium.By;

public class Selector {

    public static By TODO = By.xpath("//h1[contains(.,'todos')]");
    public static By TEXT_BOX = By.cssSelector("input[class='new-todo']");
    public static By BUY_SOME_MILK = By.xpath("//label[contains(.,'buy some milk')]");
    public static By ENJOY_THE_ASSIGNMENT = By.xpath("//label[contains(.,'enjoy the assignment')]");
    public static By CHECKBOX = By.xpath("(//input[@type='checkbox'])[2]");
    public static By CHECKBOX_COMPLETED = By.xpath("//li[@class='todo completed']");
    public static By DELETE = By.cssSelector(".destroy");
    public static By HOVER_ITEM = By.cssSelector(".todo:nth-child(1) label");
    public static By ACTIVE = By.xpath("//a[contains(text(),'Active')]");
    public static By DRINK_WATER = By.xpath("//label[contains(.,'drink water')]");

}
