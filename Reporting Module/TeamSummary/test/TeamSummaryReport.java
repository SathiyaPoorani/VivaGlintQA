import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.lang.reflect.Method;

public class TeamSummaryReport extends TestBase {

    public String testname;

    @BeforeMethod
    public void open(Method tname) throws InterruptedException {
        launchbrowser();
        login();
        testname = tname.getName();
        System.out.println("Test Name :" +testname);
        glint.clickReportsheading();
        glint.clickAdhocnlp();
    }

    @AfterMethod
    public void close(){
        closebrowser();
    }

    @Test
    //To Verify team summary report card is available.
    public void TC_001() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(report.getreportheading(),"Team Summary");
        takescreenshot(testname);
    }

    @Test
    // To verify Tean summary Report Card showing or not.
    public void TC_002() throws IOException {
        glint.clickTeamsummary();
        Assert.assertEquals(report.getreportheading(),"Team Summary");
        report.responserate();
        takescreenshot(testname);
    }

    @Test
    //To verify the options in the Team Summary Report
    public void TC_003() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        Assert.assertEquals(report.getsurveyparticipation(),"Survey Participation");
        Assert.assertEquals(report.getcelebratingsuccess(),"Celebrating Success");
        scrollthepage(report.reportheading());
        takescreenshot(testname);
    }
    @Test
    //To Verify the What area should we focus on Module
    public void TC_004() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.changecomparison());
        Assert.assertEquals(report.gettopstrength(),"Top Strengths");
        takescreenshot(testname+"_1");
        scrollthepage(report.topoppiframe());
        Assert.assertEquals(report.gettopopp(),"Top Opportunities");
        takescreenshot(testname+"_2");
        scrollthepage(report.allscoreiframe());
        Assert.assertEquals(report.getallscore(),"All Scores");
        takescreenshot(testname+"_3");
    }
    @Test
    //To verify the Response Rate in Survey Participation Section
    public void TC_006() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.getresponsepercentage();
        System.out.println("Response Percentage is "+report.getresponsepercentage());
        takescreenshot(testname);
    }

    @Test
    //To Verify the Total Comments in Survey Participation Section
    public void TC_007() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.getcommentscount();
        System.out.println("Total Comments Count is "+report.getcommentscount());
        takescreenshot(testname);
    }

    @Test
    //To verify Most commented question showing in the Discription or not
    public void TC_008() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        String discription = report.getcommentdiscription();
        String comment = discription.substring(37);
        Assert.assertEquals(comment,"Accomplishment - Work and Accountability");
        System.out.println("******"+comment+"******");
        takescreenshot(testname);
    }
    @Test
    //To verify the Comments slider working or not
    public void TC_009() throws IOException, InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clickviewcommentsbtn();
        iwait();
        report.checkviewcommentslider();
        Assert.assertEquals(report.checkviewcommentslider(),true);
        takescreenshot(testname);
    }
    @Test
    //To verify the View Comments Report Button Working or not
    public void TC_010() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clickviewcommentsbtn();
        iwait();
        report.checkviewcommentslider();
        report.clickviewcommentreportbtn();
        Assert.assertEquals(comments.commentheading().getText(),"Comments");
        iwait();
        comments.commentsummarycount();
        takescreenshot(testname);
    }
    @Test
    //To Verify the Celebration Success Details correct or not
    public void TC_011() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.responserate());
        mousehover(report.celebratingsuccessmsg());
        iwait();
        takescreenshot(testname);
    }
    @Test
    //To Verify the Key Outcome Details showing or not
    public void TC_012() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.celebratingsuccessmsg());
        Assert.assertEquals(report.getkeyoutcomehead(),"Key Outcome");
        iwait();
        takescreenshot(testname);
    }
    @Test
    //To Verify the key outcome details values
    public void TC_013() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        scrollthepage(report.celebratingsuccessmsg());
        Assert.assertEquals(report.getkeyoutcomehead(),"Key Outcome");
        iwait();
        takescreenshot(testname);
    }
    @Test
    //To verify the trend graph tooltip and appropriate values showing or not
    public void TC_014() throws IOException, InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
//        scrollthepage(report.keyoutcomehead());
//        Thread.sleep(5000);
//        mousehover(report.trendgraph());
        report.trendgraph();
        Thread.sleep(5000);
        takescreenshot(testname);
    }

    @Test
    //To Verify the learnmore option working or not
    public void TC_015() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clicklearnmore();
        Assert.assertEquals(report.getpopuptitle(),"Key Outcome: Appreciate Differences");
        takescreenshot(testname);
    }

    @Test
    //To Verify the help icon on comparison/ Favorablity working or not
    public void TC_016() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clickhelpcomp();
        Assert.assertEquals(report.getpopuptitle(),"Score Comparisons");
        takescreenshot(testname);
        report.clickpopupclose();
        report.clickhelpfav();
        Assert.assertEquals(report.getpopuptitle(),"Favorability Breakdown");
        takescreenshot(testname+"_1");
        report.clickpopupclose();
    }
    @Test
    //To verify the drivers for Top strength/Top Opportunity showing or not
    public void TC_017() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        Assert.assertEquals(report.getdriverstrength(),"Autonomy - Manager");
        Assert.assertEquals(report.getdrivertopopp(),"Authenticity1");
        takescreenshot(testname);

    }
    @Test
    //To verify the Team Strength Content video showing or not
    public void TC_018() throws IOException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        report.clicktopstrenghtvideo();
        Assert.assertEquals(report.gettopstrenghtvideotopic(),"Lean_Into_Your_Strengths");
        takescreenshot(testname);
    }

    @Test
    public void Dtest() throws InterruptedException {
        glint.clickTeamsummary();
        iwait();
        report.responserate();
        driver.findElement(By.xpath("//button[@class='addFilterButtonPanel ng-star-inserted']")).click();
        Thread.sleep(5000);
        iwait();
        report.filterclicknewd();
        iwait();
        report.filterclicknewd().click();
        Thread.sleep(5000);
    }







}
