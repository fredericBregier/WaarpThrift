/**
 * Autogenerated by Thrift Compiler (0.9.0)
 * 
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 * 
 * @generated
 */
package org.waarp.thrift.r66;

public enum RequestMode implements org.apache.thrift.TEnum {
    SYNCTRANSFER(1),
    ASYNCTRANSFER(2),
    INFOREQUEST(3),
    INFOFILE(4);

    private final int value;

    private RequestMode(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     * 
     * @return null if the value is not found.
     */
    public static RequestMode findByValue(int value) {
        switch (value) {
            case 1:
                return SYNCTRANSFER;
            case 2:
                return ASYNCTRANSFER;
            case 3:
                return INFOREQUEST;
            case 4:
                return INFOFILE;
            default:
                return null;
        }
    }
}
