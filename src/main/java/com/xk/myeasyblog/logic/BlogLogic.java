package com.xk.myeasyblog.logic;

import com.xk.myeasyblog.mapper.BlogMapper;
import com.xk.myeasyblog.pojo.BlogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BlogLogic {

    @Autowired
    private BlogMapper blogMapper;

    public List<BlogEntity> findBlogsByUserId(String idUser){
        if (null == idUser){
            return new ArrayList<>();
        }

        return blogMapper.findBlogsByUserId(idUser);
    }

}
