package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\Admin\\eclipse-workspace\\cucumber_testNG\\src\\test\\resources\\simple\\Excelsheet.feature"},
glue= {"Step_defination"})
public class login_runner extends AbstractTestNGCucumberTests {

}
