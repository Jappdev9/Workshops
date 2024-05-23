package com.pluralsight;

public class SalesContract {
    public class SalesContract extends Contract {
        private double salesTaxAmount;
        private double recordingFee;
        private double processingFee;
        private boolean financeOption;

        public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold,
                             double salesTaxAmount, double recordingFee, double processingFee, boolean financeOption) {
            super(dateOfContract, customerName, customerEmail, vehicleSold);
            this.salesTaxAmount = salesTaxAmount;
            this.recordingFee = recordingFee;
            this.processingFee = processingFee;
            this.financeOption = financeOption;
        }

        // Getters and Setters
        public double getSalesTaxAmount() {
            return salesTaxAmount;
        }

        public void setSalesTaxAmount(double salesTaxAmount) {
            this.salesTaxAmount = salesTaxAmount;
        }

        public double getRecordingFee() {
            return recordingFee;
        }

        public void setRecordingFee(double recordingFee) {
            this.recordingFee = recordingFee;
        }

        public double getProcessingFee() {
            return processingFee;
        }

        public void setProcessingFee(double processingFee) {
            this.processingFee = processingFee;
        }

        public boolean isFinanceOption() {
            return financeOption;
        }

        public void setFinanceOption(boolean financeOption) {
            this.financeOption = financeOption;
        }

        // Overrides
        @Override
        public void calculateTotalPrice() {
            double totalPrice = getVehicleSold().getPrice() +
                    salesTaxAmount +
                    recordingFee +
                    processingFee;
            if (financeOption) {
                if (getVehicleSold().getPrice() >= 10000) {
                    totalPrice += getVehicleSold().getPrice() * 0.0425; // 4.25% for 48 months
                } else {
                    totalPrice += getVehicleSold().getPrice() * 0.0525; // 5.25% for 24 months
                }
            }
            setTotalPrice(totalPrice);
        }

        @Override
        public void calculateMonthlyPayment() {
            double monthlyPayment = 0;
            if (financeOption) {
                if (getVehicleSold().getPrice() >= 10000) {
                    monthlyPayment = getTotalPrice() / 48; // 48 months
                } else {
                    monthlyPayment = getTotalPrice() / 24; // 24 months
                }
            }
            setMonthlyPayment(monthlyPayment);
        }
    }

}
