Feature: Add module with multisets of the data
  
  @SmokeTest
  Scenario: add a, b
    Given get <a> and <b> from user
    When add a, b
    Then display the sum
    
  Examples:
  | a    | b   |
  | 100  | 50  |
  | 1000 | 150 |
  | 100  | 250 |
  | 400  | 50  |
  | 500  | 50  |