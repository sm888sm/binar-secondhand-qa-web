$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/03 User Edit Profile.feature");
formatter.feature({
  "name": "User Edit Profile Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Edit Profile Negative - Empty City",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user logs in with previously created account",
  "keyword": "Given "
});
formatter.step({
  "name": "the user navigates to \"Edit Profile\" page",
  "keyword": "And "
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name \u003cfullName\u003e, enters an address \u003caddress\u003e, enters a phone number \u003cphoneNumber\u003e and leaves the city field empty",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user remains on the profile edit page",
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
        "address",
        "phoneNumber"
      ]
    },
    {
      "cells": [
        "John Doe",
        "Jl. Budi Mulia 01",
        "080989999"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Edit Profile Negative - Empty City",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user logs in with previously created account",
  "keyword": "Given "
});
formatter.match({
  "location": "UserEditProfile.loginNewAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Edit Profile\" page",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.navigateToEditProfile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name John Doe, enters an address Jl. Budi Mulia 01, enters a phone number 080989999 and leaves the city field empty",
  "keyword": "When "
});
formatter.match({
  "location": "UserEditProfile.enterInvalidCity(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.clickSaveProfile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user remains on the profile edit page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEditProfile.verifyRemainOnProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Edit Profile Negative - Empty Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, selects a city \u003ccity\u003e, enters an address \u003caddress\u003e, enters a phone number \u003cphoneNumber\u003e and leaves the name field empty",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user remains on the profile edit page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "address",
        "phoneNumber",
        "city"
      ]
    },
    {
      "cells": [
        "Jl. Budi Mulia 01",
        "080989999",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Edit Profile Negative - Empty Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, selects a city 3, enters an address Jl. Budi Mulia 01, enters a phone number 080989999 and leaves the name field empty",
  "keyword": "When "
});
formatter.match({
  "location": "UserEditProfile.enterInvalidFullName(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.clickSaveProfile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user remains on the profile edit page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEditProfile.verifyRemainOnProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Edit Profile Negative - Empty Address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name \u003cfullName\u003e, selects a city \u003ccity\u003e, enters a phone number \u003cphoneNumber\u003e and leaves the address field empty",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user remains on the profile edit page",
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
        "phoneNumber",
        "city"
      ]
    },
    {
      "cells": [
        "John Doe",
        "080989999",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Edit Profile Negative - Empty Address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name John Doe, selects a city 3, enters a phone number 080989999 and leaves the address field empty",
  "keyword": "When "
});
formatter.match({
  "location": "UserEditProfile.enterInvalidAddress(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.clickSaveProfile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user remains on the profile edit page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEditProfile.verifyRemainOnProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Edit Profile Negative - Empty Phone Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name \u003cfullName\u003e, selects a city \u003ccity\u003e, enters an address \u003caddress\u003e and leaves the phone number field empty",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user remains on the profile edit page",
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
        "address",
        "city"
      ]
    },
    {
      "cells": [
        "John Doe",
        "Jl. Budi Mulia 01",
        "3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Edit Profile Negative - Empty Phone Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name John Doe, selects a city 3, enters an address Jl. Budi Mulia 01 and leaves the phone number field empty",
  "keyword": "When "
});
formatter.match({
  "location": "UserEditProfile.enterInvalidPhoneNumber(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.clickSaveProfile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user remains on the profile edit page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserEditProfile.verifyRemainOnProfilePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User Edit Profile Positive",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name \u003cfullName\u003e, selects a city \u003ccity\u003e, enters an address \u003caddress\u003e and enters a phone number \u003cphoneNumber\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
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
  "name": "the user\u0027s name \u003cfirstName\u003e and city \u003ccityName\u003e are displayed",
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
        "address",
        "city",
        "phoneNumber",
        "cityName",
        "firstName"
      ]
    },
    {
      "cells": [
        "John Doe",
        "Jl. Budi Mulia 01",
        "3",
        "080989999",
        "Jakarta",
        "John"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Edit Profile Positive",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user uploads a profile picture, enters a name John Doe, selects a city 3, enters an address Jl. Budi Mulia 01 and enters a phone number 080989999",
  "keyword": "When "
});
formatter.match({
  "location": "UserEditProfile.enterValidData(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Save Changes\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.clickSaveProfile()"
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
  "name": "the user\u0027s name John and city Jakarta are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "UserEditProfile.verifyProfileFirstName(String,String)"
});
formatter.result({
  "status": "passed"
});
});