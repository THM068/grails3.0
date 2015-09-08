package com.bitbucket

/**
 * Created by thandomafela on 26/07/15.
 */
class UrlQueryBuilder {

    String baseUrl
    String query
    String url

    public UrlQueryBuilder addquery(Map map) {
        StringBuilder builder = new StringBuilder()
        map.each { k,v ->
            builder << "${k}=${v}&"
        }

        String val = builder.toString()
        query = val.substring(0, val.lastIndexOf("&"))
        return this
    }

    public String build() {
        url = "${baseUrl}?${query}"
        return url
    }
}
