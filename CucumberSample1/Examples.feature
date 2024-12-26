Feature: This Smm login test

Scenario Outline: This is smm login test scenario for two login using examples

Given User need too open edge and go to smm website

When User need to enter "<Username>" "<Password>"

And Click the login button

Then User have to see the smm dashboard page

Examples:
|Username|Password|
|durai|Mani1206*|
