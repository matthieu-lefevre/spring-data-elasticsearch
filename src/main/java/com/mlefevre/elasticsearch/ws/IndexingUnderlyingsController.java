package com.mlefevre.elasticsearch.ws;

import com.mlefevre.elasticsearch.service.indexing.UnderlyingsIndexingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/indexing/underlyings")
public class IndexingUnderlyingsController {

    @Autowired
    private UnderlyingsIndexingService underlyingsIndexingService;

}
