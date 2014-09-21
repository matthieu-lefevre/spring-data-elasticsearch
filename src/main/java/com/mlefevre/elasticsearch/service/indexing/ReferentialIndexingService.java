package com.mlefevre.elasticsearch.service.indexing;


import com.mlefevre.elasticsearch.model.UsersIndex;

public interface ReferentialIndexingService {

    void saveUser(UsersIndex user);

    void deleteUser(UsersIndex user);


}
