package com.guihx.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author guihx
 * @since 2021-05-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Files implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "FilesId", type = IdType.AUTO)
    private Long filesid;

    @TableField("FilesParentId")
    private Long filesparentid;

    @TableField("FilesType")
    private String filestype;

    @TableField("FilesName")
    private String filesname;

    @TableField("FilesPath")
    private String filespath;

    @TableField("FilesUploadTime")
    private Date filesuploadtime;

    @TableField("FilesIsDel")
    private Integer filesisdel;

    @TableField("EmployeeId")
    private Integer employeeid;

    @TableField("ProjectId")
    private Integer projectid;

    @TableField("QrCodePath")
    private String qrcodepath;

    @Version
    private Integer version;


}
