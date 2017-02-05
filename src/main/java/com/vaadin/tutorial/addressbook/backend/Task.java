package com.vaadin.tutorial.todo_tasks.backend;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * A simple DTO for the address book example.
 *
 * Serializable and cloneable Java Object that are typically persisted
 * in the database and can also be easily converted to different formats like JSON.
 */
// Backend DTO class. This is just a typical Java backend implementation
// class and nothing Vaadin specific.
public class Task implements Serializable, Cloneable {

    private Long id;

    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String email = "";
    private String taskDescription = "";
    private Date startDate;
    private Date expectedEndDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTaskDescription() {
    	return taskDescription;
    }
    
    public void setTaskDescription(String taskDescription){
    	this.taskDescription = taskDescription;
    }
    
    public Date getStartDate() {
    	return startDate;
    }
    
    public void setStartDate(Date startDate){
    	this.startDate = startDate;
    }
    
    public Date getExpectedEndDate() {
    	return expectedEndDate;
    }
    
    public void setExpectedEndDate(Date expectedEndDate){
    	this.expectedEndDate = expectedEndDate;
    }

    @Override
    public Task clone() throws CloneNotSupportedException {
        try {
            return (Task) BeanUtils.cloneBean(this);
        } catch (Exception ex) {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName 
        		+ ", Task=" + taskDescription + ", startDate=" + startDate + ", expectedEndDate=" + expectedEndDate 
        		+ ", phone=" + phone + ", email=" + email + '}';
    }

}
