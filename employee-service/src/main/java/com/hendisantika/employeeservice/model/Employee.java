package com.hendisantika.employeeservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : employee-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/11/18
 * Time: 06.40
 * To change this template use File | Settings | File Templates.
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Employee {

    private Long id;
    private Long organizationId;
    private Long departmentId;
    private String name;
    private int age;
    private String position;
    private int salary;

    public Employee(Long organizationId, Long departmentId, String name, int age, String position, int salary) {
        this.organizationId = organizationId;
        this.departmentId = departmentId;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

}