@rgression
Feature: Title of your feature
  I want to use this template for my feature file

  @blackbox
  Scenario: To check add tarif functionalities
    Given User view home page
    And user click Add tariff plan
    When User need to fill all the fieldss
      | Monthly             | 500 |
      | Free local minutes  | 100 |
      | Free inter min      |  50 |
      | Free sms            | 100 |
      | Loc per min         | 200 |
      | Inter natio per min |  40 |
      | Sms per charge      |  10 |
    And User need to click submit button
    Then User should see the new tarif plan added page
