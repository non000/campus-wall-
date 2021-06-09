package com.nf.campuswall.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JsonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    private static final String STANDARD_PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_PATTERN = "yyyy-MM-dd";
    private static final String TIME_PATTERN = "HH:mm:ss";


    static {

        //设置java.util.Date时间类的序列化以及反序列化的格式
        objectMapper.setDateFormat(new SimpleDateFormat(STANDARD_PATTERN));

        // 初始化JavaTimeModule
        JavaTimeModule javaTimeModule = new JavaTimeModule();

        //处理LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(STANDARD_PATTERN);
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(dateTimeFormatter));
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(dateTimeFormatter));

        //处理LocalDate
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(dateFormatter));
        javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(dateFormatter));

        //处理LocalTime
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(TIME_PATTERN);
        javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(timeFormatter));
        javaTimeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer(timeFormatter));

        //注册时间模块, 支持jsr310, 即新的时间类(java.time包下的时间类)
        objectMapper.registerModule(javaTimeModule);

        // 包含所有字段
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

        // 在序列化一个空对象时时不抛出异常
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);

        // 忽略反序列化时在json字符串中存在, 但在java对象中不存在的属性
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public static <T> String objectString(T object){
        if (object==null){
            return null;
        }
        try {
            return object instanceof String ? (String) object:objectMapper.writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static <T> String objectStringPretty(T object){
        if (object==null){
            return null;
        }
        try {
            return object instanceof String ? (String) object:objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T stringObject(String str,Class<T>clazz){
        if (str==null || str.isEmpty()||clazz==null){
            return null;
        }
        try{
            return clazz.equals(String.class)? (T) str:objectMapper.readValue(str,clazz);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //TypeReference是jackson中的类不是mybatis里面的，别导错了类
    public static <T> T stringObject(String str, TypeReference<T> typeReference){
        if (str==null || str.isEmpty() || typeReference==null){
            return null;
        }
        try{
            return typeReference.getType().equals(String.class)?(T)str:objectMapper.readValue(str,typeReference);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static <T> T stringObject(String str,Class<?> collectionClass,Class<?>... elementClass){
        JavaType javaType=objectMapper.getTypeFactory().constructParametricType(collectionClass,elementClass);
        try{
            return objectMapper.readValue(str,javaType);
        }catch (Exception e){
        e.printStackTrace();
        return null;
        }
    }


}
