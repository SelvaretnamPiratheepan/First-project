package com.example.demo.DTO;

public class customerSaveDTO {


    private String customername;
    private String customerAddress;
    private int mobile;

    public customerSaveDTO(String customername, String customerAddress, int mobile) {

        this.customername = customername;
        this.customerAddress = customerAddress;
        this.mobile = mobile;
    }

    public customerSaveDTO() {
    }



    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "customerDTO{" +

                ", customername='" + customername + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
