package com.qizhidao.ecloud.history.contract.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class CopyrightAgent {
    /**
     *   表主键
     */
    private Long agentId;

    /**
     *   ips_cr_copyright_t表主键
     */
    private Long copyrightId;

    /**
     *   姓名或者名称
     */
    private Integer agentUserId;

    /**
     *   详细地址
     */
    private String address;

    /**
     *   邮政编码
     */
    private String postalCode;

    /**
     *   联系人
     */
    private String contactPerson;

    /**
     *   电话号码
     */
    private String telephoneNo;

    /**
     *   E-Mail
     */
    private String email;

    /**
     *   手机号码
     */
    private String phoneNo;

    /**
     *   传真号码
     */
    private String faxNo;

    /**
     *   创建人
     */
    private Long createBy;

    /**
     *   创建时间
     */
    private Date createDate;

    /**
     *   最后更新人
     */
    private Long lastUpdateBy;

    /**
     *   最后更新时间
     */
    private Date lastUpdateDate;
}