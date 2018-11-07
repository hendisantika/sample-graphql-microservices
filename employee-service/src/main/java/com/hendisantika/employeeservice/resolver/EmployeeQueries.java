package com.hendisantika.employeeservice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hendisantika.employeeservice.model.Employee;
import com.hendisantika.employeeservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/11/18
 * Time: 06.46
 * To change this template use File | Settings | File Templates.
 */
@Component
public class EmployeeQueries implements GraphQLQueryResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeQueries.class);

    @Autowired
    EmployeeRepository repository;

    public List<Employee> employees() {
        LOGGER.info("Employees find");
        return repository.findAll();
    }

    public List<Employee> employeesByOrganization(Long organizationId) {
        LOGGER.info("Employees find: organizationId={}", organizationId);
        return repository.findByOrganization(organizationId);
    }

    public List<Employee> employeesByDepartment(Long departmentId) {
        LOGGER.info("Employees find: departmentId={}", departmentId);
        return repository.findByDepartment(departmentId);
    }

    public Employee employee(Long id) {
        LOGGER.info("Employee find: id={}", id);
        return repository.findById(id);
    }

}