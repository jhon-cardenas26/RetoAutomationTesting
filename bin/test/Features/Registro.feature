  Scenario Outline: Mostrar formulario
    Given el usuario se encuentra en la pagina de registro
    When el usuario ingresa su <email>
    And pulsa el boton para crear una nueva cuenta
    Then se despliega el formulario

    Examples: 
      | email |
      |test1234@mail.com|
