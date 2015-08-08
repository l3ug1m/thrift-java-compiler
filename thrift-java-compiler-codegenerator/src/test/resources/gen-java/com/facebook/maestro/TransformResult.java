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
public class TransformResult implements org.apache.thrift.TBase<TransformResult, TransformResult._Fields>, java.io.Serializable, Cloneable, Comparable<TransformResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TransformResult");

  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField ENTITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("entities", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TransformResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TransformResultTupleSchemeFactory());
  }

  public Map<String,Map<String,String>> values; // required
  public Set<String> entities; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUES((short)1, "values"),
    ENTITIES((short)2, "entities");

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
        case 1: // VALUES
          return VALUES;
        case 2: // ENTITIES
          return ENTITIES;
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
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)))));
    tmpMap.put(_Fields.ENTITIES, new org.apache.thrift.meta_data.FieldMetaData("entities", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TransformResult.class, metaDataMap);
  }

  public TransformResult() {
  }

  public TransformResult(
    Map<String,Map<String,String>> values,
    Set<String> entities)
  {
    this();
    this.values = values;
    this.entities = entities;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TransformResult(TransformResult other) {
    if (other.isSetValues()) {
      Map<String,Map<String,String>> __this__values = new HashMap<String,Map<String,String>>(other.values.size());
      for (Map.Entry<String, Map<String,String>> other_element : other.values.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<String,String> other_element_value = other_element.getValue();

        String __this__values_copy_key = other_element_key;

        Map<String,String> __this__values_copy_value = new HashMap<String,String>(other_element_value);

        __this__values.put(__this__values_copy_key, __this__values_copy_value);
      }
      this.values = __this__values;
    }
    if (other.isSetEntities()) {
      Set<String> __this__entities = new HashSet<String>(other.entities);
      this.entities = __this__entities;
    }
  }

  public TransformResult deepCopy() {
    return new TransformResult(this);
  }

  @Override
  public void clear() {
    this.values = null;
    this.entities = null;
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public void putToValues(String key, Map<String,String> val) {
    if (this.values == null) {
      this.values = new HashMap<String,Map<String,String>>();
    }
    this.values.put(key, val);
  }

  public Map<String,Map<String,String>> getValues() {
    return this.values;
  }

  public TransformResult setValues(Map<String,Map<String,String>> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public int getEntitiesSize() {
    return (this.entities == null) ? 0 : this.entities.size();
  }

  public java.util.Iterator<String> getEntitiesIterator() {
    return (this.entities == null) ? null : this.entities.iterator();
  }

  public void addToEntities(String elem) {
    if (this.entities == null) {
      this.entities = new HashSet<String>();
    }
    this.entities.add(elem);
  }

  public Set<String> getEntities() {
    return this.entities;
  }

  public TransformResult setEntities(Set<String> entities) {
    this.entities = entities;
    return this;
  }

  public void unsetEntities() {
    this.entities = null;
  }

  /** Returns true if field entities is set (has been assigned a value) and false otherwise */
  public boolean isSetEntities() {
    return this.entities != null;
  }

  public void setEntitiesIsSet(boolean value) {
    if (!value) {
      this.entities = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((Map<String,Map<String,String>>)value);
      }
      break;

    case ENTITIES:
      if (value == null) {
        unsetEntities();
      } else {
        setEntities((Set<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUES:
      return getValues();

    case ENTITIES:
      return getEntities();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VALUES:
      return isSetValues();
    case ENTITIES:
      return isSetEntities();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TransformResult)
      return this.equals((TransformResult)that);
    return false;
  }

  public boolean equals(TransformResult that) {
    if (that == null)
      return false;

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    boolean this_present_entities = true && this.isSetEntities();
    boolean that_present_entities = true && that.isSetEntities();
    if (this_present_entities || that_present_entities) {
      if (!(this_present_entities && that_present_entities))
        return false;
      if (!this.entities.equals(that.entities))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    boolean present_entities = true && (isSetEntities());
    list.add(present_entities);
    if (present_entities)
      list.add(entities);

    return list.hashCode();
  }

  @Override
  public int compareTo(TransformResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntities()).compareTo(other.isSetEntities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entities, other.entities);
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
    StringBuilder sb = new StringBuilder("TransformResult(");
    boolean first = true;

    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entities:");
    if (this.entities == null) {
      sb.append("null");
    } else {
      sb.append(this.entities);
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

  private static class TransformResultStandardSchemeFactory implements SchemeFactory {
    public TransformResultStandardScheme getScheme() {
      return new TransformResultStandardScheme();
    }
  }

  private static class TransformResultStandardScheme extends StandardScheme<TransformResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TransformResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map82 = iprot.readMapBegin();
                struct.values = new HashMap<String,Map<String,String>>(2*_map82.size);
                String _key83;
                Map<String,String> _val84;
                for (int _i85 = 0; _i85 < _map82.size; ++_i85)
                {
                  _key83 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map86 = iprot.readMapBegin();
                    _val84 = new HashMap<String,String>(2*_map86.size);
                    String _key87;
                    String _val88;
                    for (int _i89 = 0; _i89 < _map86.size; ++_i89)
                    {
                      _key87 = iprot.readString();
                      _val88 = iprot.readString();
                      _val84.put(_key87, _val88);
                    }
                    iprot.readMapEnd();
                  }
                  struct.values.put(_key83, _val84);
                }
                iprot.readMapEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set90 = iprot.readSetBegin();
                struct.entities = new HashSet<String>(2*_set90.size);
                String _elem91;
                for (int _i92 = 0; _i92 < _set90.size; ++_i92)
                {
                  _elem91 = iprot.readString();
                  struct.entities.add(_elem91);
                }
                iprot.readSetEnd();
              }
              struct.setEntitiesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TransformResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.values.size()));
          for (Map.Entry<String, Map<String,String>> _iter93 : struct.values.entrySet())
          {
            oprot.writeString(_iter93.getKey());
            {
              oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, _iter93.getValue().size()));
              for (Map.Entry<String, String> _iter94 : _iter93.getValue().entrySet())
              {
                oprot.writeString(_iter94.getKey());
                oprot.writeString(_iter94.getValue());
              }
              oprot.writeMapEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.entities != null) {
        oprot.writeFieldBegin(ENTITIES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.entities.size()));
          for (String _iter95 : struct.entities)
          {
            oprot.writeString(_iter95);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TransformResultTupleSchemeFactory implements SchemeFactory {
    public TransformResultTupleScheme getScheme() {
      return new TransformResultTupleScheme();
    }
  }

  private static class TransformResultTupleScheme extends TupleScheme<TransformResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TransformResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetValues()) {
        optionals.set(0);
      }
      if (struct.isSetEntities()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (Map.Entry<String, Map<String,String>> _iter96 : struct.values.entrySet())
          {
            oprot.writeString(_iter96.getKey());
            {
              oprot.writeI32(_iter96.getValue().size());
              for (Map.Entry<String, String> _iter97 : _iter96.getValue().entrySet())
              {
                oprot.writeString(_iter97.getKey());
                oprot.writeString(_iter97.getValue());
              }
            }
          }
        }
      }
      if (struct.isSetEntities()) {
        {
          oprot.writeI32(struct.entities.size());
          for (String _iter98 : struct.entities)
          {
            oprot.writeString(_iter98);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TransformResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map99 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.values = new HashMap<String,Map<String,String>>(2*_map99.size);
          String _key100;
          Map<String,String> _val101;
          for (int _i102 = 0; _i102 < _map99.size; ++_i102)
          {
            _key100 = iprot.readString();
            {
              org.apache.thrift.protocol.TMap _map103 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _val101 = new HashMap<String,String>(2*_map103.size);
              String _key104;
              String _val105;
              for (int _i106 = 0; _i106 < _map103.size; ++_i106)
              {
                _key104 = iprot.readString();
                _val105 = iprot.readString();
                _val101.put(_key104, _val105);
              }
            }
            struct.values.put(_key100, _val101);
          }
        }
        struct.setValuesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TSet _set107 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.entities = new HashSet<String>(2*_set107.size);
          String _elem108;
          for (int _i109 = 0; _i109 < _set107.size; ++_i109)
          {
            _elem108 = iprot.readString();
            struct.entities.add(_elem108);
          }
        }
        struct.setEntitiesIsSet(true);
      }
    }
  }

}

