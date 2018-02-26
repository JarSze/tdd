Feature: PostOffice scenarios
  Scenario: Should create a new user
    Given I instantiate PostOffice
    And I mock userStorage to return true when createUser method called
    When I create new user with nickname tom
    Then User with nickname tom is present

  Scenario: Should send new message successfully
    Given I instantiate PostOffice
    And I mock userStorage to return true when createUser method called
    And I mock senderService to return true when sendMessage method called
    When I create new user with nickname tom
    And I create new user with nickname jerry
    And I send new message Hello World from tom to jerry
    Then User with nickname tom is present
    And User with nickname jerry is present
    And Message Hello World from tom is sent to jerry