package com.kevinlago.examplewebservice.security.oauth2.user;

import java.util.Map;

public class GitHubOAuth2UserInfo extends OAuth2UserInfo {
    public GitHubOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
