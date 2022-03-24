@Regresion
Feature: Compra de articulos en la pagina de Saucedemo
  Se espera que el usuario pueda realizar diferentes compras de articulos
  en la aplicación, asi como tambien que pueda agregar y quitar articulos
  de su compra

  @CasoExitoso
  Scenario: Compra de articulos con el usuario estandar
    Given Autentico en saucedemo con usuario "standard_user" y contraseña "secret_sauce"
    When Agrego items al carrito de compras y hago click en ShoppingCart
      And  Verifico los productos y ingreso Nombre,  Apellido  y codigo postal
        | username                | password                |  firstName  | lastName  | postalCode |
        | standard_user           | secret_sauce            |  Juan       |  Velez    | 15241241   |
    Then Verifico que se pueda comprar el producto
