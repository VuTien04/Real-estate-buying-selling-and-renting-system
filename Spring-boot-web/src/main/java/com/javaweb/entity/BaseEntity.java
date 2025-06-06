package com.javaweb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -863164858986274318L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createddate",updatable = false)
    @CreatedDate
    private Date createdDate;

    @Column(name = "createdby",updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(name = "modifieddate",insertable = false)
    @LastModifiedDate
    private Date modifiedDate;

    @Column(name = "modifiedby",insertable = false)
    @LastModifiedBy
    private String modifiedBy;
}
