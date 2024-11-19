package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ReportCardObject {
    public WebDriver driver;

    public ReportCardObject(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    public WebElement reportheading(){
        WebElement heading = driver.findElement(By.xpath("//h1[text()='Team Summary']"));
        return heading;
    }

    public String getreportheading(){
       String heading = reportheading().getText();
       return heading;
    }

    public WebElement responserate(){
        WebElement response = driver.findElement(By.xpath("//h3[text()='Response Rate']"));
        return response;
    }

    public void getresponserate(){
        responserate().getText();
    }

    public WebElement surveyparticipation(){
        WebElement survey = driver.findElement(By.xpath("//p[text()='Survey Participation']"));
        return survey;
    }
    public String getsurveyparticipation(){
        return surveyparticipation().getText();
    }

    public WebElement celebratingsuccess(){
        WebElement celeb = driver.findElement(By.xpath("//p[text()='Celebrating Success']"));
        return celeb;
    }


    public String getcelebratingsuccess(){
        return celebratingsuccess().getText();
    }

    public WebElement topstrength(){
        WebElement strengh = driver.findElement(By.xpath("//h2[text()='Top Strengths']"));
        return strengh;
    }
    public String gettopstrength(){
        return topstrength().getText();
    }
    public WebElement topopp(){
        WebElement topp = driver.findElement(By.xpath("//h2[text()=' Top Opportunities ']"));
        return topp;
    }
    public String gettopopp(){
        return topopp().getText();
    }

    public WebElement allscores(){
        WebElement allscore = driver.findElement(By.xpath("//p[text()='All Scores']"));
        return allscore;
    }
    public String getallscore(){
        return allscores().getText();
    }

    public WebElement changecomparison(){
        WebElement comparison = driver.findElement(By.xpath("//h5[text()=' Score in comparison ']"));
        return comparison;
    }

    public WebElement topoppiframe(){
        WebElement iframe = driver.findElement(By.xpath("(//iframe)[3]"));
        return iframe;
    }

    public WebElement allscoreiframe(){
        WebElement iframe = driver.findElement(By.xpath("(//iframe)[4]"));
        return iframe;
    }
    public WebElement responsepercentage(){
        WebElement response = driver.findElement(By.xpath("//div[@class='responseRate']/h3"));
        return response;
    }
    public String getresponsepercentage(){
        return responsepercentage().getText();
    }
    public WebElement comments(){
        WebElement cmt = driver.findElement(By.xpath("//div[@class='commentSection']/h3"));
        return cmt;
    }
    public String getcommentscount(){
        return comments().getText();
    }
    public WebElement commentdiscription(){
        WebElement cmtdis = driver.findElement(By.xpath("//div[@class='itemDescription comments']/span"));
        return cmtdis;
    }
    public String getcommentdiscription(){
        return commentdiscription().getText();
    }

    public WebElement viewcommentsbtn(){
        WebElement cmtview = driver.findElement(By.xpath("//div[@class='itemDescription comments']/button"));
        return cmtview;
    }
    public void clickviewcommentsbtn(){
        viewcommentsbtn().click();
    }

    public WebElement viewcommentstab(){
        WebElement cmttab = driver.findElement(By.xpath("//div[@class='main']"));
        return cmttab;
    }
    public boolean checkviewcommentslider(){
        return viewcommmentreportbtn().isDisplayed();
    }

    public WebElement viewcommmentreportbtn(){
        WebElement cmttab = driver.findElement(By.xpath("(//button[@data-id='slideyCommentReportDrilldown'])[2]"));
        return cmttab;
    }
    public void clickviewcommentreportbtn(){
        viewcommmentreportbtn().click();
    }
    public WebElement filterbtn(){
        WebElement filter = driver.findElement(By.xpath("//span[text()='Filter Results']"));
        return filter;
    }
    public void clickfilterbtn(){
        filterbtn().click();
    }

    public WebElement surveyselectiondrop(){
        WebElement selectiondrop = driver.findElement(By.id("dropdownTrigger_glintDropdown_ea5ad476-a1a8-4a23-9eb7-6c45e91a16b4"));
        return selectiondrop;
    }
    public void clicksurveyselectiondrop(){
        surveyselectiondrop().click();
    }
    public WebElement surveyoption(){
        WebElement optionlist = driver.findElement(By.partialLinkText("August"));
        return optionlist;
    }
    public void clicksurveyoption(){
        surveyoption().click();
    }

    public WebElement celebratingsuccessmsg(){
        WebElement celeb = driver.findElement(By.xpath("//span[@tooltipalign='bottom']"));
        return celeb;
    }
    public WebElement celebratingsuccesstooltip(){
        WebElement tool = driver.findElement(By.id("ff64b26e-6d4a-45ed-b928-7ef91ea8638b"));
        return tool;
    }
    public WebElement keyoutcomehead(){
        WebElement head = driver.findElement(By.xpath("//h2[text()=' Key Outcome ']"));
        return head;
    }
    public String getkeyoutcomehead(){
        return keyoutcomehead().getText();
    }
    public void trendgraph(){
//        WebElement graph = driver.findElements(By.cssSelector("g[class='highcharts-series-group']")).get(1);
//        WebElement graph = driver.findElement(By.cssSelector("path[d='M 319 55.5 A 5 5 0 1 1 319.00499999916667 55.499997500000205 Z']"));
//        WebElement graph = driver.findElement(By.cssSelector("svg[class='highcharts-root']"));
//        WebElement graph = driver.findElement(By.cssSelector("path[class='highcharts-point highcharts-color-0'][style='outline: none;']"));
//        driver.findElement(By.cssSelector("path[aria-label='Aug 2022 Survey Score 85  Response Rate  100%  vs Average Question  + 1']")).click();
//        Actions action = new Actions(driver);
//        action.moveToElement(graph).build().perform();
//        return graph;
         WebElement graph = driver.findElement(By.cssSelector("rect[class='highcharts-background'][width='419']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",graph);
         Actions action = new Actions(driver);
          action.moveToElement(graph,200,60).click().build().perform();
//          action.moveToLocation(260,1400).click().build().perform();




    }

//    public void trendgrapthaction(){
//        Actions action = new Actions(driver);
//        action.moveToElement(trendgraph()).build().perform();
//    }

    public WebElement learnmore(){
        WebElement learn = driver.findElement(By.xpath("(//button[@class='btnLink glintButton ng-star-inserted'])[1]"));
        return learn;
    }

    public void clicklearnmore(){
        learnmore().click();
    }

    public WebElement titlelearnmore(){
        WebElement learnmoretitle = driver.findElement(By.xpath("//h2[@class='title']"));
        return learnmoretitle;
    }
    public String getpopuptitle(){
       String titlelearn = titlelearnmore().getText();
       return titlelearn;
    }
    public WebElement helpcomparison(){
        WebElement helpcomp = driver.findElement(By.xpath("(//button[@class='btnIcon btnCircle glintButton'])[2]"));
        return  helpcomp;
    }
    public void clickhelpcomp(){
        helpcomparison().click();
    }
    public WebElement helpfavorablity(){
        WebElement helpfav = driver.findElement(By.xpath("(//button[@class='btnIcon btnCircle glintButton'])[3]"));
        return  helpfav;
    }
    public void clickhelpfav(){
        helpfavorablity().click();
    }
    public WebElement popupclose(){
        WebElement close = driver.findElement(By.xpath("//i[@glinticon='close']"));
        return close;
    }
    public void clickpopupclose(){
        popupclose().click();
    }

    public WebElement drivertextstrength(){
       WebElement drivertxt = driver.findElement(By.xpath("(//em[@class='ng-star-inserted'])[1]"));
       return drivertxt;
    }
    public String getdriverstrength(){
       return drivertextstrength().getText();
    }
    public WebElement drivertexttopopp(){
        WebElement drivertxt = driver.findElement(By.xpath("(//em[@class='ng-star-inserted'])[2]"));
        return drivertxt;
    }
    public String getdrivertopopp(){
       return drivertexttopopp().getText();
    }

    public WebElement topstrenghtvideo(){
        WebElement video = driver.findElement(By.xpath("(//div[@class='mask ng-star-inserted'])[1]"));
        return video;
    }
    public void clicktopstrenghtvideo(){
         topstrenghtvideo().click();
    }

    public WebElement topstrenghtvideotopic(){
        WebElement videotopic = driver.findElement(By.xpath("//h3[@class='title ng-star-inserted']"));
        return videotopic;
    }
    public String gettopstrenghtvideotopic(){
       return topstrenghtvideotopic().getText();
    }

    public WebElement filterclicknewd(){
        WebElement filclick = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[4]"));
        return filclick;
    }








}
