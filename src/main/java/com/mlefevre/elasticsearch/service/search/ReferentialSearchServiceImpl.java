package com.mlefevre.elasticsearch.service.search;

import com.mlefevre.elasticsearch.model.UsersIndex;
import com.mlefevre.elasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReferentialSearchServiceImpl implements ReferentialSearchService {

    @Resource
    private UserRepository userRepository;


    @Value("${page.items.nb:10}") private Integer itemsNbByPage;


    @Override
    public List<UsersIndex> searchUsers(String input, int pageIndex) {
        Pageable pageable = new PageRequest(pageIndex, this.itemsNbByPage);
        Page<UsersIndex> pagedUsers = this.userRepository.findAllByLongName(input, pageable);

        return pagedUsers.getContent();
    }

}
