Feature: Leap Regression

Scenario: MN Max Credit Per Day
Given the user has completed max credit hours
When the user tries to complete another/more credits
Then the user should get a max credits reached pop-up
  @LeapRegression
Scenario: Basic feature file example
    Given the user navigates to the corporate page
    When the user clicks on logic button
    Then the user should see the correct title