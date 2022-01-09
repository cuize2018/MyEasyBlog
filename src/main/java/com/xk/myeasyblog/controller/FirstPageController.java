package com.xk.myeasyblog.controller;

import com.xk.myeasyblog.logic.BlogLogic;
import com.xk.myeasyblog.pojo.BlogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class FirstPageController {

    @Autowired
    private BlogLogic blogLogic;

    @PostMapping("/blogs")
    @ResponseBody
    public List<BlogEntity> findBlogList(@RequestBody Map<String, String> idUserMap) {
        if (null == idUserMap) return new ArrayList<>();

        String idUser = idUserMap.get("idUser");
        if (null == idUser) {
            return new ArrayList<>();
        }
        List<BlogEntity> blogs = this.blogLogic.findBlogsByUserId(idUser);
        return blogs;
    }
}
