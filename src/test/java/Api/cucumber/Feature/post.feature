Feature: Post feature of facebook
  This will test the functionality at the user wall

  Scenario: post a massage on user wall
    Given user should be logged in and should be present at its own wall
    When I type the massage in the text box
    And Click on post button
    Then the massage should get posted