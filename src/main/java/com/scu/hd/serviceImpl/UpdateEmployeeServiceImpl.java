package com.scu.hd.serviceImpl;

import com.scu.hd.dao.LoginMapper;
import com.scu.hd.dao.UpdateEmployeeDao;
import com.scu.hd.entity.Employee;
import com.scu.hd.entity.UserEmployeeOV;
import com.scu.hd.service.UpdateEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhong songzhi
 * @create 2019-06-27-16:17
 */
@Transactional
@Service
public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {
    @Autowired
    UpdateEmployeeDao updateEmployeeDao;

    @Autowired
    LoginMapper loginMapper;

    @Override
    public void updateEmployee(Employee employee){
        updateEmployeeDao.updateEmployee(employee);
    }

    @Override
    public void updateSalary(Integer emSalary,String emId){
        updateEmployeeDao.updateSalary(emSalary,emId);
    }

    @Override
    public void updateAppraise(String emAppraise,String emId){
        updateEmployeeDao.updateAppraise(emAppraise,emId);
    }

    @Override
    public void insertEmployee(UserEmployeeOV employeeOV) {
        updateEmployeeDao.insertEmployee(employeeOV.getEmployee());
        loginMapper.insertUser(employeeOV.getUser());
    }

}
