package com.example.aritmatika.dto;

public class ResponseHasil {
    int status;
    String msg;
    double hasil;

    public ResponseHasil(int status, String msg, double hasil) {
        this.status = status;
        this.msg = msg;
        this.hasil = hasil;
    }

    @Override
    public String toString() {
        return "ResponseHasil{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", hasil=" + hasil +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
}
