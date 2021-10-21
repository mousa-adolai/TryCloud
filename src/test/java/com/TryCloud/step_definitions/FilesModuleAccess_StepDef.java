package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilesModulePage;
import com.TryCloud.pages.FilesSettingsPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;


public class FilesModuleAccess_StepDef {
    LoginPage loginPage = new LoginPage();
    FilesModulePage filesModulePage = new FilesModulePage();
    FilesSettingsPage filesSettingsPage= new FilesSettingsPage();
    BrowserUtil browserUtil= new BrowserUtil();

    @Given("Login as a user")
    public void login_as_a_user() {
        loginPage.goTo();

    }
    @Given("Login as a user {string} and passcode {string}")
        public void loginAsAUserAndPasscode(String email, String password) {
        loginPage.login(email, password);
        }

        @And("Click Settings on the left bottom corner")
        public void clickSettingsOnTheLeftBottomCorner () {
        filesModulePage.filesTab.click();
        filesSettingsPage.settingsBtn.click();
        }

        @Then("Verify user can click any buttons")
        public void verifyUserCanClickAnyButtons () {
         browserUtil.waitFor(4);
        filesSettingsPage.firstCheckBox.click();
        assertTrue(filesSettingsPage.firstCheckBox.isSelected());
      /*  filesSettingsPage.secondCheckBox.click();
        assertTrue(filesSettingsPage.secondCheckBox.isSelected());
        filesSettingsPage.thirdCheckBox.click();
        assertTrue(filesSettingsPage.thirdCheckBox.isSelected());

       */
        }
}
