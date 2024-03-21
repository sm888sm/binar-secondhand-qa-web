$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/08 Buyer Negotiate Product.feature");
formatter.feature({
  "name": "Buyer Negoiate Product Positive",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buyer negotiates the price for a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the buyer is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the user navigates to the product page",
  "keyword": "And "
});
formatter.step({
  "name": "the buyer clicks on the \"Saya tertarik dan ingin nego\" button",
  "keyword": "When "
});
formatter.step({
  "name": "enters a negotiated offer price \u003cprice\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "clicks the \"Kirim\" button",
  "keyword": "And "
});
formatter.step({
  "name": "the button becomes disabled and the button text becomes \"Menunggu respon penjual\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "price"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_buyer@binar.com",
        "QJblfja5Cso\u003d",
        "3000000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buyer negotiates the price for a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the buyer is logged in QAE10_GR03_buyer@binar.com QJblfja5Cso\u003d",
  "keyword": "Given "
});
formatter.match({
  "location": "Shared.loginBuyer(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the product page",
  "keyword": "And "
});
formatter.match({
  "location": "BuyerNegotiateProduct.navigateToProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the buyer clicks on the \"Saya tertarik dan ingin nego\" button",
  "keyword": "When "
});
formatter.match({
  "location": "BuyerNegotiateProduct.clickNegotiateProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a negotiated offer price 3000000",
  "keyword": "And "
});
formatter.match({
  "location": "BuyerNegotiateProduct.enterNegotiatedPrice(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the \"Kirim\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BuyerNegotiateProduct.clickCommitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the button becomes disabled and the button text becomes \"Menunggu respon penjual\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyerNegotiateProduct.confirmButtonDisabled()"
});
formatter.result({
  "status": "passed"
});
});