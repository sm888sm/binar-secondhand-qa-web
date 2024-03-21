$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/02 User Login Logout.feature");
formatter.feature({
  "name": "User Login and Logout Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Login Negative - Invalid E-mail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on \"Masuk\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid email address \u003cemailAddress\u003e and a valid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is still on the login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password"
      ]
    },
    {
      "cells": [
        "johnsmithbinar.com",
        "QJblfja5Cso\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Login Negative - Invalid E-mail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on \"Masuk\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Shared.clickOnMasuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address johnsmithbinar.com and a valid password QJblfja5Cso\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "UserLoginLogout.enterInvalidEmailAddress(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLoginLogout.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is still on the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLoginLogout.verifyStillOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Login Negative - Invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters a valid email address \u003cemailAddress\u003e and an invalid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user sees an \"Invalid Email or password\" message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_seller@binar.com",
        "P11S1FO2cCA\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Login Negative - Invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters a valid email address QAE10_GR03_seller@binar.com and an invalid password P11S1FO2cCA\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "UserLoginLogout.enterInvalidPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLoginLogout.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees an \"Invalid Email or password\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLoginLogout.verifyErrorMessageLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Login Negative - Empty Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters a valid email address \u003cemailAddress\u003e and an empty password",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is still on the login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailAddress"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_buyer@binar.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Login Negative - Empty Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters a valid email address QAE10_GR03_buyer@binar.com and an empty password",
  "keyword": "When "
});
formatter.match({
  "location": "UserLoginLogout.enterEmptyPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLoginLogout.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is still on the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLoginLogout.verifyStillOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Login Positive",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters a valid email address \u003cemailAddress\u003e a valid password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is redirected to the homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "the user clicks on \"Profil Saya\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user\u0027s name \u003cfirstName\u003e is displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password",
        "firstName"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_buyer@binar.com",
        "QJblfja5Cso\u003d",
        "John"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Login Positive",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters a valid email address QAE10_GR03_buyer@binar.com a valid password QJblfja5Cso\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "UserLoginLogout.enterValidData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Login\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLoginLogout.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is redirected to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Shared.redirectToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Profil Saya\"",
  "keyword": "And "
});
formatter.match({
  "location": "Shared.clickOnProfilSaya()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user\u0027s name John is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Shared.verifyProfileFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Logout Positive",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user navigates to the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Shared.navigateToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Profil Saya\"",
  "keyword": "When "
});
formatter.match({
  "location": "Shared.clickOnProfilSaya()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Keluar\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserLoginLogout.clickLogout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged out and sees the \"Masuk\" link",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLoginLogout.confirmLogout()"
});
formatter.result({
  "status": "passed"
});
});