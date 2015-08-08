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
/**
 * @param n           calculate top n if this is >= 0
 * @param criteria    how to calculate top N
 * @param aggType     whether to aggregate the rest of the bucket.
 *                    Use ODS_ADHOC_AGG_NONE to turn this off; otherwise,
 *                    specify the type of aggregation.
 * @param useEntityAsSmcTier    When TopN is turned on and this is true,
 *                    entities are treated as SMC tier name, and
 *                    query will be done on its services and its descendants'
 *                    services.
 * @param useEntityAsHostPort   When TopN is turned on and this is true,
 *                    host:port is used instead of just host
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-22")
public class ODSTopN implements org.apache.thrift.TBase<ODSTopN, ODSTopN._Fields>, java.io.Serializable, Cloneable, Comparable<ODSTopN> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ODSTopN");

  private static final org.apache.thrift.protocol.TField N_FIELD_DESC = new org.apache.thrift.protocol.TField("n", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CRITERIA_FIELD_DESC = new org.apache.thrift.protocol.TField("criteria", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField AGG_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("aggType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField USE_ENTITY_AS_SMC_TIER_FIELD_DESC = new org.apache.thrift.protocol.TField("useEntityAsSmcTier", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField USE_ENTITY_AS_HOST_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("useEntityAsHostPort", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ODSTopNStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ODSTopNTupleSchemeFactory());
  }

  public int n; // required
  /**
   * 
   * @see OdsTopCriteria
   */
  public OdsTopCriteria criteria; // required
  public int aggType; // required
  public boolean useEntityAsSmcTier; // required
  public boolean useEntityAsHostPort; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    N((short)1, "n"),
    /**
     * 
     * @see OdsTopCriteria
     */
    CRITERIA((short)2, "criteria"),
    AGG_TYPE((short)3, "aggType"),
    USE_ENTITY_AS_SMC_TIER((short)4, "useEntityAsSmcTier"),
    USE_ENTITY_AS_HOST_PORT((short)5, "useEntityAsHostPort");

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
        case 1: // N
          return N;
        case 2: // CRITERIA
          return CRITERIA;
        case 3: // AGG_TYPE
          return AGG_TYPE;
        case 4: // USE_ENTITY_AS_SMC_TIER
          return USE_ENTITY_AS_SMC_TIER;
        case 5: // USE_ENTITY_AS_HOST_PORT
          return USE_ENTITY_AS_HOST_PORT;
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
  private static final int __N_ISSET_ID = 0;
  private static final int __AGGTYPE_ISSET_ID = 1;
  private static final int __USEENTITYASSMCTIER_ISSET_ID = 2;
  private static final int __USEENTITYASHOSTPORT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.N, new org.apache.thrift.meta_data.FieldMetaData("n", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CRITERIA, new org.apache.thrift.meta_data.FieldMetaData("criteria", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OdsTopCriteria.class)));
    tmpMap.put(_Fields.AGG_TYPE, new org.apache.thrift.meta_data.FieldMetaData("aggType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "OdsAdHocAggType")));
    tmpMap.put(_Fields.USE_ENTITY_AS_SMC_TIER, new org.apache.thrift.meta_data.FieldMetaData("useEntityAsSmcTier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.USE_ENTITY_AS_HOST_PORT, new org.apache.thrift.meta_data.FieldMetaData("useEntityAsHostPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ODSTopN.class, metaDataMap);
  }

  public ODSTopN() {
  }

  public ODSTopN(
    int n,
    OdsTopCriteria criteria,
    int aggType,
    boolean useEntityAsSmcTier,
    boolean useEntityAsHostPort)
  {
    this();
    this.n = n;
    setNIsSet(true);
    this.criteria = criteria;
    this.aggType = aggType;
    setAggTypeIsSet(true);
    this.useEntityAsSmcTier = useEntityAsSmcTier;
    setUseEntityAsSmcTierIsSet(true);
    this.useEntityAsHostPort = useEntityAsHostPort;
    setUseEntityAsHostPortIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ODSTopN(ODSTopN other) {
    __isset_bitfield = other.__isset_bitfield;
    this.n = other.n;
    if (other.isSetCriteria()) {
      this.criteria = other.criteria;
    }
    this.aggType = other.aggType;
    this.useEntityAsSmcTier = other.useEntityAsSmcTier;
    this.useEntityAsHostPort = other.useEntityAsHostPort;
  }

  public ODSTopN deepCopy() {
    return new ODSTopN(this);
  }

  @Override
  public void clear() {
    setNIsSet(false);
    this.n = 0;
    this.criteria = null;
    setAggTypeIsSet(false);
    this.aggType = 0;
    setUseEntityAsSmcTierIsSet(false);
    this.useEntityAsSmcTier = false;
    setUseEntityAsHostPortIsSet(false);
    this.useEntityAsHostPort = false;
  }

  public int getN() {
    return this.n;
  }

  public ODSTopN setN(int n) {
    this.n = n;
    setNIsSet(true);
    return this;
  }

  public void unsetN() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __N_ISSET_ID);
  }

  /** Returns true if field n is set (has been assigned a value) and false otherwise */
  public boolean isSetN() {
    return EncodingUtils.testBit(__isset_bitfield, __N_ISSET_ID);
  }

  public void setNIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __N_ISSET_ID, value);
  }

  /**
   * 
   * @see OdsTopCriteria
   */
  public OdsTopCriteria getCriteria() {
    return this.criteria;
  }

  /**
   * 
   * @see OdsTopCriteria
   */
  public ODSTopN setCriteria(OdsTopCriteria criteria) {
    this.criteria = criteria;
    return this;
  }

  public void unsetCriteria() {
    this.criteria = null;
  }

  /** Returns true if field criteria is set (has been assigned a value) and false otherwise */
  public boolean isSetCriteria() {
    return this.criteria != null;
  }

  public void setCriteriaIsSet(boolean value) {
    if (!value) {
      this.criteria = null;
    }
  }

  public int getAggType() {
    return this.aggType;
  }

  public ODSTopN setAggType(int aggType) {
    this.aggType = aggType;
    setAggTypeIsSet(true);
    return this;
  }

  public void unsetAggType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AGGTYPE_ISSET_ID);
  }

  /** Returns true if field aggType is set (has been assigned a value) and false otherwise */
  public boolean isSetAggType() {
    return EncodingUtils.testBit(__isset_bitfield, __AGGTYPE_ISSET_ID);
  }

  public void setAggTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AGGTYPE_ISSET_ID, value);
  }

  public boolean isUseEntityAsSmcTier() {
    return this.useEntityAsSmcTier;
  }

  public ODSTopN setUseEntityAsSmcTier(boolean useEntityAsSmcTier) {
    this.useEntityAsSmcTier = useEntityAsSmcTier;
    setUseEntityAsSmcTierIsSet(true);
    return this;
  }

  public void unsetUseEntityAsSmcTier() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEENTITYASSMCTIER_ISSET_ID);
  }

  /** Returns true if field useEntityAsSmcTier is set (has been assigned a value) and false otherwise */
  public boolean isSetUseEntityAsSmcTier() {
    return EncodingUtils.testBit(__isset_bitfield, __USEENTITYASSMCTIER_ISSET_ID);
  }

  public void setUseEntityAsSmcTierIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEENTITYASSMCTIER_ISSET_ID, value);
  }

  public boolean isUseEntityAsHostPort() {
    return this.useEntityAsHostPort;
  }

  public ODSTopN setUseEntityAsHostPort(boolean useEntityAsHostPort) {
    this.useEntityAsHostPort = useEntityAsHostPort;
    setUseEntityAsHostPortIsSet(true);
    return this;
  }

  public void unsetUseEntityAsHostPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEENTITYASHOSTPORT_ISSET_ID);
  }

  /** Returns true if field useEntityAsHostPort is set (has been assigned a value) and false otherwise */
  public boolean isSetUseEntityAsHostPort() {
    return EncodingUtils.testBit(__isset_bitfield, __USEENTITYASHOSTPORT_ISSET_ID);
  }

  public void setUseEntityAsHostPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEENTITYASHOSTPORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case N:
      if (value == null) {
        unsetN();
      } else {
        setN((Integer)value);
      }
      break;

    case CRITERIA:
      if (value == null) {
        unsetCriteria();
      } else {
        setCriteria((OdsTopCriteria)value);
      }
      break;

    case AGG_TYPE:
      if (value == null) {
        unsetAggType();
      } else {
        setAggType((Integer)value);
      }
      break;

    case USE_ENTITY_AS_SMC_TIER:
      if (value == null) {
        unsetUseEntityAsSmcTier();
      } else {
        setUseEntityAsSmcTier((Boolean)value);
      }
      break;

    case USE_ENTITY_AS_HOST_PORT:
      if (value == null) {
        unsetUseEntityAsHostPort();
      } else {
        setUseEntityAsHostPort((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case N:
      return Integer.valueOf(getN());

    case CRITERIA:
      return getCriteria();

    case AGG_TYPE:
      return Integer.valueOf(getAggType());

    case USE_ENTITY_AS_SMC_TIER:
      return Boolean.valueOf(isUseEntityAsSmcTier());

    case USE_ENTITY_AS_HOST_PORT:
      return Boolean.valueOf(isUseEntityAsHostPort());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case N:
      return isSetN();
    case CRITERIA:
      return isSetCriteria();
    case AGG_TYPE:
      return isSetAggType();
    case USE_ENTITY_AS_SMC_TIER:
      return isSetUseEntityAsSmcTier();
    case USE_ENTITY_AS_HOST_PORT:
      return isSetUseEntityAsHostPort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ODSTopN)
      return this.equals((ODSTopN)that);
    return false;
  }

  public boolean equals(ODSTopN that) {
    if (that == null)
      return false;

    boolean this_present_n = true;
    boolean that_present_n = true;
    if (this_present_n || that_present_n) {
      if (!(this_present_n && that_present_n))
        return false;
      if (this.n != that.n)
        return false;
    }

    boolean this_present_criteria = true && this.isSetCriteria();
    boolean that_present_criteria = true && that.isSetCriteria();
    if (this_present_criteria || that_present_criteria) {
      if (!(this_present_criteria && that_present_criteria))
        return false;
      if (!this.criteria.equals(that.criteria))
        return false;
    }

    boolean this_present_aggType = true;
    boolean that_present_aggType = true;
    if (this_present_aggType || that_present_aggType) {
      if (!(this_present_aggType && that_present_aggType))
        return false;
      if (this.aggType != that.aggType)
        return false;
    }

    boolean this_present_useEntityAsSmcTier = true;
    boolean that_present_useEntityAsSmcTier = true;
    if (this_present_useEntityAsSmcTier || that_present_useEntityAsSmcTier) {
      if (!(this_present_useEntityAsSmcTier && that_present_useEntityAsSmcTier))
        return false;
      if (this.useEntityAsSmcTier != that.useEntityAsSmcTier)
        return false;
    }

    boolean this_present_useEntityAsHostPort = true;
    boolean that_present_useEntityAsHostPort = true;
    if (this_present_useEntityAsHostPort || that_present_useEntityAsHostPort) {
      if (!(this_present_useEntityAsHostPort && that_present_useEntityAsHostPort))
        return false;
      if (this.useEntityAsHostPort != that.useEntityAsHostPort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_n = true;
    list.add(present_n);
    if (present_n)
      list.add(n);

    boolean present_criteria = true && (isSetCriteria());
    list.add(present_criteria);
    if (present_criteria)
      list.add(criteria.getValue());

    boolean present_aggType = true;
    list.add(present_aggType);
    if (present_aggType)
      list.add(aggType);

    boolean present_useEntityAsSmcTier = true;
    list.add(present_useEntityAsSmcTier);
    if (present_useEntityAsSmcTier)
      list.add(useEntityAsSmcTier);

    boolean present_useEntityAsHostPort = true;
    list.add(present_useEntityAsHostPort);
    if (present_useEntityAsHostPort)
      list.add(useEntityAsHostPort);

    return list.hashCode();
  }

  @Override
  public int compareTo(ODSTopN other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetN()).compareTo(other.isSetN());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetN()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.n, other.n);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCriteria()).compareTo(other.isSetCriteria());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCriteria()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.criteria, other.criteria);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAggType()).compareTo(other.isSetAggType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAggType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aggType, other.aggType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUseEntityAsSmcTier()).compareTo(other.isSetUseEntityAsSmcTier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseEntityAsSmcTier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useEntityAsSmcTier, other.useEntityAsSmcTier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUseEntityAsHostPort()).compareTo(other.isSetUseEntityAsHostPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUseEntityAsHostPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.useEntityAsHostPort, other.useEntityAsHostPort);
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
    StringBuilder sb = new StringBuilder("ODSTopN(");
    boolean first = true;

    sb.append("n:");
    sb.append(this.n);
    first = false;
    if (!first) sb.append(", ");
    sb.append("criteria:");
    if (this.criteria == null) {
      sb.append("null");
    } else {
      sb.append(this.criteria);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aggType:");
    sb.append(this.aggType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("useEntityAsSmcTier:");
    sb.append(this.useEntityAsSmcTier);
    first = false;
    if (!first) sb.append(", ");
    sb.append("useEntityAsHostPort:");
    sb.append(this.useEntityAsHostPort);
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

  private static class ODSTopNStandardSchemeFactory implements SchemeFactory {
    public ODSTopNStandardScheme getScheme() {
      return new ODSTopNStandardScheme();
    }
  }

  private static class ODSTopNStandardScheme extends StandardScheme<ODSTopN> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ODSTopN struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // N
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.n = iprot.readI32();
              struct.setNIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CRITERIA
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.criteria = com.facebook.maestro.OdsTopCriteria.findByValue(iprot.readI32());
              struct.setCriteriaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AGG_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.aggType = iprot.readI32();
              struct.setAggTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USE_ENTITY_AS_SMC_TIER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.useEntityAsSmcTier = iprot.readBool();
              struct.setUseEntityAsSmcTierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USE_ENTITY_AS_HOST_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.useEntityAsHostPort = iprot.readBool();
              struct.setUseEntityAsHostPortIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ODSTopN struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(N_FIELD_DESC);
      oprot.writeI32(struct.n);
      oprot.writeFieldEnd();
      if (struct.criteria != null) {
        oprot.writeFieldBegin(CRITERIA_FIELD_DESC);
        oprot.writeI32(struct.criteria.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGG_TYPE_FIELD_DESC);
      oprot.writeI32(struct.aggType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USE_ENTITY_AS_SMC_TIER_FIELD_DESC);
      oprot.writeBool(struct.useEntityAsSmcTier);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USE_ENTITY_AS_HOST_PORT_FIELD_DESC);
      oprot.writeBool(struct.useEntityAsHostPort);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ODSTopNTupleSchemeFactory implements SchemeFactory {
    public ODSTopNTupleScheme getScheme() {
      return new ODSTopNTupleScheme();
    }
  }

  private static class ODSTopNTupleScheme extends TupleScheme<ODSTopN> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ODSTopN struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetN()) {
        optionals.set(0);
      }
      if (struct.isSetCriteria()) {
        optionals.set(1);
      }
      if (struct.isSetAggType()) {
        optionals.set(2);
      }
      if (struct.isSetUseEntityAsSmcTier()) {
        optionals.set(3);
      }
      if (struct.isSetUseEntityAsHostPort()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetN()) {
        oprot.writeI32(struct.n);
      }
      if (struct.isSetCriteria()) {
        oprot.writeI32(struct.criteria.getValue());
      }
      if (struct.isSetAggType()) {
        oprot.writeI32(struct.aggType);
      }
      if (struct.isSetUseEntityAsSmcTier()) {
        oprot.writeBool(struct.useEntityAsSmcTier);
      }
      if (struct.isSetUseEntityAsHostPort()) {
        oprot.writeBool(struct.useEntityAsHostPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ODSTopN struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.n = iprot.readI32();
        struct.setNIsSet(true);
      }
      if (incoming.get(1)) {
        struct.criteria = com.facebook.maestro.OdsTopCriteria.findByValue(iprot.readI32());
        struct.setCriteriaIsSet(true);
      }
      if (incoming.get(2)) {
        struct.aggType = iprot.readI32();
        struct.setAggTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.useEntityAsSmcTier = iprot.readBool();
        struct.setUseEntityAsSmcTierIsSet(true);
      }
      if (incoming.get(4)) {
        struct.useEntityAsHostPort = iprot.readBool();
        struct.setUseEntityAsHostPortIsSet(true);
      }
    }
  }

}
