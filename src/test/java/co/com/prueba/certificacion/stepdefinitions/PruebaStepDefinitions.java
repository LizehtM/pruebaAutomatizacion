package co.com.prueba.certificacion.stepdefinitions;

import co.com.prueba.certificacion.utils.constants.Urls;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.prueba.certificacion.utils.constants.Urls.*;

public class PruebaStepDefinitions {

    @Before
    public void configuracionInicial(){


        //WebDriverManager.chromedriver().setup();//nueva configuración de chromeDriver
        //OnStage.setTheStage(new OnlineCast()); // crea el escenario para ejecutar los test -- espacio en memoria
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Lizeht Muñoz");
    }
    @Given("que el usuario ingrese a la pagina de avianca")
    public void queElUsuarioIngreseALaPaginaDeAvianca() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(urlAvianca));
    }
    @When("el usuario ingresa los datos del vuelo")
    public void elUsuarioIngresaLosDatosDelVuelo(io.cucumber.datatable.DataTable dataTable) {

    }
    @Then("el usuario pueder ver los resultados de busqueda")
    public void elUsuarioPuederVerLosResultadosDeBusqueda() {

    }

}
