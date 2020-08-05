package com.mn.topto.service.impl.model;

import com.mn.topto.dao.abstracts.model.UserDAO;
import com.mn.topto.models.entity.User;
import com.mn.topto.service.abstracts.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ReadWriteServiceImpl<User, Long> implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        super(userDAO);
        this.userDAO = userDAO;
    }
}
