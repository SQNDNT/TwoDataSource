package com.guihx.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author guihx
 * @since 2021-06-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId("EmployeeID")
    private String employeeid;

    @TableField("IDNumber")
    private String idnumber;

    @TableField("RealName")
    private String realname;

    @TableField("PhotoPath")
    private String photopath;

    @TableField("DepartmentID")
    private String departmentid;

    @TableField("HireDate")
    private Date hiredate;

    @TableField("UnitID")
    private String unitid;

    @TableField("PhoneNumber")
    private String phonenumber;

    @TableField("Email")
    private String email;

    @TableField("Address")
    private String address;

    @TableField("State")
    private Integer state;

    @TableField("Gender")
    private Integer gender;

    @TableField("Birth")
    private Date birth;

    @TableField("NativePlace")
    private String nativeplace;

    @TableField("PoliticalOutlook")
    private String politicaloutlook;

    @TableField("WorkingAge")
    private Integer workingage;

    @TableField("DivisionAge")
    private Integer divisionage;

    @TableField("HousingCase")
    private Integer housingcase;

    @TableField("MarryCase")
    private String marrycase;

    @TableField("EmployeeContractType")
    private Integer employeecontracttype;

    @TableField("ContractDeadline")
    private String contractdeadline;

    @TableField("SocialPayStatus")
    private Integer socialpaystatus;

    @TableField("AccmuPayStatus")
    private Integer accmupaystatus;

    @TableField("FileLocation")
    private String filelocation;

    @TableField("Hobbies")
    private String hobbies;

    @TableField("EducationLevel")
    private Integer educationlevel;

    @TableField("PostLevel")
    private Integer postlevel;

    @TableField("WorkingAddress")
    private String workingaddress;

    @TableField("Uitheme")
    private Integer uitheme;

    @TableField("PublicKey")
    private String publickey;

    @TableField("SecretKey")
    private String secretkey;

    @TableField("DigitalCertificatePath")
    private String digitalcertificatepath;

    @TableField("SignaturePicPath")
    private String signaturepicpath;

    @TableField("DigitalCertificatePassword")
    private String digitalcertificatepassword;


}
