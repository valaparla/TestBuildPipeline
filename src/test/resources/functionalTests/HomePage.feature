Feature: Test Home Page

  @testthis
  Scenario: Happy path
    Given I am on the home page
    Then I should see the "firstName" field
    And I should see the "lastName" field
    And I close the browser