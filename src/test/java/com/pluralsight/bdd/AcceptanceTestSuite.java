package com.pluralsight.bdd;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber)
@CucumberOptions(features = "src/test/resources/features")
public class AcceptanceTestSuite {
}
