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
public class ODSHistoricalPurgeDefn implements org.apache.thrift.TBase<ODSHistoricalPurgeDefn, ODSHistoricalPurgeDefn._Fields>, java.io.Serializable, Cloneable, Comparable<ODSHistoricalPurgeDefn> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ODSHistoricalPurgeDefn");

  private static final org.apache.thrift.protocol.TField ENTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("entity", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_START_FIELD_DESC = new org.apache.thrift.protocol.TField("timeStart", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TIME_END_FIELD_DESC = new org.apache.thrift.protocol.TField("timeEnd", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ODSHistoricalPurgeDefnStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ODSHistoricalPurgeDefnTupleSchemeFactory());
  }

  public String entity; // required
  public String key; // required
  public long timeStart; // required
  public long timeEnd; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENTITY((short)1, "entity"),
    KEY((short)2, "key"),
    TIME_START((short)3, "timeStart"),
    TIME_END((short)4, "timeEnd");

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
        case 1: // ENTITY
          return ENTITY;
        case 2: // KEY
          return KEY;
        case 3: // TIME_START
          return TIME_START;
        case 4: // TIME_END
          return TIME_END;
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
  private static final int __TIMESTART_ISSET_ID = 0;
  private static final int __TIMEEND_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENTITY, new org.apache.thrift.meta_data.FieldMetaData("entity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_START, new org.apache.thrift.meta_data.FieldMetaData("timeStart", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIME_END, new org.apache.thrift.meta_data.FieldMetaData("timeEnd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ODSHistoricalPurgeDefn.class, metaDataMap);
  }

  public ODSHistoricalPurgeDefn() {
  }

  public ODSHistoricalPurgeDefn(
    String entity,
    String key,
    long timeStart,
    long timeEnd)
  {
    this();
    this.entity = entity;
    this.key = key;
    this.timeStart = timeStart;
    setTimeStartIsSet(true);
    this.timeEnd = timeEnd;
    setTimeEndIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ODSHistoricalPurgeDefn(ODSHistoricalPurgeDefn other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetEntity()) {
      this.entity = other.entity;
    }
    if (other.isSetKey()) {
      this.key = other.key;
    }
    this.timeStart = other.timeStart;
    this.timeEnd = other.timeEnd;
  }

  public ODSHistoricalPurgeDefn deepCopy() {
    return new ODSHistoricalPurgeDefn(this);
  }

  @Override
  public void clear() {
    this.entity = null;
    this.key = null;
    setTimeStartIsSet(false);
    this.timeStart = 0;
    setTimeEndIsSet(false);
    this.timeEnd = 0;
  }

  public String getEntity() {
    return this.entity;
  }

  public ODSHistoricalPurgeDefn setEntity(String entity) {
    this.entity = entity;
    return this;
  }

  public void unsetEntity() {
    this.entity = null;
  }

  /** Returns true if field entity is set (has been assigned a value) and false otherwise */
  public boolean isSetEntity() {
    return this.entity != null;
  }

  public void setEntityIsSet(boolean value) {
    if (!value) {
      this.entity = null;
    }
  }

  public String getKey() {
    return this.key;
  }

  public ODSHistoricalPurgeDefn setKey(String key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public long getTimeStart() {
    return this.timeStart;
  }

  public ODSHistoricalPurgeDefn setTimeStart(long timeStart) {
    this.timeStart = timeStart;
    setTimeStartIsSet(true);
    return this;
  }

  public void unsetTimeStart() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTART_ISSET_ID);
  }

  /** Returns true if field timeStart is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeStart() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTART_ISSET_ID);
  }

  public void setTimeStartIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTART_ISSET_ID, value);
  }

  public long getTimeEnd() {
    return this.timeEnd;
  }

  public ODSHistoricalPurgeDefn setTimeEnd(long timeEnd) {
    this.timeEnd = timeEnd;
    setTimeEndIsSet(true);
    return this;
  }

  public void unsetTimeEnd() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEEND_ISSET_ID);
  }

  /** Returns true if field timeEnd is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeEnd() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEEND_ISSET_ID);
  }

  public void setTimeEndIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEEND_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTITY:
      if (value == null) {
        unsetEntity();
      } else {
        setEntity((String)value);
      }
      break;

    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((String)value);
      }
      break;

    case TIME_START:
      if (value == null) {
        unsetTimeStart();
      } else {
        setTimeStart((Long)value);
      }
      break;

    case TIME_END:
      if (value == null) {
        unsetTimeEnd();
      } else {
        setTimeEnd((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTITY:
      return getEntity();

    case KEY:
      return getKey();

    case TIME_START:
      return Long.valueOf(getTimeStart());

    case TIME_END:
      return Long.valueOf(getTimeEnd());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTITY:
      return isSetEntity();
    case KEY:
      return isSetKey();
    case TIME_START:
      return isSetTimeStart();
    case TIME_END:
      return isSetTimeEnd();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ODSHistoricalPurgeDefn)
      return this.equals((ODSHistoricalPurgeDefn)that);
    return false;
  }

  public boolean equals(ODSHistoricalPurgeDefn that) {
    if (that == null)
      return false;

    boolean this_present_entity = true && this.isSetEntity();
    boolean that_present_entity = true && that.isSetEntity();
    if (this_present_entity || that_present_entity) {
      if (!(this_present_entity && that_present_entity))
        return false;
      if (!this.entity.equals(that.entity))
        return false;
    }

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_timeStart = true;
    boolean that_present_timeStart = true;
    if (this_present_timeStart || that_present_timeStart) {
      if (!(this_present_timeStart && that_present_timeStart))
        return false;
      if (this.timeStart != that.timeStart)
        return false;
    }

    boolean this_present_timeEnd = true;
    boolean that_present_timeEnd = true;
    if (this_present_timeEnd || that_present_timeEnd) {
      if (!(this_present_timeEnd && that_present_timeEnd))
        return false;
      if (this.timeEnd != that.timeEnd)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_entity = true && (isSetEntity());
    list.add(present_entity);
    if (present_entity)
      list.add(entity);

    boolean present_key = true && (isSetKey());
    list.add(present_key);
    if (present_key)
      list.add(key);

    boolean present_timeStart = true;
    list.add(present_timeStart);
    if (present_timeStart)
      list.add(timeStart);

    boolean present_timeEnd = true;
    list.add(present_timeEnd);
    if (present_timeEnd)
      list.add(timeEnd);

    return list.hashCode();
  }

  @Override
  public int compareTo(ODSHistoricalPurgeDefn other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEntity()).compareTo(other.isSetEntity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entity, other.entity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeStart()).compareTo(other.isSetTimeStart());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeStart()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeStart, other.timeStart);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeEnd()).compareTo(other.isSetTimeEnd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeEnd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeEnd, other.timeEnd);
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
    StringBuilder sb = new StringBuilder("ODSHistoricalPurgeDefn(");
    boolean first = true;

    sb.append("entity:");
    if (this.entity == null) {
      sb.append("null");
    } else {
      sb.append(this.entity);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeStart:");
    sb.append(this.timeStart);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timeEnd:");
    sb.append(this.timeEnd);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ODSHistoricalPurgeDefnStandardSchemeFactory implements SchemeFactory {
    public ODSHistoricalPurgeDefnStandardScheme getScheme() {
      return new ODSHistoricalPurgeDefnStandardScheme();
    }
  }

  private static class ODSHistoricalPurgeDefnStandardScheme extends StandardScheme<ODSHistoricalPurgeDefn> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ODSHistoricalPurgeDefn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.entity = iprot.readString();
              struct.setEntityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_START
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeStart = iprot.readI64();
              struct.setTimeStartIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME_END
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeEnd = iprot.readI64();
              struct.setTimeEndIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ODSHistoricalPurgeDefn struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.entity != null) {
        oprot.writeFieldBegin(ENTITY_FIELD_DESC);
        oprot.writeString(struct.entity);
        oprot.writeFieldEnd();
      }
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeString(struct.key);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_START_FIELD_DESC);
      oprot.writeI64(struct.timeStart);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIME_END_FIELD_DESC);
      oprot.writeI64(struct.timeEnd);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ODSHistoricalPurgeDefnTupleSchemeFactory implements SchemeFactory {
    public ODSHistoricalPurgeDefnTupleScheme getScheme() {
      return new ODSHistoricalPurgeDefnTupleScheme();
    }
  }

  private static class ODSHistoricalPurgeDefnTupleScheme extends TupleScheme<ODSHistoricalPurgeDefn> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ODSHistoricalPurgeDefn struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEntity()) {
        optionals.set(0);
      }
      if (struct.isSetKey()) {
        optionals.set(1);
      }
      if (struct.isSetTimeStart()) {
        optionals.set(2);
      }
      if (struct.isSetTimeEnd()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetEntity()) {
        oprot.writeString(struct.entity);
      }
      if (struct.isSetKey()) {
        oprot.writeString(struct.key);
      }
      if (struct.isSetTimeStart()) {
        oprot.writeI64(struct.timeStart);
      }
      if (struct.isSetTimeEnd()) {
        oprot.writeI64(struct.timeEnd);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ODSHistoricalPurgeDefn struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.entity = iprot.readString();
        struct.setEntityIsSet(true);
      }
      if (incoming.get(1)) {
        struct.key = iprot.readString();
        struct.setKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timeStart = iprot.readI64();
        struct.setTimeStartIsSet(true);
      }
      if (incoming.get(3)) {
        struct.timeEnd = iprot.readI64();
        struct.setTimeEndIsSet(true);
      }
    }
  }

}

