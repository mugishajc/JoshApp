package io.delasoft.joshapp.Model;

public class ShopUSSD {
    public String name,user_pin,shop_code,client_phone,category;

    public ShopUSSD() {
    }

    public ShopUSSD(String name, String user_pin, String shop_code, String client_phone, String category) {
        this.name = name;
        this.user_pin = user_pin;
        this.shop_code = shop_code;
        this.client_phone = client_phone;
        this.category = category;
    }
    public ShopUSSD(String client_phone,String user_pin, String shop_code) {
        this.user_pin = user_pin;
        this.shop_code = shop_code;
        this.client_phone = client_phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_pin() {
        return user_pin;
    }

    public void setUser_pin(String user_pin) {
        this.user_pin = user_pin;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getClient_phone() {
        return client_phone;
    }

    public void setClient_phone(String client_phone) {
        this.client_phone = client_phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
