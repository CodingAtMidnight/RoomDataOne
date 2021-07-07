package com.example.roomdataone.activities.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "users")
public class User implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int userId;

    @ColumnInfo(name = "user_Name")
    private String userName;

    @ColumnInfo(name = "Age")
    private int userAge;


    @ColumnInfo(name = "hourly_wage")
    private int userWage;

    @ColumnInfo(name = "pay_date")
    private String userPayDate;

    @ColumnInfo(name = "user_hours")
    private int userHoursWorked;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserWage() {
        return userWage;
    }

    public void setUserWage(int userWage) {
        this.userWage = userWage;
    }

    public String getUserPayDate() {
        return userPayDate;
    }

    public void setUserPayDate(String userPayDate) {
        this.userPayDate = userPayDate;
    }

    public int getUserHoursWorked() {
        return userHoursWorked;
    }

    public void setUserHoursWorked(int userHoursWorked) {
        this.userHoursWorked = userHoursWorked;
    }

    @NonNull
    @Override
    public String toString() {
        return "User Name: " + userName +
                " User Age : " + userAge +
                " User Wage : " + userWage +
                " User Pay Date: " + userPayDate +
                " User Worked Hours : " + userHoursWorked;
     }
}
