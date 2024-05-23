package com.pluralsight;

public class LeaseContract {
    public class LeaseContract extends Contract {
        private double expectedEndingValue;
        private double leaseFee;

        public LeaseContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold,
                             double expectedEndingValue, double leaseFee) {
            super(dateOfContract, customerName, customerEmail, vehicleSold);
            this.expectedEndingValue = expectedEndingValue;
            this.leaseFee = leaseFee;
        }

        // Getters and Setters
        public double getExpectedEndingValue() {
            return expectedEndingValue;
        }

        public void setExpectedEndingValue(double expectedEndingValue) {
            this.expectedEndingValue = expectedEndingValue;
        }

        public double getLeaseFee() {
            return leaseFee;
        }

        public void setLeaseFee(double leaseFee) {
            this.leaseFee = leaseFee;
        }

        // Overrides
        @Override
        public void calculateTotalPrice() {
            double totalPrice = getVehicleSold().getPrice() * 0.07; // Lease Fee (7% of the original price)
            totalPrice += expectedEndingValue;
            setTotalPrice(totalPrice);
        }

        @Override
        public void calculateMonthlyPayment() {
            // All leases are financed at 4.0% for 36 months
            double monthlyPayment = getTotalPrice() / 36;
            setMonthlyPayment(monthlyPayment);
        }
    }
}
