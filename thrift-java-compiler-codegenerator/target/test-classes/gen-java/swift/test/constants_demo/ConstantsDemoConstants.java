/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package swift.test.constants_demo;

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
public class ConstantsDemoConstants {

  public static final int myInt = 3;

  public static final int hex_const = 31;

  public static final int oct_const = 700;

  public static final int int_const_single_d = 9;

  public static final int int_const_multi_d = 1000;

  public static final int int_const_zero = 0;

  public static final int GEN_ME = -3523553;

  public static final double GEn_DUB = 325.532;

  public static final double GEn_DU = 85.2355;

  public static final String GEN_STRING = "asldkjasfd";

  public static final boolean bool_const_false = false;

  public static final boolean bool_const_true = true;

  public static final byte byte_seventy_nine = (byte)79;

  public static final Map<Integer,Integer> GEN_MAP = new HashMap<Integer,Integer>();
  static {
    GEN_MAP.put(35532, 233);
    GEN_MAP.put(43523, 853);
  }

  public static final List<Integer> GEN_LIST = new ArrayList<Integer>();
  static {
    GEN_LIST.add(235235);
    GEN_LIST.add(23598352);
    GEN_LIST.add(3253523);
  }

  public static final Map<Integer,Map<Integer,Integer>> GEN_MAPMAP = new HashMap<Integer,Map<Integer,Integer>>();
  static {
    Map<Integer,Integer> tmp0 = new HashMap<Integer,Integer>();
    tmp0.put(532, 53255);
    tmp0.put(235, 235);

    GEN_MAPMAP.put(235, tmp0);
  }

  public static final Map<String,Integer> GEN_MAP2 = new HashMap<String,Integer>();
  static {
    GEN_MAP2.put("hello", 233);
    GEN_MAP2.put("lkj98d", 853);
    GEN_MAP2.put("lkjsdf", 98325);
  }

  public static final Set<Integer> GEN_SET = new HashSet<Integer>();
  static {
    GEN_SET.add(235);
    GEN_SET.add(235);
    GEN_SET.add(53235);
  }

}
