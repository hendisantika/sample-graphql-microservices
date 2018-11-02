package com.hendisantika.departmentservice.model;

import lombok.*;

/**
 * Created by IntelliJ IDEA.
 * Project : sample-graphql-microservices
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/18
 * Time: 06.50
 * To change this template use File | Settings | File Templates.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {
    private Long id;
    private String name;
    private String position;
    private int salary;
}
