package com.hendisantika.departmentservice.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hendisantika.departmentservice.model.Department;
import com.hendisantika.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : sample-graphql-microservices
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/18
 * Time: 06.54
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DepartmentMutations implements GraphQLMutationResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentQueries.class);

    @Autowired
    DepartmentRepository repository;

    public Department newDepartment(Department department) {
        LOGGER.info("Department add: department={}", department);
        return repository.add(department);
    }

    public boolean deleteDepartment(Long id) {
        LOGGER.info("Department delete: id={}", id);
        return repository.delete(id);
    }

    public Department updateDepartment(Long id, Department department) {
        LOGGER.info("Department update: id={}, department={}", id, department);
        return repository.update(id, department);
    }

}