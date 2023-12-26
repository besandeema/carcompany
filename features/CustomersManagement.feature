Feature: Customers Management


  Scenario: registers a new customer
    Given they choose Register Customer
    When customer username is "besan"
    And customer email is "besan@najah"
    And customer password is "123"
    And customer2 username is "besan2"
    And customer2 email is "besan@najah"
    And customer2 password is "123"
    Then the customers should be registered successfully

  Scenario: register a existed customer
    Given they choose Register Customer
    When customerr username is "besan"
    And customerr email is "besan@najah"
    And customerr password is "123"
    Then the customers should not be registered

  Scenario: lists customers
    Given they choose List Customers
    Then they should see a list of registered customers
