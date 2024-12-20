@pruebas
Feature: Prueba de compras en My Demo App

  @compras
  Scenario Outline: Compra de productos
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente <MONTOESPERADO>
    Examples:
      | PRODUCTO                        | UNIDADES | MONTOESPERADO  |
      | Sauce Labs Fleece Jacket     | 5                   |  249.95     |
      | Sauce Labs Fleece Jacket     | 5                   |  249.95     |
      | Sauce Labs Fleece Jacket     | 5                   |  249.95     |
      | Sauce Labs Backpack     | 2                   |  59.98     |
      | Sauce Labs Backpack     | 2                   |  59.98     |
      | Sauce Labs Backpack     | 2                   |  59.98     |
#      | Sauce Labs Bolt - T-Shirt | 1                   |
#     | Sauce Labs Bike Light     | 2                   |
#      | Sauce Labs Onesie    | 1                   |
#      | Sauce Labs Fleece Jacket     | 1                   |
#      | Sauce Labs Backpack     | 1                   |
#      | Sauce Labs Bolt - T-Shirt | 1                   |
#      | Sauce Labs Bike Light     | 2                   |
