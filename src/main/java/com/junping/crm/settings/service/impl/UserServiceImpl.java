package com.junping.crm.settings.service.impl;

import com.junping.crm.settings.dao.UserDao;
import com.junping.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;



}
