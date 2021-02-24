package com.test.testapp.rest.domain;

public class ServerResponse {

    private String myHostName;
    private String myTime;

    public ServerResponse(String myHostName, String myTime) {
        this.myHostName = myHostName;
        this.myTime = myTime;
    }

    public String getMyHostName() {
        return myHostName;
    }

    public String getMyTime() {
        return myTime;
    }

    @Override
    public String toString() {
        return "TimeResponse{" +
                "myHostName='" + myHostName + '\'' +
                ", myTime='" + myTime + '\'' +
                '}';
    }
}
