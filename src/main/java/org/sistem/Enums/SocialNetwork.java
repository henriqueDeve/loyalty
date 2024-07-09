package org.sistem.Enums;

public enum SocialNetwork {

    INSTAGRAM("Instagram"),
    FACEBOOK("Facebook"),
    WHATSAPP("Whatsapp"),
    EMAIL("Email");

    private String role;

    SocialNetwork(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
