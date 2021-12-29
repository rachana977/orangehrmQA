package com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class LoginOrangePages extends PageObject {


    WebDriver webDriver=this.getDriver();

    public void openPage(){
        webDriver.get("https://opensource-demo.orangehrmlive.com");
        waitBit();
    }
    public void verifyLogin(String username,String password){
      find(By.id("txtUsername")).sendKeys(username);
      find(By.id("txtPassword")).sendKeys(password);
      waitBit();
    }

    public void clickSubmitButton(){
        find(By.id("btnLogin")).click();
        waitBit();
    }

    public void verifyUserInDashboard(){
       String text= find(By.tagName("h1")).getText();
        System.out.println("text:"+text);
        Assert.assertEquals("Dashboard1",text);
    }

    public void userClickedMyInfo(){
        find(By.id("menu_pim_viewMyDetails")).click();
        waitBit();
    }

    public void userClickedPersonalDetailsEdit(){
        find(By.id("btnSave")).click();
        waitBit();
    }
    public  void userUpdatePersonalData(){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)this.webDriver;


        ((JavascriptExecutor) webDriver).executeScript("document.getElementById('personal_txtEmpFirstName').value='TEST'");

      //  ((JavascriptExecutor) webDriver).executeScript("document.getElementById('frmEmpPersonalDetails').reset()");
       // ((JavascriptExecutor) this.webDriver).executeScript("document.getElementById('frmEmpPersonalDetails').reset()");
          this.waitABit(5000);
        find(By.id("personal_txtEmpFirstName")).sendKeys("Dila");
        waitBit();
        find(By.id("personal_txtEmpMiddleName")).sendKeys("R");
        waitBit();
        find(By.id("personal_txtEmpLastName")).sendKeys("Test");
        waitBit();
        find(By.id("personal_txtEmployeeId")).sendKeys("12345");
        waitBit();
        find(By.id("personal_txtLicenNo")).sendKeys("34324325");
        waitBit();
        find(By.id("personal_txtLicExpDate")).sendKeys("2021-12-25");
       // waitBit();

        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("document.activeElement.blur();");
        this.waitABit(1000);

        find(By.id("personal_optGender_1")).sendKeys("1");
        waitBit();
        find(By.id("personal_cmbMarital")).select().selectByValue("Married");
        waitBit();
        this.waitABit(3000);
        find(By.id("personal_cmbNation")).selectByValue("127");
        find(By.id("personal_txtEmpNickName")).sendKeys("nikcName");
        find(By.id("personal_chkSmokeFlag")).click();
        find(By.id("personal_txtMilitarySer")).sendKeys("No");
        this.waitABit(1000);
       // find(By.id("btnSave")).submit();
        this.waitABit(2000);
    }

    private void waitBit(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
