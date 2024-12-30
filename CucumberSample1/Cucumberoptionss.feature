#Dry run- Checks all the step have the step defination before run

#features- The paths of the feature files

#glue- The paths of the step definition files

#tags- Instruct what tags in the features filrs should be executed

#Monochrome- Display the console output in much readabl way

#formate - Set what all report formaters to use 

#Strict-check all the step deination after excution

Feature: This test for remit local and main propose for cucumberoption

Scenario: This is test for login the remit local

Given User need to open the chrome and enter the remit local url

When User enter the login detail "<UserName>" "<Password>"

When Click the SIGN IN button

Then User will see the haniffa dashboard page

Examples:
|UserName|Password|
|dosth|itsmedosth|






