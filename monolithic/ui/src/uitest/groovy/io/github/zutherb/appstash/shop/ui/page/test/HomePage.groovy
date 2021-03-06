package io.github.zutherb.appstash.shop.ui.page.test

import geb.Page

class HomePage extends Page {
    static url = "http://localhost:8888/shop/"
    static at = { title == "Shop" }
    static content = {
        results(wait: true) { $("li a.tabletLink") }
        result { i -> results[i] }
        catalogLink { result(0) }
    }
}