package com.github.aint.g2t;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "text",
    "html",
    "sent",
    "fromUser",
    "unread",
    "readBy",
    "urls",
    "mentions",
    "issues",
    "meta",
    "v"
})
public class GitterPostModel {

    @JsonProperty
    private String id;
    @JsonProperty
    private String text;
    @JsonProperty
    private String html;
    @JsonProperty
    private String sent;
    @JsonProperty
    private Boolean unread;
    @JsonProperty
    private Integer readBy;
    @JsonProperty
    private FromUser fromUser;
    @JsonProperty
    private Integer v;
    @JsonProperty
    private List<Object> urls;
    @JsonProperty
    private List<Object> mentions;
    @JsonProperty
    private List<Object> issues;
    @JsonProperty
    private List<Object> meta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    public Integer getReadBy() {
        return readBy;
    }

    public void setReadBy(Integer readBy) {
        this.readBy = readBy;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public FromUser getFromUser() {
        return fromUser;
    }

    public void setFromUser(FromUser fromUser) {
        this.fromUser = fromUser;
    }

    public List<Object> getUrls() {
        return urls;
    }

    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    public List<Object> getMentions() {
        return mentions;
    }

    public void setMentions(List<Object> mentions) {
        this.mentions = mentions;
    }

    public List<Object> getIssues() {
        return issues;
    }

    public void setIssues(List<Object> issues) {
        this.issues = issues;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

}



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "username",
    "displayName",
    "url",
    "avatarUrl",
    "avatarUrlSmall",
    "avatarUrlMedium",
    "v",
    "gv"
})
class FromUser {

    @JsonProperty
    private String id;
    @JsonProperty
    private String username;
    @JsonProperty
    private String displayName;
    @JsonProperty
    private String url;
    @JsonProperty
    private String avatarUrl;
    @JsonProperty
    private String avatarUrlSmall;
    @JsonProperty
    private String avatarUrlMedium;
    @JsonProperty
    private Integer v;
    @JsonProperty
    private String gv;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrlSmall() {
        return avatarUrlSmall;
    }

    public void setAvatarUrlSmall(String avatarUrlSmall) {
        this.avatarUrlSmall = avatarUrlSmall;
    }

    public String getAvatarUrlMedium() {
        return avatarUrlMedium;
    }

    public void setAvatarUrlMedium(String avatarUrlMedium) {
        this.avatarUrlMedium = avatarUrlMedium;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

}

