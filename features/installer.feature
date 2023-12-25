Feature: Installers Management

  Scenario: registers a new installer
    Given they choose Register Installer
    When installer id is 1
    And installer username is "besann"
    And installer email is "besannn@najah"
    And installer password is "123"
    And installer avaialbledate is "11/12/2023"
    Then the installer should be registered successfully

  Scenario: registers a existed installer
    Given they choose Register Installer
    When installer id is 1
    And installer username is "besann"
    And installer email is "besannn@najah"
    And installer password is "123"
    And installer avaialbledate is "11/12/2023"
    Then the installer should not be registered

  Scenario: lists installers
    Given they choose List Installers
    Then they should see a list of registered installers with their available dates
