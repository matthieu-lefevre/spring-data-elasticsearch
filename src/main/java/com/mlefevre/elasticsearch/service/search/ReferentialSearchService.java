package com.mlefevre.elasticsearch.service.search;


import com.mlefevre.elasticsearch.model.UsersIndex;

import java.util.List;

public interface ReferentialSearchService {

    List<UsersIndex> searchUsers(String input, int pageIndex);


}
