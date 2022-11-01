Feature: Calculator

  @tag1
  Scenario: Addition of two numbers
    Given user reads a and b values 
    When user computes a+b
    Then display the results

  @tag1
  Scenario: Multication of two numbers
    Given user reads a and b values 
    When user computes a * b
    Then display the results
  
  @tag1
  Scenario: Subtraction of two numbers
    Given user reads a and b values 
    When user computes a - b
    Then display the results