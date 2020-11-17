Feature: Registro a la Pagina

  Scenario: Login
    Given El navegador es abierto
    And navega a la pagina principal
    When el usuario da click en el boton Sign In
    And el usuario ingresa usuario y contrasena
    Then el usuario ingresa correctamente