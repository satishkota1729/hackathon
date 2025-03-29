package com.hackathon.natwest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Policy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Policy {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "policy_id")
        private int policyId;

        @Column(name = "policy_number", nullable = false, unique = true)
        private String policyNumber;

        @Column(name = "first_name", nullable = false)
        private String firstName;

        @Column(name = "last_name", nullable = false)
        private String lastName;

        @Column(name = "ssn", nullable = false, unique = true)
        private String ssn;

        @Column(name = "address")
        private String address;

        @Column(name = "mail")
        private String mail;

        @Column(name = "phone_number")
        private String phoneNumber;

        @Column(name = "driving_licence_number")
        private String drivingLicenceNumber;

        @Column(name = "vehicle_model")
        private String vehicleModel;



}
