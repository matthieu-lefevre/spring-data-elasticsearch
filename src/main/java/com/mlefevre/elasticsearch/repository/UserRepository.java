package com.mlefevre.elasticsearch.repository;

import com.mlefevre.elasticsearch.model.UsersIndex;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ElasticsearchRepository<UsersIndex, String> {

    UsersIndex findByUid(String uid);

    Page<UsersIndex> findAllByLongName(String longName, Pageable pageable);

    List<UsersIndex> findAllByUidOrLongName(String input);

}
