Feature: Login Page

  Scenario: Login with Valid Credentials
    #Pre_Requisite condition open browser code put in hooks class
    #Precondition : Launch Application
    Given user launch the Application
    #action
    When user enter email as "admin@yourstore.com" and Password as "admin"
    #action
    And user click on Login
    #Verification
    Then page title should be "Dashboard / nopCommerce administration"
    #action
    When user click on logout button
    #verification
    Then page title should be "Your store. Login"
#Pre_requisite condition close/quitr browser code in hooks class
