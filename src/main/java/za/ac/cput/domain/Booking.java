package za.ac.cput.domain;

/*Booking POJO class

Author: AG Gwangqa (222843608)

Date: 09 May 2025 */

import java.time.LocalDateTime;

public class Booking {

    private String bookingId;
    private String customerId;
    private int serviceId;
    private LocalDateTime scheduledTime;
    private Paymenent payment;

    private Booking() {
    }

    private Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.customerId = builder.customerId;
        this.serviceId = builder.serviceId;
        this.scheduledTime = builder.scheduledTime;
        this.payment = builder.payment;


    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public LocalDateTime getScheduledTime() {
        return scheduledTime;
    }

    public Payment getPayment(){
        return payment;
    }


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", userId='" + customerId + '\'' +
                ", serviceId=" + serviceId +
                ", scheduledTime=" + scheduledTime +
                ", payment=" + payment +
                '}';
    }

    public static class Builder {
        private String bookingId;
        private String customerId;
        private int serviceId;
        private LocalDateTime scheduledTime;
        private Payment payment;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setScheduledTime(LocalDateTime scheduledTime) {
            this.scheduledTime = scheduledTime;
            return this;
        }

        public Builder setPayment(Payment payment){
            this.payment = payment;
            return this;
        }


        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.customerId = booking.customerId;
            this.serviceId = booking.serviceId;
            this.scheduledTime = booking.scheduledTime;
            this.payment = booking.payment;
            return this;
        }

      public Booking build() {
            return new Booking(this); }
  }
}


