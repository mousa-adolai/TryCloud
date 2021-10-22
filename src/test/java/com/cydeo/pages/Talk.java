package com.cydeo.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

import static com.cydeo.utilities.BrowserUtil.waitFor;
import static com.cydeo.utilities.Driver.getDriver;

public class Talk {
    @FindBy(xpath = "//*[@id='app-navigation-vue']/div[1]/form/input")
    private WebElement conversation_search;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    private WebElement message_entry_box;

    @FindBy(xpath = "//button[@class='new-message-form__button submit icon-confirm-fade']")
    private WebElement message_send;




    public Talk() {
        PageFactory.initElements(getDriver(), this);
    }

    public void finduser(String user) {
        conversation_search.sendKeys(user);
        conversation_search.sendKeys(Keys.ENTER);
        waitFor(5);
    }

    public void sendMessageToUser(String msg) {
        try {
            WebElement found_conversation =  getDriver().findElement(By.xpath("//div[@class='acli__content']"));
            found_conversation.click();

            message_entry_box.sendKeys(msg);
            waitFor(3);
            message_entry_box.sendKeys(Keys.ENTER);
        } catch (Exception ex) {
            WebElement found_user = getDriver().findElement(By.xpath("//a[@class='acli']"));
            found_user.click();

            message_entry_box.sendKeys(msg);
            waitFor(3);
            getDriver().findElement(By.xpath("//button[@class='new-message-form__button submit icon-confirm-fade']")).click();
        }
    }

    public boolean checkSentMessage(String msg) {
        boolean contained = false;

        waitFor(3);
        List<WebElement> messages = getDriver().findElements(By.xpath("//div[@class='rich-text--wrapper']"));

        for (WebElement message : messages) {
            if (message.getText().contains(msg)) {
                contained = true;
                break;
            }
        }

        return contained;
    }
}
