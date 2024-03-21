$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/01 User Sign Up.feature");
formatter.feature({
  "name": "User Sign Up",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Sign Up Negative - Invalid Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on \"Masuk\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on \"Daftar di sini\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters their full name empty, email address and password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password"
      ]
    },
    {
      "cells": [
        "QJblfja5Cso\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Sign Up Negative - Invalid Name",
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
  "name": "the user clicks on \"Daftar di sini\"",
  "keyword": "When "
});
formatter.match({
  "location": "UserSignUp.clickOnDaftar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters their full name empty, email address and password QJblfja5Cso\u003d",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.enterInvalidFullName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.clicksOnDaftarButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSignUp.verifyStillOnSignUpPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Sign Up Negative - Invalid E-mail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name \u003cfullName\u003e, invalid email address and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullName",
        "password"
      ]
    },
    {
      "cells": [
        "John Smith",
        "QJblfja5Cso\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Sign Up Negative - Invalid E-mail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name John Smith, invalid email address and password QJblfja5Cso\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "UserSignUp.enterInvalidEmailAddress(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.clicksOnDaftarButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSignUp.verifyStillOnSignUpPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Sign Up Negative - Invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name \u003cfullName\u003e, email address and empty password",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullName"
      ]
    },
    {
      "cells": [
        "John Smith"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Sign Up Negative - Invalid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name John Smith, email address and empty password",
  "keyword": "When "
});
formatter.match({
  "location": "UserSignUp.enterInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.clicksOnDaftarButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSignUp.verifyStillOnSignUpPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Sign Up Negative - Already Registered E-mail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name \u003cfullName\u003e, already registered email address \u003cemailAddress\u003e and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.step({
  "name": "the error message \"Email has already been taken\" is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullName",
        "emailAddress",
        "password"
      ]
    },
    {
      "cells": [
        "John Smith",
        "QAE10_GR03_buyer@binar.com",
        "QJblfja5Cso\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Sign Up Negative - Already Registered E-mail",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name John Smith, already registered email address QAE10_GR03_buyer@binar.com and password QJblfja5Cso\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "UserSignUp.enterAlreadyRegisteredEmail(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.clicksOnDaftarButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the error message \"Email has already been taken\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSignUp.verifyErrorMessageEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is still on the sign-up page",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.verifyStillOnSignUpPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Sign Up Positive",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name \u003cfullName\u003e, unique email address and password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
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
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fullName",
        "password",
        "firstName"
      ]
    },
    {
      "cells": [
        "John Smith",
        "QJblfja5Cso\u003d",
        "John"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Sign Up Positive",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters their full name John Smith, unique email address and password QJblfja5Cso\u003d",
  "keyword": "When "
});
formatter.match({
  "location": "UserSignUp.enterValidData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Daftar\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserSignUp.clicksOnDaftarButton()"
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
  "keyword": "Then "
});
formatter.match({
  "location": "Shared.verifyProfileFirstName(String)"
});
formatter.result({
  "status": "passed"
});
});