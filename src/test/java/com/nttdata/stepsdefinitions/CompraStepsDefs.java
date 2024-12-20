package com.nttdata.stepsdefinitions;

import com.nttdata.screens.CarritoScreen;
import com.nttdata.screens.ProductsScreen;
import com.nttdata.steps.CarritoSteps;
import com.nttdata.steps.ProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class CompraStepsDefs {

    @Steps
    ProductSteps productSteps;
    @Steps
    CarritoSteps carritoSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        productSteps.isProductDisplayed();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        productSteps.listaProductos();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidad, String producto) {
        productSteps.agregarAlCarrito(unidad, producto);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        productSteps.selecionarCarrito();
        carritoSteps.concluirCompra();
    }
}
