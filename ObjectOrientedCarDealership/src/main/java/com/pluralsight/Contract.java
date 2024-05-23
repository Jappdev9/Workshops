package com.pluralsight;

public class Contract {
    import java.util.Date;

    public abstract class Contract {
        private String dateOfContract;
        private String customerName;
        private String customerEmail;
        private Vehicle vehicleSold;
        private double totalPrice;
        private double monthlyPayment;

        public Contract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold) {
            this.dateOfContract = dateOfContract;
            this.customerName = customerName;
            this.customerEmail = customerEmail;
            this.vehicleSold = vehicleSold;
        }

        // Getters and Setters
        public String getDateOfContract() {
            return dateOfContract;
        }

        public void setDateOfContract(String dateOfContract) {
            this.dateOfContract = dateOfContract;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        public Vehicle getVehicleSold() {
            return vehicleSold;
        }

        public void setVehicleSold(Vehicle vehicleSold) {
            this.vehicleSold = vehicleSold;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public double getMonthlyPayment() {
            return monthlyPayment;
        }

        // Abstract methods
        public abstract void calculateTotalPrice();

        public abstract void calculateMonthlyPayment();
    }

}
