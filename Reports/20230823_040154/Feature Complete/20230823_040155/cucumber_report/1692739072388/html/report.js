$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/09 Seller Reject Product Offer.feature");
formatter.feature({
  "name": "Seller Reject Product Offer",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The notification list on the navbar displays the product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks on the \"Notifikasi\" button",
  "keyword": "When "
});
formatter.step({
  "name": "the notification on the navbar displays the product name, price \u003cpriceFormatted\u003e and offer amount \u003cofferFormatted\u003e",
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
        "priceFormatted",
        "offerFormatted"
      ]
    },
    {
      "cells": [
        "QAE10_GR03_seller@binar.com",
        "4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d",
        "Rp 5.000.000",
        "Rp 3.000.000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The notification list on the navbar displays the product",
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
  "name": "clicks on the \"Notifikasi\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SellerRejectOffer.clickNotificationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the notification on the navbar displays the product name, price Rp 5.000.000 and offer amount Rp 3.000.000",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerRejectOffer.verifyNotificationDisplaysProduct(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The notification list page displays the product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the seller clicks on the \"Penawaran produk\" notification",
  "keyword": "When "
});
formatter.step({
  "name": "the notification list displays the product name, price \u003cpriceFormatted\u003e and offer amount \u003cofferFormatted\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "priceFormatted",
        "offerFormatted"
      ]
    },
    {
      "cells": [
        "Rp 5.000.000",
        "Rp 3.000.000"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The notification list page displays the product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the seller clicks on the \"Penawaran produk\" notification",
  "keyword": "When "
});
formatter.match({
  "location": "SellerRejectOffer.clickProductOnNotificationNavbar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the notification list displays the product name, price Rp 5.000.000 and offer amount Rp 3.000.000",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerRejectOffer.clickProductOnNotificationPage(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Seller rejects a product offer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "the seller clicks on the \"Tolak\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SellerRejectOffer.clickAcceptButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the the negotiated product item displays \"Penawaran produk ditolak\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerRejectOffer.verifyRejectedProduct()"
});
formatter.result({
  "status": "passed"
});
});