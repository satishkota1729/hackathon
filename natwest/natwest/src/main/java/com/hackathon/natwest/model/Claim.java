package com.hackathon.natwest.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "claim")

public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_id")
    private Long claimId;

    @Column(name = "ssn_number", nullable = false, unique = true)
    private String ssnNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "policy_number", nullable = false)
    private String policyNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "driving_license_number", nullable = false)
    private String drivingLicenceNumber;

    @Column(name = "is_vehicle_under_loan")
    private Boolean isVehicleUnderLoan;

    @Column(name = "average_km_run_per_year")
    private Integer averageKmRunPerYear;

    @Column(name = "vehicle_usage")
    private String vehicleUsage;

    @Column(name = "vehicle_manufacturer")
    private String vehicleManufacturer;

    @Column(name = "vehicle_model")
    private String vehicleModel;

    @Column(name = "mileage_run")
    private Integer mileageRun;

    @Column(name = "claim_amount")
    private Double claimAmount;

    @Column(name = "previous_claim_numbers")
    private String previousClaimNumbers;

    @Column(name = "claim_date", nullable = false)
    private LocalDate claimDate;
}
