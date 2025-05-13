package za.ac.cput.domain;

/*Address POJO class

Author: A Jaji (222702079)

Date: 09 May 2025 */

public class Address {

    private String streetNumber;
    private String streetName;
    private String suburb;
    private String city;
    private short postalCode;

    private Address(){

    }

    private Address(Builder builder){
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.postalCode = builder.postalCode;

    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public short getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public static class Builder{
        private String streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private short postalCode;

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder copy(Address address){
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.suburb = address.suburb;
            this.city = address.city;
            this.postalCode = address.postalCode;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
