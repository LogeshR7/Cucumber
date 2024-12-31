Feature: This is Haniffa kl purchase insert testing

Scenario: Need to insert two order in the purchase order module,check it will sae or not

Given User need to open chrome and lanch the haniffa kl website

When User need to insert the valid "<UserName>" "<Password>"

And User clik the sign in button on the bottom

Then The user will see the dashboard page

And User need to click on the purchase module located left side

Then User click the purchase order module

Then Click the insert button on top rigt conor on top right side

Then Enter the vendor 


When User type "9903746"

And Need to enter the Qty "100"

Then Click add button

When User type product "9903743"

And Need to add qty "50"

Then Click add button on botton right

And Click save button on Top right side

Then The user will see the sucess message and also see the purchase order list page

When User click the view icion on the list page to coinform the order

Then User need to click the name located on the top right conor

And Click logout

Examples:
|UserName|Password|
|durai|Mani1206*|


