package com.hendisantika.departmentservice.type;

import com.apollographql.apollo.api.ScalarType;

import javax.annotation.Generated;

/**
 * Created by IntelliJ IDEA.
 * Project : sample-graphql-microservices
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/11/18
 * Time: 06.56
 * To change this template use File | Settings | File Templates.
 */
@Generated("Apollo GraphQL")
public enum CustomType implements ScalarType {
    ID {
        @Override
        public String typeName() {
            return "ID";
        }

        @Override
        public Class javaType() {
            return String.class;
        }
    }
}