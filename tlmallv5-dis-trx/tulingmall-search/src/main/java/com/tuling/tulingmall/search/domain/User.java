package com.tuling.tulingmall.search.domain;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author 白起老师
 */
@Document(indexName = "es_test_index", type = "_doc",shards = 1,replicas = 1)
public class User implements Serializable {
    @Field(type = FieldType.Keyword)
    private String name;

    private int age;

    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String desc;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public User() {

    }

    public User(String name, int age, String desc) {
        this.name = name;
        this.age = age;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
