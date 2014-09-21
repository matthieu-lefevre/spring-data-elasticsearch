package com.mlefevre.elasticsearch.ws;


import com.mlefevre.elasticsearch.model.UsersIndex;
import com.mlefevre.elasticsearch.service.indexing.ReferentialIndexingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/indexing/referential")
public class IndexingReferentialController {

    @Autowired
    private ReferentialIndexingService referentialIndexingService;


    @RequestMapping(value = "/user/save", method = RequestMethod.POST, consumes = "application/json")
    public void saveUser(@RequestBody UsersIndex user) {

        this.referentialIndexingService.saveUser(user);
    }


}
