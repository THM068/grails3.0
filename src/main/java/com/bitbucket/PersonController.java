package com.bitbucket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thandomafela on 13/08/15.
 */
@RestController
@RequestMapping(value="/api/person")
class PersonController {


    @RequestMapping(value="test.dispatch", produces = "application/json")
    public List<Map> test() {
        Map<String,String> map = new HashMap<String,String>();
        List<Map> list = new ArrayList<Map>();
        list.add(map);

        return list;
    }
}