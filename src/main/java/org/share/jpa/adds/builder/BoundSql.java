///**
// *    Copyright 2009-2019 the original author or authors.
// *
// *    Licensed under the Apache License, Version 2.0 (the "License");
// *    you may not use this file except in compliance with the License.
// *    You may obtain a copy of the License at
// *
// *       http://www.apache.org/licenses/LICENSE-2.0
// *
// *    Unless required by applicable law or agreed to in writing, software
// *    distributed under the License is distributed on an "AS IS" BASIS,
// *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// *    See the License for the specific language governing permissions and
// *    limitations under the License.
// */
//package org.share.jpa.adds.builder;
//
//
//import org.share.reflection.api.ObjectOperator;
//import org.share.reflection.api.ReflectApi;
//import org.share.reflection.meta.MetaObject;
//import org.share.reflection.property.PropertyTokenizer;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * An actual SQL String got from an {@link SqlSource} after having processed any dynamic content.
// * The SQL may have SQL placeholders "?" and an list (ordered) of an parameter mappings
// * with the additional information for each parameter (at least the property name of the input object to read
// * the value from).
// * <p>
// * Can also have additional parameters that are created by the dynamic language (for loops, bind...).
// *
// * @author Clinton Begin
// */
//public class BoundSql {
//
//  private final String sql;
//  private final List<ParameterMapping> parameterMappings;
//  private final Object parameterObject;
//  private final Map<String, Object> additionalParameters;
//  private final ObjectOperator metaParameters;
//
//  public BoundSql( String sql, List<ParameterMapping> parameterMappings, Object parameterObject) {
//    this.sql = sql;
//    this.parameterMappings = parameterMappings;
//    this.parameterObject = parameterObject;
//    this.additionalParameters = new HashMap<>();
//
//    this.metaParameters = ReflectApi.forObject(parameterObject);
//  }
//
//
//
//  public List<ParameterMapping> getParameterMappings() {
//    return parameterMappings;
//  }
//
//  public Object getParameterObject() {
//    return parameterObject;
//  }
//
//
//  public boolean hasAdditionalParameter(String name) {
//    String paramName = new PropertyTokenizer(name).getName();
//    return additionalParameters.containsKey(paramName);
//  }
//
//  public void setAdditionalParameter(String name, Object value) {
//    metaParameters.setValue(name, value);
//  }
//  public Object getAdditionalParameter(String name) {
//    return metaParameters.getValue(name);
//  }
//
//
//  public String getSql() {
//    return sql;
//  }
//}