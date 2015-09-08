package com.bitbucket;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
/**
 * Created by thandomafela on 14/07/15.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Quote {

    private String type;
    private Value value;

    public String toString() {
        return String.format(" Quote: %s %s ", type, value);
    }
}
