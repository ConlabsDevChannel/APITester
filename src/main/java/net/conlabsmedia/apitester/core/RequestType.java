package net.conlabsmedia.apitester.core;

public enum RequestType {

    RAW("RAW"),
    JSON("JSON"),
    XML("XML");

    private String reqTypeText;

    RequestType(String reqTypeText) {}

    public String getReqTypeText() {
        return reqTypeText;
    }

    public void setReqTypeText(String reqTypeText) {
        this.reqTypeText = reqTypeText;
    }
}
