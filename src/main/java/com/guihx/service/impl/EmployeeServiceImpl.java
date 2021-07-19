package com.guihx.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guihx.Entity.Employee;
import com.guihx.mapper.EmployeeMapper;
import com.guihx.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guihx
 * @since 2021-06-23
 */
@Service
@DS("sqlserver")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
