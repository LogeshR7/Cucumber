    
#tags = {"~tag"} becomes tags = {"not tag"}
#tags = {"@tag1,@tag2") becomes tags = {"@tag1 or @tag2"}
#tags = {"@tag1","@tag2"} becomes tags = {"@tag1 and @tag2"}
#tags = {"@tag1","@tag2,@tag3"} becomes tags = {"@tag1 and (@tag2 or @tag3)"}

@Samplerun
Feature: This Remit Login Testing

Scenario: This is remit login test scenario

    Given User need to enter into the remit webapplication using chrome browser
    
    When User type the Username "dosth"
    
    And USer type the password "itsmedosth"
    
    Then User click the login button
    
    Then user is able to see the home page
   
    @negative
    Scenario: This is remit login test scenario

    Given User need to enter into the remit webapplication using chrome browser
    
    When User type the Username "osth"
    
    And USer type the password "itsmedosth"
    
    Then User click the login button
    
    Then user is able to see the home page
