package com.bitbucket

import org.springframework.web.client.RestTemplate


/**
 * Created by thandomafela on 15/07/15.
 */
class QuoteService {

    def grailsApplication

    public Quote getRandomQuote() {
        RestTemplate restTemplate = new RestTemplate()
        Quote quote = restTemplate.getForObject(CONS.QUOTE_URL, Quote.class)

        println grailsApplication.config.grails.flikr.apiKey
        return quote
    }
}
