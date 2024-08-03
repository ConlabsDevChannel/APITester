package net.conlabsmedia.apitester.core;

import java.net.URI;
import java.net.URL;
import java.util.Map;

public class APIRequestCore {

    private URL requestBaseURL;
    private URI reqeustURI;
    private String requestMethod;
    private String queryString;
    private Map<String, String> httpRequestHeaderMap;
    private String requestType;
    private String requestBodyStr;

    public Map<String, String> getHttpRequestHeaderMap() {
        return httpRequestHeaderMap;
    }

    public void setHttpRequestHeaderMap(Map<String, String> httpRequestHeaderMap) {
        this.httpRequestHeaderMap = httpRequestHeaderMap;
    }

    public URL getRequestBaseURL() {
        return requestBaseURL;
    }

    public void setRequestBaseURL(URL requestBaseURL) {
        this.requestBaseURL = requestBaseURL;
    }

    public URI getReqeustURI() {
        return reqeustURI;
    }

    public void setReqeustURI(URI reqeustURI) {
        this.reqeustURI = reqeustURI;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestBodyStr() {
        return requestBodyStr;
    }

    public void setRequestBodyStr(String requestBodyStr) {
        this.requestBodyStr = requestBodyStr;
    }

    // Utility Method
    // String to XML

    // String to JSONObject

}
