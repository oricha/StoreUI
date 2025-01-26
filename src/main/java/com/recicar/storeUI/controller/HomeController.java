package com.recicar.storeUI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/blog-fullwidth")
    public String blogFullwidth() {
        return "blog-fullwidth";
    }

    @GetMapping("/blog-sidebar")
    public String blogSidebar() {
        return "blog-sidebar";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }

    @GetMapping("/coming-soon")
    public String comingSoon() {
        return "coming-soon";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/index-2")
    public String index2() {
        return "index-2";
    }

    @GetMapping("/index-3")
    public String index3() {
        return "index-3";
    }

    @GetMapping("/index-4")
    public String index4() {
        return "index-4";
    }

    @GetMapping("/index-5")
    public String index5() {
        return "index-5";
    }

    @GetMapping("/index-6")
    public String index6() {
        return "index-6";
    }

    @GetMapping("/index-7")
    public String index7() {
        return "index-7";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/my-account")
    public String myAccount() {
        return "my-account";
    }

    @GetMapping("/privacy-policy")
    public String privacyPolicy() {
        return "privacy-policy";
    }

    @GetMapping("/product-details")
    public String productDetails() {
        return "product-details";
    }

    @GetMapping("/product-sidebar")
    public String productSidebar() {
        return "product-sidebar";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/shop")
    public String shop() {
        return "shop";
    }

    @GetMapping("/wishlist")
    public String wishlist() {
        return "wishlist";
    }

    @GetMapping("/404")
    public String error() {
        return "404";
    }

    @GetMapping("/compare")
    public String compare() {
        return "compare";
    }
}