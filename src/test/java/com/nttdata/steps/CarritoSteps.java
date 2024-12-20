package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import com.nttdata.screens.ProductsScreen;
import net.serenitybdd.annotations.Steps;

public class CarritoSteps {

    CarritoScreen carritoScreen;

    public void concluirCompra(){
        carritoScreen.esperar(5);
        carritoScreen.isCarritoDisplayed();
        carritoScreen.esCorrectoMontoTotal(29.99);
        carritoScreen.pagarCompra();
    }

}
