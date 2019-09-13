package fr.smabtp.ro;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSession {

    @JsonProperty("badge")
    private String badge;
    @JsonProperty("fullName")
    private String fullName;

    public UserSession() {
        super();
    }

    public UserSession(final String badge, final String fullName) {
        this.badge = badge;
        this.fullName = fullName;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
