package com.hendisantika.employeeservice.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hendisantika.employeeservice.model.Employee;
import com.hendisantika.employeeservice.model.EmployeeQueries;
import com.hendisantika.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/11/18
 * Time: 06.45
 * To change this template use File | Settings | File Templates.
 */
@Component
public class EmployeeMutations implements GraphQLMutationResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeQueries.class);

    @Autowired
    EmployeeRepository repository;

    public Employee newEmployee(Employee employee) {
        LOGGER.info("Employee add: employee={}", employee);
        return repository.add(employee);
    }

    public boolean deleteEmployee(Long id) {
        LOGGER.info("Employee delete: id={}", id);
        return repository.delete(id);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        LOGGER.info("Employee update: id={}, employee={}", id, employee);
        return repository.update(id, employee);
    }

}