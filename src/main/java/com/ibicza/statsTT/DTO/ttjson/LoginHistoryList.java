package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDateTime;


public class LoginHistoryList {
    private LocalDateTime date;
    private String ip;
    private String deviceModel;
    private String deviceSystem;
    private String networkType;
    private String carrier;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getDate() { return date; }
    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDate(LocalDateTime value) { this.date = value; }

    @JsonProperty("IP")
    public String getIp() { return ip; }
    @JsonProperty("IP")
    public void setIp(String value) { this.ip = value; }

    @JsonProperty("DeviceModel")
    public String getDeviceModel() { return deviceModel; }
    @JsonProperty("DeviceModel")
    public void setDeviceModel(String value) { this.deviceModel = value; }

    @JsonProperty("DeviceSystem")
    public String getDeviceSystem() { return deviceSystem; }
    @JsonProperty("DeviceSystem")
    public void setDeviceSystem(String value) { this.deviceSystem = value; }

    @JsonProperty("NetworkType")
    public String getNetworkType() { return networkType; }
    @JsonProperty("NetworkType")
    public void setNetworkType(String value) { this.networkType = value; }

    @JsonProperty("Carrier")
    public String getCarrier() { return carrier; }
    @JsonProperty("Carrier")
    public void setCarrier(String value) { this.carrier = value; }
}
