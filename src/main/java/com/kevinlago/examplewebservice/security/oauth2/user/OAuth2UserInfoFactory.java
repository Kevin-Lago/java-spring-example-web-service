package com.kevinlago.examplewebservice.security.oauth2.user;

import com.kevinlago.examplewebservice.cosntant.OAuth2Provider;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(OAuth2Provider.GOOGLE.toString())) return new GoogleOAuth2UserInfo(attributes);
        else if (registrationId.equalsIgnoreCase(OAuth2Provider.GITHUB.toString())) return new GitHubOAuth2UserInfo(attributes);
        else return null;
    }
}
