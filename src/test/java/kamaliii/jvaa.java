package kamaliii;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","json:\\src\\test\\java\\kamaliii\\cucumber.reports.json"})
public class jvaa {

}
