package com.mn.topto.dao.impl.model;

import com.mn.topto.dao.abstracts.model.UserDAO;
import com.mn.topto.models.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends ReadWriteDAOImpl<User, Long> implements UserDAO {
}
