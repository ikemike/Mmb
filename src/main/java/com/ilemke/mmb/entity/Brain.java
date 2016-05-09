package com.ilemke.mmb.entity;

/**
 * Created by Isaac on 5/7/2016.
 */
public class Brain {

    private int id;
    private String serialData;

    /**
     * Empty Constructor
     */
    public Brain() {
    }

    /**
     * Constructor accepts the csv formatted string
     * @param serialData - raw csv data from Arduino serial
     */
    public Brain(int id, String serialData) {
        this.id = id;
        this.serialData = serialData;
    }

    /**
     * Method gets object ID for data entry
     * @return id - The id of the brain object
     */
    public int getId() {
        return id;
    }

    /**
     * Method sets the object's unique ID
     * @param id - The id of the brain object
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method returns the object's serial data
     * @return serialData - The object's serialData value
     */
    public String getSerialData() {
        return serialData;
    }

    /**
     * Method receives the serialData field
     * @param serialData - the serialData value to be withdrawn
     */
    public void setSerialData(String serialData) {
        this.serialData = serialData;
    }

    /**
     * Method provides a more readable format for toString() calls
     * @return String - Formatted Brain object data
     */
    @Override
    public String toString() {
        return "Brain{" +
                "id=" + id +
                ", SerialData='" + serialData + '\'' +
                '}';
    }




}
