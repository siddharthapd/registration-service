package com.techopedia.registration.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.StringJoiner;

@ApiModel
public class Token {

    @ApiModelProperty(position = 1, name = "", value = "Token ID", dataType = "String", example = "ikajskauj")
    private String tokenId;
    @ApiModelProperty(position = 2, name = "", value = "Authentication status", dataType = "boolean" )
    private boolean isAuthenticated;
    @ApiModelProperty(position = 3, name = "", value = "Token Value", dataType = "String", example = "JKHJHJHHJSAHajhasjhajhsjiahAUSajbnsHBakjnsn")
    private String tokenValue;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean isAuthenticated) {
        isAuthenticated = isAuthenticated;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getName() + "[", "]")
                .add("tokenId='" + tokenId + "'")
                .add("isAuthenticated=" + isAuthenticated)
                .add("tokenValue='" + tokenValue + "'")
                .toString();
    }
}
