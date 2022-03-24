@Regresion
Feature: Compra de articulos en la pagina de Saucedemo
  Se espera que el usuario pueda realizar diferentes compras de articulos
  en la aplicación, asi como tambien que pueda agregar y quitar articulos
  de su compra

  @CasoExitoso
  Scenario Outline: Compra de articulos con el usuario estandar
    Given Autentico en saucedemo con usuario <username> y contraseña <password>
    When Agrego items al carrito de compras y hago click en ShoppingCart
    And  Verifico los productos y ingreso Nombre <firstName>, Apellido <lastName> y codigo postal <postalCode>
    Then Verifico que se pueda comprar el producto

    Examples:
      | username                | password                |  firstName  | lastName  | postalCode |
      | standard_user           | secret_sauce            |  Juan       |  Velez    | 111223     |