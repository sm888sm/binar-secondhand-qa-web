$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/04 Seller Add New Product.feature");
formatter.feature({
  "name": "Seller Add New Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Seller adds a new product with an empty product category",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the seller navigates to the \"Add New Product\" page",
  "keyword": "And "
});
formatter.step({
  "name": "the seller leaves the product category field empty and fills valid product name \u003cproductName\u003e, price \u003cprice\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.step({
  "name": "an error message for the empty product category should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
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
        "password",
        "productName",
        "price",
        "category",
        "description",
        "image"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_seller@binar.com",
        "4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d",
        "Laptop",
        "5000000",
        "4",
        "Used laptop",
        "C://Uploads//laptop-1.jpg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller adds a new product with an empty product category",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "the seller navigates to the \"Add New Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.navigateToAddProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller leaves the product category field empty and fills valid product name Laptop, price 5000000, description Used laptop and image C://Uploads//laptop-1.jpg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerAddProduct.enterInvalidCategory(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.clickTerbitkan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message for the empty product category should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerAddProduct.displayErrorEmptyCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.verifyRemainOnAddProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller adds a new product with an empty product name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller enters an empty product name and fills valid product price \u003cprice\u003e, category \u003ccategory\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.step({
  "name": "an error message for the empty product name should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "price",
        "category",
        "description",
        "image"
      ]
    },
    {
      "cells": [
        "5000000",
        "4",
        "Used laptop",
        "C://Uploads//laptop-1.jpg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller adds a new product with an empty product name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller enters an empty product name and fills valid product price 5000000, category 4, description Used laptop and image C://Uploads//laptop-1.jpg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerAddProduct.enterInvalidName(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.clickTerbitkan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message for the empty product name should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerAddProduct.displayErrorEmptyName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.verifyRemainOnAddProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller adds a new product with an empty product price",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller leaves the product price field empty and fills valid product name \u003cproductName\u003e, category \u003ccategory\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.step({
  "name": "an error message for the empty product price should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "productName",
        "category",
        "description",
        "image"
      ]
    },
    {
      "cells": [
        "Laptop",
        "4",
        "Used laptop",
        "C://Uploads//laptop-1.jpg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller adds a new product with an empty product price",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller leaves the product price field empty and fills valid product name Laptop, category 4, description Used laptop and image C://Uploads//laptop-1.jpg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerAddProduct.enterInvalidPrice(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.clickTerbitkan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message for the empty product price should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerAddProduct.displayErrorEmptyPrice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.verifyRemainOnAddProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller adds a new product with an empty product description",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller leaves the product description field empty and fills valid product name \u003cproductName\u003e, price \u003cprice\u003e, category \u003ccategory\u003e and image \u003cimage\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.step({
  "name": "an error message for the empty product description should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "productName",
        "price",
        "category",
        "image"
      ]
    },
    {
      "cells": [
        "Laptop",
        "5000000",
        "4",
        "C://Uploads//laptop-1.jpg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller adds a new product with an empty product description",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller leaves the product description field empty and fills valid product name Laptop, price 5000000, category 4 and image C://Uploads//laptop-1.jpg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerAddProduct.enterInvalidDescription(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.clickTerbitkan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "an error message for the empty product description should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerAddProduct.displayErrorEmptyDescription()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller remains on the \"Add New Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.verifyRemainOnAddProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller adds a new product with all valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller fills valid product name \u003cproductName\u003e, price \u003cprice\u003e, category \u003ccategory\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.step({
  "name": "the product is submitted with valid information \u003ccategoryName\u003e, \u003cpriceFormatted\u003e, \u003cdescription\u003e, \u003csellerName\u003e, \u003csellerCity\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "productName",
        "price",
        "category",
        "description",
        "image",
        "priceFormatted",
        "categoryName",
        "sellerName",
        "sellerCity"
      ]
    },
    {
      "cells": [
        "Laptop",
        "5000000",
        "4",
        "Used laptop",
        "C://Uploads//laptop-1.jpg",
        "Rp 5.000.000",
        "Elektronik",
        "Seller QA Group 03 Wave 10",
        "Jakarta"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller adds a new product with all valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller fills valid product name Laptop, price 5000000, category 4, description Used laptop and image C://Uploads//laptop-1.jpg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerAddProduct.enterValidData(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerAddProduct.clickTerbitkan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is submitted with valid information Elektronik, Rp 5.000.000, Used laptop, Seller QA Group 03 Wave 10, Jakarta",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerAddProduct.productPublishSuccess(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller adds a new product with empty profile",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user navigates to the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on \"Profil Saya\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on \"Keluar\"",
  "keyword": "And "
});
formatter.step({
  "name": "the seller is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "the seller navigates to the \"Add New Product\" page",
  "keyword": "When "
});
formatter.step({
  "name": "the seller is redirected to the edit profile page",
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
        "password"
      ]
    },
    {
      "cells": [
        "qae_gr03_seller_empty_02@binar.com",
        "4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller adds a new product with empty profile",
  "description": "",
  "keyword": "Scenario Outline"
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
  "keyword": "And "
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
  "name": "the seller is logged in qae_gr03_seller_empty_02@binar.com 4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d",
  "keyword": "And "
});
formatter.match({
  "location": "Shared.loginSeller(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller navigates to the \"Add New Product\" page",
  "keyword": "When "
});
formatter.match({
  "location": "SellerAddProduct.navigateToAddProductPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller is redirected to the edit profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerAddProduct.redirectToEditProfilePage()"
});
formatter.result({
  "status": "passed"
});
});