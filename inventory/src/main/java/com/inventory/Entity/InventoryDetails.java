package com.inventory.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "inventory_details")
@SQLDelete(sql = "UPDATE inventory_details SET is_deleted = true WHERE id=?")
@Where(clause = "is_deleted = false")
public class InventoryDetails {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "employee_code")
    public String employeeCode;

    @Column(name = "employee_name")
    public String employeeName;

    @Column(name = "system")
    public String systemInfo;

    @Column(name = "headphone")
    public String headphoneInfo;

    @Column(name = "keyboard")
    public String keyboardInfo;

    @Column(name = "mouse")
    public String mouseInfo;

    @Column(name = "laptop_stand")
    public String laptopStand;

    @Column(name= "is_deleted")
    public Boolean isDeleted = Boolean.FALSE;

    @Override
    public String toString() {
        return "InventoryDetails [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", headphoneInfo="
                + headphoneInfo + ", id=" + id + ", isDeleted=" + isDeleted + ", keyboardInfo=" + keyboardInfo
                + ", laptopStand=" + laptopStand + ", mouseInfo=" + mouseInfo + ", systemInfo=" + systemInfo + "]";
    }

  
}
