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


    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    public String getSsnNumber() {
        return ssnNumber;
    }

    public void setSsnNumber(String ssnNumber) {
        this.ssnNumber = ssnNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public Boolean getVehicleUnderLoan() {
        return isVehicleUnderLoan;
    }

    public void setVehicleUnderLoan(Boolean vehicleUnderLoan) {
        isVehicleUnderLoan = vehicleUnderLoan;
    }

    public Integer getAverageKmRunPerYear() {
        return averageKmRunPerYear;
    }

    public void setAverageKmRunPerYear(Integer averageKmRunPerYear) {
        this.averageKmRunPerYear = averageKmRunPerYear;
    }

    public String getVehicleUsage() {
        return vehicleUsage;
    }

    public void setVehicleUsage(String vehicleUsage) {
        this.vehicleUsage = vehicleUsage;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Integer getMileageRun() {
        return mileageRun;
    }

    public void setMileageRun(Integer mileageRun) {
        this.mileageRun = mileageRun;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getPreviousClaimNumbers() {
        return previousClaimNumbers;
    }

    public void setPreviousClaimNumbers(String previousClaimNumbers) {
        this.previousClaimNumbers = previousClaimNumbers;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }
}
