package com.lawencon.core.dto.orderhdr;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.lawencon.core.dto.orderdtl.OrderDtlInsertReqDto;

public class OrderHdrInsertReqDto {
    
    @NotBlank
    private String customerName;
    @NotBlank
    private String employee;
    @NotEmpty @NotNull
    private List<OrderDtlInsertReqDto> detail;
    
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmployee() {
        return employee;
    }
    public void setEmployee(String employee) {
        this.employee = employee;
    }
    public List<OrderDtlInsertReqDto> getDetail() {
        return detail;
    }
    public void setDetail(List<OrderDtlInsertReqDto> detail) {
        this.detail = detail;
    }

}
