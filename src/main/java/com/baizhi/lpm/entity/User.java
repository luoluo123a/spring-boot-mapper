package com.baizhi.lpm.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="a_user")
public class User implements Serializable {
    @Id
    @JSONField(serialize = false)
    private  Integer id;
    @Column(name ="userName")
    private String userName;
    private String pwd;
    private Integer type;
}
