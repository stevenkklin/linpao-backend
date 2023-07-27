package com.linchao.linpao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linchao.linpao.model.domain.Tag;
import com.linchao.linpao.service.TagService;
import com.linchao.linpao.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author 73632
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2023-07-19 15:45:31
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




