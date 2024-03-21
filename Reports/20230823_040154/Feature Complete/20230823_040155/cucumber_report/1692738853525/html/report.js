$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/06 Seller Edit Product.feature");
formatter.feature({
  "name": "Seller Edit Product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Seller edits a product with an empty product category",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "the seller navigates to the \"Product Saya\" page",
  "keyword": "And "
});
formatter.step({
  "name": "the seller clicks on the product",
  "keyword": "And "
});
formatter.step({
  "name": "the seller clicks on the \"Edit\" button",
  "keyword": "And "
});
formatter.step({
  "name": "the seller leaves the to-be-edited product category field empty and fills valid product name \u003cproductName\u003e, price \u003cprice\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
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
  "name": "the seller remains on the \"Edit Product\" page",
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
        "Notebook",
        "8000000",
        "1",
        "Used notebook",
        "C://Uploads//laptop-2.jpeg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller edits a product with an empty product category",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
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
  "name": "the seller navigates to the \"Product Saya\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.clickProdukSaya()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller clicks on the product",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.clickProductToEdit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller clicks on the \"Edit\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.clickEditButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller leaves the to-be-edited product category field empty and fills valid product name Notebook, price 8000000, description Used notebook and image C://Uploads//laptop-2.jpeg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerEditProduct.enterInvalidCategory(String,String,String,String)"
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
  "name": "the seller remains on the \"Edit Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.verifyRemainOnEditPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller edits a product with an empty product name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller enters an empty the to-be-edited product name and fills valid product price \u003cprice\u003e, category \u003ccategory\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
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
  "name": "the seller remains on the \"Edit Product\" page",
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
        "8000000",
        "1",
        "Used notebook",
        "C://Uploads//laptop-2.jpeg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller edits a product with an empty product name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the seller enters an empty the to-be-edited product name and fills valid product price 8000000, category 1, description Used notebook and image C://Uploads//laptop-2.jpeg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerEditProduct.enterInvalidName(String,String,String,String)"
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
  "name": "the seller remains on the \"Edit Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.verifyRemainOnEditPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller edits a product with an empty product price",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller leaves the to-be-edited product price field empty and fills valid product name \u003cproductName\u003e, category \u003ccategory\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
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
  "name": "the seller remains on the \"Edit Product\" page",
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
        "Notebook",
        "1",
        "Used notebook",
        "C://Uploads//laptop-2.jpeg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller edits a product with an empty product price",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the seller leaves the to-be-edited product price field empty and fills valid product name Notebook, category 1, description Used notebook and image C://Uploads//laptop-2.jpeg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerEditProduct.enterInvalidPrice(String,String,String,String)"
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
  "name": "the seller remains on the \"Edit Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.verifyRemainOnEditPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller edits a product with an empty product description",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller leaves the to-be-edited product description field empty and fills valid product name \u003cproductName\u003e, price \u003cprice\u003e, category \u003ccategory\u003e and image \u003cimage\u003e",
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
  "name": "the seller remains on the \"Edit Product\" page",
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
        "Notebook",
        "8000000",
        "1",
        "C://Uploads//laptop-2.jpeg"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller edits a product with an empty product description",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the seller leaves the to-be-edited product description field empty and fills valid product name Notebook, price 8000000, category 1 and image C://Uploads//laptop-2.jpeg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerEditProduct.enterInvalidDescription(String,String,String,String)"
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
  "name": "the seller remains on the \"Edit Product\" page",
  "keyword": "And "
});
formatter.match({
  "location": "SellerEditProduct.verifyRemainOnEditPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Seller edits a product with all valid details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller fills valid to-be-edited product name \u003cproductName\u003e, price \u003cprice\u003e, category \u003ccategory\u003e, description \u003cdescription\u003e and image \u003cimage\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on the \"Terbitkan\" button",
  "keyword": "And "
});
formatter.step({
  "name": "the edited product is submitted with valid information \u003ccategoryName\u003e, \u003cpriceFormatted\u003e, \u003cdescription\u003e, \u003csellerName\u003e, \u003csellerCity\u003e",
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
        "Notebook",
        "8000000",
        "1",
        "Used notebook",
        "C://Uploads//laptop-2.jpeg",
        "Rp 8.000.000",
        "Hobi",
        "Seller QA Group 03 Wave 10",
        "Jakarta"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Seller edits a product with all valid details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the seller fills valid to-be-edited product name Notebook, price 8000000, category 1, description Used notebook and image C://Uploads//laptop-2.jpeg",
  "keyword": "When "
});
formatter.match({
  "location": "SellerEditProduct.enterValidData(String,String,String,String,String)"
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
  "name": "the edited product is submitted with valid information Hobi, Rp 8.000.000, Used notebook, Seller QA Group 03 Wave 10, Jakarta",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerEditProduct.productEditSuccess(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});