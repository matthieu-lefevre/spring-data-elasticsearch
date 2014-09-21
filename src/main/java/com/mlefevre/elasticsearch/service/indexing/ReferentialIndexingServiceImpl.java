package com.mlefevre.elasticsearch.service.indexing;

import com.mlefevre.elasticsearch.model.UsersIndex;
import com.mlefevre.elasticsearch.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ReferentialIndexingServiceImpl implements ReferentialIndexingService {

    @Resource
    private UserRepository userRepository;


    @Override
    public void saveUser(UsersIndex user) {
        this.userRepository.save(user);
    }

    @Override
    public void deleteUser(UsersIndex user) {
        this.userRepository.delete(user);
    }
}
