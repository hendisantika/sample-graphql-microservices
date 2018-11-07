package com.hendisantika.organizationservice.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hendisantika.organizationservice.model.Organization;
import com.hendisantika.organizationservice.repository.OrganizationRepository;
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
 * Date: 08/11/18
 * Time: 06.57
 * To change this template use File | Settings | File Templates.
 */
@Component
public class OrganizationMutations implements GraphQLMutationResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationMutations.class);

    @Autowired
    OrganizationRepository repository;

    public Organization newOrganization(Organization department) {
        LOGGER.info("Organization add: department={}", department);
        return repository.add(department);
    }

    public boolean deleteOrganization(Long id) {
        LOGGER.info("Organization delete: id={}", id);
        return repository.delete(id);
    }

    public Organization updateOrganization(Long id, Organization department) {
        LOGGER.info("Organization update: id={}, department={}", id, department);
        return repository.update(id, department);
    }

}