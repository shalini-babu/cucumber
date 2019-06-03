Feature: Login Feature

  Scenario: User enters Username and password
    Given the login page is opened
    When user enters lalitha as username
    And user enters password123 as password
    Then user will Finds a TestMeApp hoempage
