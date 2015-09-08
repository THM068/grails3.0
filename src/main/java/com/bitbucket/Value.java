package com.bitbucket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by thandomafela on 15/07/15.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public String toString() {
        return String.format(" %s %s", id.toString(), quote);
    }
}
