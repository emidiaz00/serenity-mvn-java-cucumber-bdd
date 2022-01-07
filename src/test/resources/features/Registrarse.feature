Feature: Funcionalidad de Registrarse
  @Registro @Onboarding
  Scenario: Como usuario invitado quiero poder loguearme
    Given en la pagina principal
    When Quiero registrar una nueva cuenta
    Then Completo los campos para registrarme con el <"emildsn06@gmail.com">
    And Completo los campos adicionales del registro






