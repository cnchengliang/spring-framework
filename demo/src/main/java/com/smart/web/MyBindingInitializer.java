package com.smart.web;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

import com.smart.domain.User;
import com.smart.domain.UserEditor;

public class MyBindingInitializer implements WebBindingInitializer{
    @Override
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(User.class, new UserEditor());
    }
}
