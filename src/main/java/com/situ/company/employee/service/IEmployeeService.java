package com.situ.company.employee.service;

import com.situ.company.employee.model.EmployeeModel;

import java.util.List;

public interface IEmployeeService {

    String insert(EmployeeModel model);

    String delete(EmployeeModel model);

    String update(EmployeeModel model);

    List<EmployeeModel> selectList(EmployeeModel model);

    EmployeeModel selectModel(EmployeeModel model);

    /**
     * 登录功能
     * @param model
     * @return String 0=账号不存在,1登陆成功，2密码错误
     */
    String login(EmployeeModel model);

    Integer selectCount(EmployeeModel model);

    String resPass(EmployeeModel parseModel);

    String passUpd(EmployeeModel parseModel);

    String delPic(EmployeeModel parseModel);
}
