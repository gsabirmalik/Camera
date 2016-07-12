package com.develogical.camera;

public interface ISensor {
    byte[] readData();
    void powerUp();
    void powerDown();
}
