package co.com.prueba.certificacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "co.com.prueba.certificacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PruebaRunner {
}
