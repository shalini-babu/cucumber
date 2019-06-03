Feature: Login Action Test

  Scenario: Successful Login with Valid Credentials
    Given user login page is opened
    When user enters "lalitha" as a username and "password123" as a password
    When user click on Login button
    Then will Finds a TestMeApp hoempage
