$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/netiz/git/kel03_web/Include/features/11 Seller Approve Offer Then Sell Product.feature");
formatter.feature({
  "name": "Seller Approve Then Sell Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "The notification list on the navbar displays the product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the buyer negotiates for a product",
  "keyword": "Given "
});
formatter.step({
  "name": "the seller is logged in \u003cemail\u003e \u003cpassword\u003e",
  "keyword": "And "
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
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the buyer negotiates for a product",
  "keyword": "Given "
});
formatter.match({
  "location": "Shared.buyerNegotiateProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller is logged in QAE10_GR03_seller@binar.com 4IKJKomARpjPH7aiyRZ0CQ\u003d\u003d",
  "keyword": "And "
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
  "keyword": "Scenario Outline"
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
  "name": "The seller accepts a product offer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the seller clicks on the \"Terima\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SellerApproveThenCancelOffer.clickAcceptButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the the negotiated product item displays \"Penawaran produk diterima\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerApproveThenCancelOffer.verifyAcceptedProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the the negotiated product item displays \"Status\" and \"Hubungi di\" button",
  "keyword": "And "
});
formatter.match({
  "location": "SellerApproveThenCancelOffer.verifyAcceptedProductButtons()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The seller marks a product as sold",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the seller clicks \"Status\" button",
  "keyword": "When "
});
formatter.match({
  "location": "SellerApproveThenCancelOffer.clickStatusButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the seller clicks \"Berhasil terjual\" button and clicks \"Kirim\"",
  "keyword": "And "
});
formatter.match({
  "location": "SellerApproveAndSellProduct.clickSoldButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the the negotiated product item displays \"Berhasil terjual\" text",
  "keyword": "Then "
});
formatter.match({
  "location": "SellerApproveAndSellProduct.verifySoldProduct()"
});
formatter.result({
  "status": "passed"
});
});