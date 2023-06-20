@author:LizehtMuñoz

Feature: automatizar pagina de avianca
  el usuario web porgra ingrear a la pagina de
  avianca para seleccionar un vuelo

  Background: cargar pagina de avianca
    Given que el usuario ingrese a la pagina de avianca


  Scenario: seleccionar un vuelo medellin bogota exitoso
    When el usuario ingresa los datos del vuelo
      | origen   | destino | diaVuelo | mesVuelo | anioVuelo | cantidadAdultos | cantidadNinos |
      | Medellín | Bogotá  | 12       | Agosto   | 2023      | 2               | 1             |
    Then el usuario pueder ver los resultados de busqueda