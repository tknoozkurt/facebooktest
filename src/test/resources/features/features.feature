@facebook
Feature: Facebook login yapma
  Scenario: TC01_kullanici facebook login yapar
    Given kullanici facebook sayfasindadir
    And kullanici marketplace gider
    And kullanici your account tiklar
    Then ilk ilanin  basligi dogrulanir