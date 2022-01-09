package com.xk.myeasyblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xk.myeasyblog.pojo.BlogEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper extends BaseMapper<BlogEntity> {

    /**
     * 根据用户id查询所有的博客
     * @param idUser
     * @return
     */
    List<BlogEntity> findBlogsByUserId(String idUser);
}
