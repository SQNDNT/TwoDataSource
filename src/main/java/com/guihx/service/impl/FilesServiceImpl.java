package com.guihx.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guihx.Entity.Files;
import com.guihx.mapper.FilesMapper;
import com.guihx.service.FilesService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guihx
 * @since 2021-05-28
 */
@Service
@DS("db1")
public class FilesServiceImpl extends ServiceImpl<FilesMapper, Files> implements FilesService {

}
