package Runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        plugin = { "pretty" },
        strict = true,
        features = { "src/test/resources/features" },
        glue = { "Steps"}
)
public class Runner {

}

