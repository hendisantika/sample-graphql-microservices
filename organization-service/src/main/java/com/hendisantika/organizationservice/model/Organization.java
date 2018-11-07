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
 * Time: 06.56
 * To change this template use File | Settings | File Templates.
 */

@Data
@NoArgsConstructor
@ToString
public class Organization {
    private Long id;
    private String name;
    private String address;
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();


    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
