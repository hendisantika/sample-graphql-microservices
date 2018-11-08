package com.hendisantika.organizationservice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
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
 * Time: 06.58
 * To change this template use File | Settings | File Templates.
 */
@Component
public class OrganizationQueries implements GraphQLQueryResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationQueries.class);

    @Autowired
    EmployeeClient employeeClient;

    @Autowired
    OrganizationRepository repository;

    public List<Organization> organizations() {
        LOGGER.info("Organization find");
        return repository.findAll();
    }

    public Organization organizationByIdWithEmployees(Long id) {
        LOGGER.info("Organizations find: id={}", id);
        Organization organization = repository.findById(id);
        organization.setEmployees(employeeClient.findByOrganization(id));
        return organization;
    }

    public Organization organization(Long id) {
        LOGGER.info("Organization find: id={}", id);
        return repository.findById(id);
    }

}