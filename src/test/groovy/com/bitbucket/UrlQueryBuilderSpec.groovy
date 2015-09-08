package com.bitbucket

import spock.lang.Specification

/**
 * Created by thandomafela on 26/07/15.
 */
class UrlQueryBuilderSpec extends Specification {

    def 'Correct url is built'() {
        given:
            def map = [method: method, api_key: api_key, tag: tag, format: format ]
            UrlQueryBuilder queryBuilder = new UrlQueryBuilder(baseUrl: baseUrl)

        when:
            String url = queryBuilder.addquery(map).build()

        then:
            url == expectedUrl

        where:
         baseUrl="http://api.flickr.com/services/rest"
         api_key="3434"
         method="flickr.people.getInfo"
         format="json"
         tag="some name"
         expectedUrl = "http://api.flickr.com/services/rest?method=flickr.people.getInfo&api_key=3434&tag=some name&format=json"
    }
}
//"http://www.flickr.com/services/rest?method=flickr.photos.search&api+key={api-key}&tags={tag}&per_page=10