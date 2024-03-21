$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/12 Seller Delete Product.feature");
formatter.feature({
  "name": "Seller Delete Product",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The seller deletes a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the seller is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the user navigates to the to-be-deleted product page",
  "keyword": "And "
});
formatter.step({
  "name": "the seller clicks \"Delete\" button",
  "keyword": "When "
});
formatter.step({
  "name": "the page redirects to \"Daftar Jual Saya\" page",
  "keyword": "Then "
});
formatter.step({
  "name": "the deleted product doesn\u0027t exist in the product list",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_seller@binar.com",
        "4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The seller deletes a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the seller is logged in QAE10_GR03_seller@binar.com 4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d",
  "keyword": "Given "
});
formatter.match({
  "location": "Shared.loginSeller(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to the to-be-deleted product page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerDeleteProduct.navigateToProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller clicks \"Delete\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SellerDeleteProduct.clickDeleteButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page redirects to \"Daftar Jual Saya\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerDeleteProduct.redirectToProductListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the deleted product doesn\u0027t exist in the product list",
  "keyword": "And "
});
formatter.match({
  "location": "SellerDeleteProduct.verifyProductNotExist()"
});
formatter.result({
  "status": "passed"
});
});