#Language: en
     Feature: Funcionalidad de Iniciar Sesion
          Como usuario deseo poder loguearme en la pagina para poder hacer envios a otras billeteras claro pay

     Scenario: Inicio de sesion exitoso
          Given en la pagina principal de Claro Pay
          When inicio sesion con los valores "gdc+21@gmail.com" y "Password1"
          Then ingrese correctamente a mi usuario




