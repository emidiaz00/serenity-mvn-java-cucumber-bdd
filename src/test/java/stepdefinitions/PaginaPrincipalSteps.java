package stepdefinitions;

import io.cucumber.java.en.*;
import models.AgregarProductoPage;
import models.RegistrarsePage;
import navegacion.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.text.IsEqualIgnoringWhiteSpace;
import org.openqa.selenium.remote.server.handler.SendKeys;
import questions.AgregarProductoQuestion;
import tasks.RegistrarseTask;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.openqa.selenium.remote.server.handler.SendKeys.*;


public class PaginaPrincipalSteps {

    private final String actor = "Emiliano";


    @Given("en la pagina principal" )
    public void en_la_pagina_principal() {
        OnStage.setTheStage(new OnlineCast());

        OnStage.theActorCalled(this.actor).attemptsTo(
                NavigateTo.theHomePage()
        );
    }

    @When("agrega un elemento al carrito" )
    public void agrega_un_elemento_al_carrito() {
        OnStage.theActorCalled(this.actor).attemptsTo(
                Click.on(AgregarProductoPage.sign_in),
                Click.on(AgregarProductoPage.t_shirts),
                Click.on(AgregarProductoPage.view_list),
                WaitUntil.the(AgregarProductoPage.add_cart, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(AgregarProductoPage.add_cart)
        );
    }

    @Then("veo el elemento agregado")
    public void veo_el_elemento_agregado() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        AgregarProductoQuestion.messageAvailable(),
                        IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace("Product successfully added to your shopping cart" )
                )
        );
    }
    /* Registro steps */

    @When("Quiero registrar una nueva cuenta")
    public void Quiero_registrar_una_nueva_cuenta() {
        OnStage.theActorCalled(this.actor).attemptsTo(
                Click.on(RegistrarsePage.sign_in)
                );
    }
    @Then("Completo los campos para registrarme con el <{string}>")
    public void Complete_los_campos_para_registrarme_con_el(String email) {
        OnStage.theActorCalled(this.actor).attemptsTo(
                Enter.theValue(email).into(RegistrarsePage.input_email),
                Click.on(RegistrarsePage.create_button)
        );
    }
    @Then("Completo los campos adicionales del registro")
    public void Completo_los_campos_adicionales_del_registro() {
        OnStage.theActorCalled(this.actor).attemptsTo(
                WaitUntil.the(RegistrarsePage.form, isPresent()).forNoMoreThan(40).seconds(),
                Click.on(RegistrarsePage.input_genero),
                Enter.theValue("Emiliano").into(RegistrarsePage.input_primer_nombre),
                Enter.theValue("Diaz").into(RegistrarsePage.input_segundo_nombre),
                Enter.theValue("Cucumber").into(RegistrarsePage.password),
                Click.on(RegistrarsePage.nacimientoFechaDropdown),
                Click.on(RegistrarsePage.nacimientoMesDropdown),
                Click.on(RegistrarsePage.nacimientoAñoDropdown),

                Enter.theValue("Valentin").into(RegistrarsePage.FirstName),
                Enter.theValue("Diaz").into(RegistrarsePage.LastName),
                Enter.theValue("Logitech").into(RegistrarsePage.Company),
                Enter.theValue("addad").into(RegistrarsePage.address1),
                Enter.theValue("Maryland").into(RegistrarsePage.city),
                Click.on(RegistrarsePage.State),
                Click.on(RegistrarsePage.StateDropDown),
                Enter.theValue("94203").into(RegistrarsePage.PostalCode),
                Enter.theValue("+1 0012123244152").into(RegistrarsePage.PhoneMobile),
                Enter.theValue("st saint 288").into(RegistrarsePage.Reference),
                Click.on(RegistrarsePage.RegisterButton)
        );
    }
    



}




