$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/07 User Search Product.feature");
formatter.feature({
  "name": "Use Search Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User searches and views a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters the product name in the search field",
  "keyword": "When "
});
formatter.step({
  "name": "presses the Enter key",
  "keyword": "And "
});
formatter.step({
  "name": "the search results should display the product name, category \u003ccategoryName\u003e and price \u003cpriceFormatted\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "description",
        "priceFormatted",
        "categoryName"
      ]
    },
    {
      "cells": [
        "Used laptop",
        "Rp 8.000.000",
        "Hobi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User searches and views a product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user enters the product name in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "SellerSearchProduct.inputProductName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presses the Enter key",
  "keyword": "And "
});
formatter.match({
  "location": "SellerSearchProduct.submitSearchProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the search results should display the product name, category Hobi and price Rp 8.000.000",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSearchProduct.displaySearchProductItem(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User clicks the product to open the product page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on the desired product from the search results",
  "keyword": "When "
});
formatter.step({
  "name": "the user is redirected to the product details page",
  "keyword": "Then "
});
formatter.step({
  "name": "the product is submitted with valid information \u003ccategoryName\u003e, \u003cpriceFormatted\u003e, \u003cdescription\u003e, \u003csellerName\u003e, \u003csellerCity\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "description",
        "priceFormatted",
        "categoryName",
        "sellerName",
        "sellerCity"
      ]
    },
    {
      "cells": [
        "Used laptop",
        "Rp 5.000.000",
        "Elektronik",
        "Seller QA Group 03 Wave 10",
        "Jakarta"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User clicks the product to open the product page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user clicks on the desired product from the search results",
  "keyword": "When "
});
formatter.match({
  "location": "SellerSearchProduct.clickSearchProductItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is redirected to the product details page",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerSearchProduct.redirectToProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is submitted with valid information Elektronik, Rp 5.000.000, Used laptop, Seller QA Group 03 Wave 10, Jakarta",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.productPublishSuccess(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});