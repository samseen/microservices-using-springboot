package com.samseen.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerRegistrationRequest(String firstName, String lastName, String email) {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName)
                .lastName(request.lastName)
                .email(request.email)
                .build();
        // todo: check if customer already exists
        // todo: check if email is valid
        // todo: check if email is not taken
        // todo: save customer in db
    }
}
