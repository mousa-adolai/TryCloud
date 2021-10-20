package com.cydeo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.Driver.getDriver;

public class Talk {
    @FindBy(xpath = "//*[@id='app-navigation-vue']/div[1]/form/input")
    private WebElement conversation_search;

    Actions action = new Actions(getDriver());

    public Talk() {
        PageFactory.initElements(getDriver(), this);
    }

    private WebElement getMessageBox() {
        return getDriver().findElement(By.id("//div[@placeholder='Write message, @ to mention someone …']"));
    }

    public void searchUserConversation(String user) {
        conversation_search.sendKeys(user);
        conversation_search.sendKeys(Keys.ENTER);

        try {
            WebElement found_conversation =  getDriver().findElement(By.id("conversation_qscdmp89"));
            found_conversation.click();

            getMessageBox().sendKeys("This is a message");
        } catch (Exception ex) {
            WebElement found_user = getDriver().findElement(By.xpath("//div[@class='acli__content']/div[@class='acli__content__line-one']/span[@class='acli__content__line-one__title']"));
            found_user.click();
        }



    }
}
