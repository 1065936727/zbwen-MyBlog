package com.zbw.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zbw.entity.BlogTags;
import com.zbw.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BlogTagMapper extends BaseMapper<BlogTags> {


}
