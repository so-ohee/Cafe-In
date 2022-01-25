package com.kql.caffein.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(FollowId.class)
public class Follow {

    @Id
    private String userNo;

    @Id
    private String getUserNo;

}
