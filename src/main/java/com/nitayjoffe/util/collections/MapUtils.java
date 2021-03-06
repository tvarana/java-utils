/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nitayjoffe.util.collections;

import java.util.Map;

public class MapUtils {
  protected MapUtils() { }

  /**
   * Put key,value mapping only if key does not already exist. Does a lookup
   * first, then an insert.
   *
   * Not thread-safe.
   *
   * @param map Map to put into
   * @param key key to check and insert
   * @param newValue value to insert
   * @param <K> key type
   * @param <V> value type
   * @return existing value, or new value if key was not present
   */
  public static <K,V> V putIfAbsent(Map<K, V> map, K key, V newValue) {
    V value = map.get(key);
    if (value != null) {
      return value;
    }
    map.put(key, newValue);
    return newValue;
  }
}
