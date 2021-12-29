Feature: Login orange hrm

  Scenario: Login Orange hrm
    When Orange Hrm  webpage open
    Then  user provide username and password
    Then user click login
    Then user successfully login

    Scenario:  User should able to update profile
      Given User logged in
      Then user click my info on menu
      Then user click Edit on Personal details
      Then user update personal date
