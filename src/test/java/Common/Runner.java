package Common;
import cucumber.api.testng.TestNGCucumberRunner;
//import cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;

//import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//@RunWith(Cucumber.class)
@CucumberOptions(
        features =  {"Features/MyTest2.feature", "Features/MyTest.feature" },
        glue = {"StepDefinition"},
       // tags = {"~@Ignore"},
        plugin = {
                "pretty",
                "html:target/site/cucumber-reports/cucumber-pretty",
                "json:target/site/cucumber-reports/CucumberTestReport.json",
                "rerun:target/site/cucumber-reports/rerun.txt"
        },
        monochrome = true)
public class Runner extends AbstractTestNGCucumberTests {
 /* private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    //@Test(groups = "cucumber", description = "Runs Cucumber Feature")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }*/
}
