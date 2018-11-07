package com.hendisantika.organizationservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : sample-graphql-microservices
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/11/18
 * Time: 06.53
 * To change this template use File | Settings | File Templates.
 */

@Data
@ToString
@NoArgsConstructor
public class Department {

    private Long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        super();
        this.name = name;
    }

}
