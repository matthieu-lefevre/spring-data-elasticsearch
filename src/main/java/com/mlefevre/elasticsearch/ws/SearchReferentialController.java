package com.mlefevre.elasticsearch.ws;

import com.mlefevre.elasticsearch.dto.SearchDto;
import com.mlefevre.elasticsearch.model.UsersIndex;
import com.mlefevre.elasticsearch.service.search.ReferentialSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search/referential")
public class SearchReferentialController {

    @Autowired
    private ReferentialSearchService referentialSearchService;


    @RequestMapping(value = "/users", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public List<UsersIndex>
    searchUsers(@RequestBody SearchDto input) {

        List<UsersIndex> users = this.referentialSearchService.searchUsers(input.getSearch(), input.getPageNb());
        return users;
    }

}
