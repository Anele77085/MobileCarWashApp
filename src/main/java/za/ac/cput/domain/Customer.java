package za.ac.cput.domain;

/*Customer POJO class

Author: A Jaji (222702079)

Date: 09 May 2025 */

public class Customer extends User {

    private String customerId;
    private String carModel;
    private int carWashCount;
    private boolean freeWashActivated;
    private boolean freeBirthdayWash;
    private String bankName;
    private long bankAccountNumber;
    private Address address;

    private Customer(){

    }

       private Customer(Builder builder){
           this.customerId = builder.customerId;
           this.carModel = builder.carModel;
           this.carWashCount = builder.carWashCount;
           this.freeWashActivated = builder.freeWashActivated;
           this.freeBirthdayWash = builder.freeBirthdayWash;
           this.bankName = builder.bankName;
           this.bankAccountNumber = builder.bankAccountNumber;
           this.address = builder.address;
           this.firstName = builder.firstName;
           this.lastName = builder.lastName;
           this.identificationNumber = builder.identificationNumber;
           this.cellPhone = Long.parseLong(builder.cellPhone);
           this.email = builder.email;
           this.password = builder.password;
       }


    public String getCustomerId() {
        return customerId;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarWashCount() {
        return carWashCount;
    }

    public boolean isFreeWashActivated() {
        return freeWashActivated;
    }

    public boolean isFreeBirthdayWash() {
        return freeBirthdayWash;
    }

    public String getBankName() {
        return bankName;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carWashCount=" + carWashCount +
                ", freeWashActivated=" + freeWashActivated +
                ", freeBirthdayWash=" + freeBirthdayWash +
                ", bankName='" + bankName + '\'' +
                ", bankAccountNumber=" + bankAccountNumber +
                ", address=" + address +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", cellPhone=" + cellPhone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notificationPreference='" + notificationPreference + '\'' +
                '}';
    }

    public static class Builder{

        private String customerId;
        private String carModel;
        private int carWashCount;
        private boolean freeWashActivated;
        private boolean freeBirthdayWash;
        private String bankName;
        private long bankAccountNumber;
        private Address address;
        private String firstName;
        private String lastName;
        private long identificationNumber;
        private String cellPhone;
        private String email;
        private String password;

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public Builder setCarWashCount(int carWashCount) {
            this.carWashCount = carWashCount;
            return this;
        }

        public Builder setFreeWashActivated(boolean freeWashActivated) {
            this.freeWashActivated = freeWashActivated;
            return this;
        }

        public Builder setFreeBirthdayWash(boolean freeBirthdayWash) {
            this.freeBirthdayWash = freeBirthdayWash;
            return this;
        }

        public Builder setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setBankAccountNumber(long bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setIdentificationNumber(long identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }

        public Builder setCellPhone(String cellPhone) {
            this.cellPhone = cellPhone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(Customer customer){
            this.customerId = customer.customerId;
            this.carModel = customer.carModel;
            this.carWashCount = customer.carWashCount;
            this.freeWashActivated = customer.freeWashActivated;
            this.freeBirthdayWash = customer.freeBirthdayWash;
            this.bankName = customer.bankName;
            this.bankAccountNumber = customer.bankAccountNumber;
            this.address = customer.address;
            this.firstName = customer.firstName;
            this.lastName = customer.lastName;
            this.identificationNumber = customer.identificationNumber;
            this.cellPhone = String.valueOf(customer.cellPhone);
            this.email = customer.email;
            this.password = customer.password;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
