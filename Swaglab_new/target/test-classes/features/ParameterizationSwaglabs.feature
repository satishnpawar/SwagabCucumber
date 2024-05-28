Feature: To test swaglab login

  Scenario: As an user with valid credential i will be logged in swaglabs
    Given User lounch browser
    When User opens url
    And user enter <username> and <password>
    And click on login
    Then page url should be desired page url
    And close browser
 
 Examples: 
      | username  | password |
      | standard_user |     secret_sauce |
      | locked_out_user |     secret_sauce |
 
 
     
       