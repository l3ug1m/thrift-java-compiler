/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.maestro;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum OdsInterval implements org.apache.thrift.TEnum {
  ODS_ROLLUP_INTERVAL(240);

  private final int value;

  private OdsInterval(int value) {
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
   * @return null if the value is not found.
   */
  public static OdsInterval findByValue(int value) { 
    switch (value) {
      case 240:
        return ODS_ROLLUP_INTERVAL;
      default:
        return null;
    }
  }
}
