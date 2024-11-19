package maventest.maven_testng;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ODS {

    public WebDriver driver;

    public ODS(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/glint-root/div/div[2]/div/glint-header/header/div[3]/div/div/ul/li[2]/a")
    @CacheLookup
    private WebElement config;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-config[1]/section[1]/glint-config-sections[1]/div[1]/div[1]/section[2]/div[1]/ul[1]/li[1]/a[1]/div[1]/vg-icon[1]/div[1]/*[name()='svg'][1]")
    @CacheLookup
    private WebElement programs;

    @FindBy(how = How.XPATH, using = "//li[@data-id='people']//div[@class='circle ng-star-inserted']")
    @CacheLookup
    private WebElement people;

    @FindBy(how =How.XPATH, using = "//button[@class='btnWithVgIcon btnExport glintButton']")
    @CacheLookup
    private WebElement pplexport;

    @FindBy(how=How.XPATH,using = "//button[@class='btnCta glintButton']")
    @CacheLookup
    private WebElement exportbtn;

    @FindBy(how = How.XPATH, using = "//div[@class='sidePane filterList ng-star-inserted']//div[1]//ul[1]//li[3]//div[1]")
    @CacheLookup
    private WebElement inacemp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[1]/ul/li[5]/div")
    @CacheLookup
    private WebElement supportemp;

    //@FindBy(how = How.XPATH,using ="//*[@id=\"vg-panel1\"]/div/div/div/div[1]/glint-facet-list/div[1]/ul/li[5]/div")
    //@CacheLookup
    //private WebElement advuser; 

    @FindBy(how=How.XPATH,using = "//button[@id='peopleActionsDropdown']")
    @CacheLookup
    private WebElement peopleactions;

    @FindBy(how=How.XPATH,using ="//span[normalize-space()='Manage User Attributes']" )
    @CacheLookup
    private WebElement manageuserattr;

    @FindBy(how=How.XPATH,using ="//span[normalize-space()='Active Attributes']")
    @CacheLookup
    private WebElement activeattr;

    @FindBy(how=How.XPATH,using ="//span[normalize-space()='Derived Attributes']")
    @CacheLookup
    private WebElement derivedattr;

    @FindBy(how = How.XPATH,using="//span[normalize-space()='Optional System Attributes']")
    @CacheLookup
    private WebElement optionalattr;

    @FindBy(how=How.XPATH,using="//span[normalize-space()='Hierarchy Groups']")
    @CacheLookup
    private WebElement hierarchygrp;

    @FindBy(how=How.XPATH,using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[2]/ul/li[1]/div")
    @CacheLookup
    private WebElement companyadmin;

    @FindBy(how=How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[2]/ul/li[2]/div")
    @CacheLookup
    private WebElement  Userrole_1;

    @FindBy(how=How.XPATH,using="//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[2]/ul/li[3]/div")
    @CacheLookup
    private WebElement Userrole_2;


    @FindBy(how =How.XPATH,using = "//*[@id=\"manageAttributesSlidey\"]/div/div[3]/div/div/section/div/div[2]/div[2]/table/tbody/tr[9]/td[4]/vg-menu/div/button")
    @CacheLookup
    private WebElement  user_attribute_eg;

    @FindBy(how=How.XPATH,using="//button[@aria-label='Edit attribute']")
    @CacheLookup
    private WebElement  edit_attribute_button;

    @FindBy(how=How.XPATH,using = "//*[@id=\"editAttributeDialog\"]/div/div[2]/div/form/div[2]/div/glint-toggle")
    @CacheLookup
    private WebElement  checkboxCAV;

    public void clickconfig() {
        config.click();
    }
    
    public void Clickprograms() {
        programs.click();
    }

    public void clickpeople() {
        people.click();
    }

    public  void clickpplexport() {
        pplexport.click();
        exportbtn.click();
    }
    public void checkpplpagebutton() {
        inacemp.click();
        supportemp.click();
        //advuser.click();
    }

    public void buttoncheck() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        peopleactions.click();
        manageuserattr.click();
        activeattr.click();
        derivedattr.click();
        optionalattr.click();
        //hierarchygrp.click();
    }

    public void Clickcyadmin()
    {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        companyadmin.click();
    }

    public void ClickUserrole1()
    {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        Userrole_1.click();
    }

    public void ClickUserrole2()
    {
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        Userrole_2.click();
    }


    public void clickuserattribute()
    {
        user_attribute_eg.click();
        edit_attribute_button.click();
    }

    public void PeopleActions_button() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        peopleactions.click();
        manageuserattr.click();
    }


    public void CAV_Button(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        checkboxCAV.click();
    }


}


