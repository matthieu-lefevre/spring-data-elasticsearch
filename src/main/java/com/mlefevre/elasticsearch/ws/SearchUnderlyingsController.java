package com.mlefevre.elasticsearch.ws;

import com.mlefevre.elasticsearch.service.search.UnderlyingsSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search/underlyings")
public class SearchUnderlyingsController {

    @Autowired
    private UnderlyingsSearchService underlyingsSearchService;

}
