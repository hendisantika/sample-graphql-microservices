package com.hendisantika.departmentservice.repository;

import com.hendisantika.departmentservice.model.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : sample-graphql-microservices
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/18
 * Time: 06.53
 * To change this template use File | Settings | File Templates.
 */
public class DepartmentRepository {
    private List<Department> departments = new ArrayList<>();

    public Department add(Department department) {
        department.setId((long) (departments.size() + 1));
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        Optional<Department> department = departments.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (department.isPresent())
            return department.get();
        else
            return null;
    }

    public List<Department> findAll() {
        return departments;
    }

    public List<Department> findByOrganization(Long organizationId) {
        return departments.stream().filter(a -> a.getOrganizationId().equals(organizationId)).collect(Collectors.toList());
    }

    public boolean delete(Long id) {
        return departments.removeIf(it -> it.getId() == id.longValue());
    }

    public Department update(Long id, Department department) {
        department.setId(id);
        int index = departments.indexOf(department);
        departments.set(index, department);
        return department;
    }

}
