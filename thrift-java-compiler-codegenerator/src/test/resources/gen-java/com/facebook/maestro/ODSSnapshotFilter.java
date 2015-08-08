/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.maestro;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-22")
public class ODSSnapshotFilter implements org.apache.thrift.TBase<ODSSnapshotFilter, ODSSnapshotFilter._Fields>, java.io.Serializable, Cloneable, Comparable<ODSSnapshotFilter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ODSSnapshotFilter");

  private static final org.apache.thrift.protocol.TField IN_RGEX_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("inRgexString", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NOT_IN_RGEX_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("notInRgexString", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("valueString", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ODSSnapshotFilterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ODSSnapshotFilterTupleSchemeFactory());
  }

  public String inRgexString; // required
  public String notInRgexString; // required
  public String valueString; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IN_RGEX_STRING((short)1, "inRgexString"),
    NOT_IN_RGEX_STRING((short)2, "notInRgexString"),
    VALUE_STRING((short)3, "valueString");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IN_RGEX_STRING
          return IN_RGEX_STRING;
        case 2: // NOT_IN_RGEX_STRING
          return NOT_IN_RGEX_STRING;
        case 3: // VALUE_STRING
          return VALUE_STRING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IN_RGEX_STRING, new org.apache.thrift.meta_data.FieldMetaData("inRgexString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NOT_IN_RGEX_STRING, new org.apache.thrift.meta_data.FieldMetaData("notInRgexString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE_STRING, new org.apache.thrift.meta_data.FieldMetaData("valueString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ODSSnapshotFilter.class, metaDataMap);
  }

  public ODSSnapshotFilter() {
  }

  public ODSSnapshotFilter(
    String inRgexString,
    String notInRgexString,
    String valueString)
  {
    this();
    this.inRgexString = inRgexString;
    this.notInRgexString = notInRgexString;
    this.valueString = valueString;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ODSSnapshotFilter(ODSSnapshotFilter other) {
    if (other.isSetInRgexString()) {
      this.inRgexString = other.inRgexString;
    }
    if (other.isSetNotInRgexString()) {
      this.notInRgexString = other.notInRgexString;
    }
    if (other.isSetValueString()) {
      this.valueString = other.valueString;
    }
  }

  public ODSSnapshotFilter deepCopy() {
    return new ODSSnapshotFilter(this);
  }

  @Override
  public void clear() {
    this.inRgexString = null;
    this.notInRgexString = null;
    this.valueString = null;
  }

  public String getInRgexString() {
    return this.inRgexString;
  }

  public ODSSnapshotFilter setInRgexString(String inRgexString) {
    this.inRgexString = inRgexString;
    return this;
  }

  public void unsetInRgexString() {
    this.inRgexString = null;
  }

  /** Returns true if field inRgexString is set (has been assigned a value) and false otherwise */
  public boolean isSetInRgexString() {
    return this.inRgexString != null;
  }

  public void setInRgexStringIsSet(boolean value) {
    if (!value) {
      this.inRgexString = null;
    }
  }

  public String getNotInRgexString() {
    return this.notInRgexString;
  }

  public ODSSnapshotFilter setNotInRgexString(String notInRgexString) {
    this.notInRgexString = notInRgexString;
    return this;
  }

  public void unsetNotInRgexString() {
    this.notInRgexString = null;
  }

  /** Returns true if field notInRgexString is set (has been assigned a value) and false otherwise */
  public boolean isSetNotInRgexString() {
    return this.notInRgexString != null;
  }

  public void setNotInRgexStringIsSet(boolean value) {
    if (!value) {
      this.notInRgexString = null;
    }
  }

  public String getValueString() {
    return this.valueString;
  }

  public ODSSnapshotFilter setValueString(String valueString) {
    this.valueString = valueString;
    return this;
  }

  public void unsetValueString() {
    this.valueString = null;
  }

  /** Returns true if field valueString is set (has been assigned a value) and false otherwise */
  public boolean isSetValueString() {
    return this.valueString != null;
  }

  public void setValueStringIsSet(boolean value) {
    if (!value) {
      this.valueString = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IN_RGEX_STRING:
      if (value == null) {
        unsetInRgexString();
      } else {
        setInRgexString((String)value);
      }
      break;

    case NOT_IN_RGEX_STRING:
      if (value == null) {
        unsetNotInRgexString();
      } else {
        setNotInRgexString((String)value);
      }
      break;

    case VALUE_STRING:
      if (value == null) {
        unsetValueString();
      } else {
        setValueString((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IN_RGEX_STRING:
      return getInRgexString();

    case NOT_IN_RGEX_STRING:
      return getNotInRgexString();

    case VALUE_STRING:
      return getValueString();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IN_RGEX_STRING:
      return isSetInRgexString();
    case NOT_IN_RGEX_STRING:
      return isSetNotInRgexString();
    case VALUE_STRING:
      return isSetValueString();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ODSSnapshotFilter)
      return this.equals((ODSSnapshotFilter)that);
    return false;
  }

  public boolean equals(ODSSnapshotFilter that) {
    if (that == null)
      return false;

    boolean this_present_inRgexString = true && this.isSetInRgexString();
    boolean that_present_inRgexString = true && that.isSetInRgexString();
    if (this_present_inRgexString || that_present_inRgexString) {
      if (!(this_present_inRgexString && that_present_inRgexString))
        return false;
      if (!this.inRgexString.equals(that.inRgexString))
        return false;
    }

    boolean this_present_notInRgexString = true && this.isSetNotInRgexString();
    boolean that_present_notInRgexString = true && that.isSetNotInRgexString();
    if (this_present_notInRgexString || that_present_notInRgexString) {
      if (!(this_present_notInRgexString && that_present_notInRgexString))
        return false;
      if (!this.notInRgexString.equals(that.notInRgexString))
        return false;
    }

    boolean this_present_valueString = true && this.isSetValueString();
    boolean that_present_valueString = true && that.isSetValueString();
    if (this_present_valueString || that_present_valueString) {
      if (!(this_present_valueString && that_present_valueString))
        return false;
      if (!this.valueString.equals(that.valueString))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_inRgexString = true && (isSetInRgexString());
    list.add(present_inRgexString);
    if (present_inRgexString)
      list.add(inRgexString);

    boolean present_notInRgexString = true && (isSetNotInRgexString());
    list.add(present_notInRgexString);
    if (present_notInRgexString)
      list.add(notInRgexString);

    boolean present_valueString = true && (isSetValueString());
    list.add(present_valueString);
    if (present_valueString)
      list.add(valueString);

    return list.hashCode();
  }

  @Override
  public int compareTo(ODSSnapshotFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetInRgexString()).compareTo(other.isSetInRgexString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInRgexString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inRgexString, other.inRgexString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotInRgexString()).compareTo(other.isSetNotInRgexString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotInRgexString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notInRgexString, other.notInRgexString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValueString()).compareTo(other.isSetValueString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValueString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valueString, other.valueString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ODSSnapshotFilter(");
    boolean first = true;

    sb.append("inRgexString:");
    if (this.inRgexString == null) {
      sb.append("null");
    } else {
      sb.append(this.inRgexString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notInRgexString:");
    if (this.notInRgexString == null) {
      sb.append("null");
    } else {
      sb.append(this.notInRgexString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("valueString:");
    if (this.valueString == null) {
      sb.append("null");
    } else {
      sb.append(this.valueString);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ODSSnapshotFilterStandardSchemeFactory implements SchemeFactory {
    public ODSSnapshotFilterStandardScheme getScheme() {
      return new ODSSnapshotFilterStandardScheme();
    }
  }

  private static class ODSSnapshotFilterStandardScheme extends StandardScheme<ODSSnapshotFilter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ODSSnapshotFilter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IN_RGEX_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.inRgexString = iprot.readString();
              struct.setInRgexStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOT_IN_RGEX_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notInRgexString = iprot.readString();
              struct.setNotInRgexStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.valueString = iprot.readString();
              struct.setValueStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ODSSnapshotFilter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.inRgexString != null) {
        oprot.writeFieldBegin(IN_RGEX_STRING_FIELD_DESC);
        oprot.writeString(struct.inRgexString);
        oprot.writeFieldEnd();
      }
      if (struct.notInRgexString != null) {
        oprot.writeFieldBegin(NOT_IN_RGEX_STRING_FIELD_DESC);
        oprot.writeString(struct.notInRgexString);
        oprot.writeFieldEnd();
      }
      if (struct.valueString != null) {
        oprot.writeFieldBegin(VALUE_STRING_FIELD_DESC);
        oprot.writeString(struct.valueString);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ODSSnapshotFilterTupleSchemeFactory implements SchemeFactory {
    public ODSSnapshotFilterTupleScheme getScheme() {
      return new ODSSnapshotFilterTupleScheme();
    }
  }

  private static class ODSSnapshotFilterTupleScheme extends TupleScheme<ODSSnapshotFilter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ODSSnapshotFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetInRgexString()) {
        optionals.set(0);
      }
      if (struct.isSetNotInRgexString()) {
        optionals.set(1);
      }
      if (struct.isSetValueString()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetInRgexString()) {
        oprot.writeString(struct.inRgexString);
      }
      if (struct.isSetNotInRgexString()) {
        oprot.writeString(struct.notInRgexString);
      }
      if (struct.isSetValueString()) {
        oprot.writeString(struct.valueString);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ODSSnapshotFilter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.inRgexString = iprot.readString();
        struct.setInRgexStringIsSet(true);
      }
      if (incoming.get(1)) {
        struct.notInRgexString = iprot.readString();
        struct.setNotInRgexStringIsSet(true);
      }
      if (incoming.get(2)) {
        struct.valueString = iprot.readString();
        struct.setValueStringIsSet(true);
      }
    }
  }

}

