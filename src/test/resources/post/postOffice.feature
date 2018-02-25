Feature: PostOffice scenarios
  Scenario: Should create a new user
    Given I instatntiate PostOffice
    And I mock UserStorage to return true when createUser method called
    When I create new user with nickname qwerty
    Then User with nickname qwerty is present

    Scenario: Should send new message succesfully
      Given: I instatntiate PostOffice
      And I mock UserStorage to return true when createUser method called
      And I mock SenderService to return true when sendMessage method is called
      When I create new user with nickname qwerty
      And I create new user with nickname asdf
      And I send new message Hello World from qwerty to asdf
      Then User with nickname qwerty is present
      And User with nickname asdf is present
      And Message Hello World is sent from qwerty to asdf
