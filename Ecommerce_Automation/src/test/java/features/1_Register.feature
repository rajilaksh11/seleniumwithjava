

Feature: User Registration

  Scenario Outline:  user Register with valid credentials
    Given I am on the registration page
    When I register with firstname "<firstname>" and lastname "<lastname>" and email "<email>" and password "<password>"
    Then I should see a successful registration message

    Examples:
      | firstname  | lastname | email                   | password |

      | demouser1        | ln1    | demouser1@gmail.com  | demo1@123  |

      | demouser2        | ln2    | demouser2@gmail.com  | demo2@123  |


