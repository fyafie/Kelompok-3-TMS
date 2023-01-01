package com.juaracoding.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
        		"src/main/resources/features/01.Login.feature",
        		"src/main/resources/features/07.ParameterShifting.feature",
        		"src/main/resources/features/08.KerjaPenempatan.feature",
        		"src/main/resources/features/09.MasterPosition.feature",
        		},
        glue = "com.juaracoding.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
