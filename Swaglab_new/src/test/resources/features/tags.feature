Feature: To test swaglab login

	@smoke
  Scenario: As an user with valid credential i will be logged in swaglabs 1
    Given User lounch browser
    When User opens url
    And user enter username and password as
    And click on login
    Then page url should be desired page url
    And close browser


	@regression
  Scenario: As an user with valid credential i will be logged in swaglabs 2
    Given User lounch browser
    When User opens url
    And user enter username and password as
    And click on login
    Then page url should be desired page url
    And close browser

 

	@smoke @regression
  Scenario: As an user with valid credential i will be logged in swaglabs 3
    Given User lounch browser
    When User opens url
    And user enter username and password as
    And click on login
    Then page url should be desired page url
    And close browser
  
