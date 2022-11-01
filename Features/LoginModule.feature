Feature: Login Functionality
  This Feature file will contain all the testcases related Login Module

  @SmokeTest
  Scenario: TC-1-Valid Login
    Given Open Browser
    And Launch Application
    When User enters "<username>" and "<password>" and click on Login Button
    Then Validate the HomePage
  Examples:
  | username    | password 			|
  | admin       | master   			|

    
  @SmokeTest
  Scenario: TC-2-Logout
    Given Open Browser
    And Launch Application
    When User enters username and password and click on Login Button
    And Click on Logout Button then validate the Logout
 

