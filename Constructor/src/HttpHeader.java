public class HttpHeader {

    private String accept;
    private String version;
    private String statusCode;
    private String contentEncoded;
    private String contentType;
    private int contentLength;
    private String host;

    public HttpHeader(String accept, String version, String statusCode, String contentEncoded, String contentType, int contentLength, String host) {
        this.accept = accept;
        this.version = version;
        this.statusCode = statusCode;
        this.contentEncoded = contentEncoded;
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.host = host;
    }


    public HttpHeader() {

    }

    public HttpHeader(String version, String statusCode) {
        this.version = version;
        this.statusCode = statusCode;
    }


    public HttpHeader(String host) {
        this.host = host;
    }

    public String toString() {
        return "[accept = " + accept + ", version = " + version + ", statusCode = " + statusCode + ", contentEncoded = " + contentEncoded + "contentType = " + contentType + ", contentLength = " + contentLength + ", host = " + host + "]";
    }
}
