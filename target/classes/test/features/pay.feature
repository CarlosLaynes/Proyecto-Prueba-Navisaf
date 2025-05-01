Feature: Realizar compra de articulos

  @compra_un_articulo
  Scenario: Realizar compra de un articulo
    Given el usuario está en la página de login
    When el usuario ingresa su usuario "standard_user" y contraseña "secret_sauce"
    And hace clic en el botón de iniciar sesión
    And el usuario debe ver la pagina principal con el mensaje "Products"
    And el usuario selecciona el producto y continua la compra
    And el usuario ingresa sus datos "Carlos", "Castro" y "0071"
    And el usuario valida que el nombre de su producto y precio sea correcto
    Then el usuario finaliza la compra y se muestra un mensaje al finalizar "Thank you for your order!"

  Scenario Outline: Realizar compra de más de un articulo
    Given el usuario está en la página de login
    When el usuario ingresa su usuario "standard_user" y contraseña "secret_sauce"
    And hace clic en el botón de iniciar sesión
    And el usuario debe ver la pagina principal con el mensaje "Products"
    And el usuario selecciona los productos "<productos>" y continua la compra
    And el usuario ingresa sus datos "Carlos", "Castro" y "0071"
    And el usuario valida que el nombre de sus productos y precio sea correcto "<productos>"
    Then el usuario finaliza la compra y se muestra un mensaje al finalizar "Thank you for your order!"
    Examples:
      |productos  |
      | 6         |