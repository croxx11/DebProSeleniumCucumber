package com.DebsCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 16/03/2017.
 */

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/Cucumber folder",

        format = {"html:target/cucumber"}
)



public class RunnerClass {
}
