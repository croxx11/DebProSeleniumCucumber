@Moyo
  Feature:User able to log in to Debenhams Account with valid credentials.

    Scenario Outline:User log in to Debenhams account and sign out successfully.

      Given I am able to see  Debenhams web page
      When I am able to sign In from landing page
      And I log in with valid Email and password "<Username>" and "<Password>"
      And I am presented with user account with welcome greetings "<Login Message>"
       Then user able to  log out successfully by clicking signout


      Examples:
        |Username                     | Password |                   Login Message |
        | harrison_moyo@yahoo.com     |ROSELINE1@|                    My details  |
