package com.hendisantika.organizationservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : sample-graphql-microservices
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/11/18
 * Time: 06.54
 * To change this template use File | Settings | File Templates.
 */

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private Long departmentId;

    public Employee(Long id, String name, Long departmentId) {
        super();
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
    }

    public Employee(String name, Long departmentId) {
        super();
        this.name = name;
        this.departmentId = departmentId;
    }


}
