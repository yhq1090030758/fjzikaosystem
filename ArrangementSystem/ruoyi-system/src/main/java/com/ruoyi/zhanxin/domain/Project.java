package com.ruoyi.zhanxin.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName ty_project
 */
@TableName(value ="ty_project")
@Data
public class Project implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称

     */
    @TableField(value = "name")
    private String name;

    /**
     * 项目编码

     */
    @TableField(value = "project_code")
    private String projectCode;

    /**
     * 客户

     */
    @TableField(value = "customer")
    private String customer;

    /**
     * 封装类型

     */
    @TableField(value = "package_type")
    private String packageType;

    /**
     * 封装工厂
     */
    @TableField(value = "package_factory")
    private String packageFactory;

    /**
     * 晶元工艺

     */
    @TableField(value = "wafer_process")
    private String waferProcess;

    /**
     * 晶元厂
     */
    @TableField(value = "wafer_factory")
    private String waferFactory;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 更新者
     */
    @TableField(value = "updater",fill = FieldFill.UPDATE)
    private String updater;

    /**
     * 创建者
     */
    @TableField(value = "creator",fill = FieldFill.INSERT)
    private String creator;

    /**
     * 项目经理id

     */
    @TableField(value = "project_manager_id")
    private Integer projectManagerId;

    /**
     * 项目经理名字
     */
    @TableField(value = "project_manager_name")
    private String projectManagerName;

    /**
     * fae id
     */
    @TableField(value = "fae_id")
    private Integer faeId;

    /**
     * fae名字
     */
    @TableField(value = "fae_name")
    private String faeName;

    /**
     * 是否重要

     */
    @TableField(value = "is_important")
    private Integer isImportant;

    /**
     * 项目状态

     */
    @TableField(value = "project_status")
    private Integer projectStatus;

    /**
     * 可见范围
     */
    @TableField(value = "visibility")
    private String visibility;

    /**
     * 
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Project other = (Project) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getProjectCode() == null ? other.getProjectCode() == null : this.getProjectCode().equals(other.getProjectCode()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getPackageType() == null ? other.getPackageType() == null : this.getPackageType().equals(other.getPackageType()))
            && (this.getPackageFactory() == null ? other.getPackageFactory() == null : this.getPackageFactory().equals(other.getPackageFactory()))
            && (this.getWaferProcess() == null ? other.getWaferProcess() == null : this.getWaferProcess().equals(other.getWaferProcess()))
            && (this.getWaferFactory() == null ? other.getWaferFactory() == null : this.getWaferFactory().equals(other.getWaferFactory()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getProjectManagerId() == null ? other.getProjectManagerId() == null : this.getProjectManagerId().equals(other.getProjectManagerId()))
            && (this.getProjectManagerName() == null ? other.getProjectManagerName() == null : this.getProjectManagerName().equals(other.getProjectManagerName()))
            && (this.getFaeId() == null ? other.getFaeId() == null : this.getFaeId().equals(other.getFaeId()))
            && (this.getFaeName() == null ? other.getFaeName() == null : this.getFaeName().equals(other.getFaeName()))
            && (this.getIsImportant() == null ? other.getIsImportant() == null : this.getIsImportant().equals(other.getIsImportant()))
            && (this.getProjectStatus() == null ? other.getProjectStatus() == null : this.getProjectStatus().equals(other.getProjectStatus()))
            && (this.getVisibility() == null ? other.getVisibility() == null : this.getVisibility().equals(other.getVisibility()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getProjectCode() == null) ? 0 : getProjectCode().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        result = prime * result + ((getPackageFactory() == null) ? 0 : getPackageFactory().hashCode());
        result = prime * result + ((getWaferProcess() == null) ? 0 : getWaferProcess().hashCode());
        result = prime * result + ((getWaferFactory() == null) ? 0 : getWaferFactory().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getProjectManagerId() == null) ? 0 : getProjectManagerId().hashCode());
        result = prime * result + ((getProjectManagerName() == null) ? 0 : getProjectManagerName().hashCode());
        result = prime * result + ((getFaeId() == null) ? 0 : getFaeId().hashCode());
        result = prime * result + ((getFaeName() == null) ? 0 : getFaeName().hashCode());
        result = prime * result + ((getIsImportant() == null) ? 0 : getIsImportant().hashCode());
        result = prime * result + ((getProjectStatus() == null) ? 0 : getProjectStatus().hashCode());
        result = prime * result + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", projectCode=").append(projectCode);
        sb.append(", customer=").append(customer);
        sb.append(", packageType=").append(packageType);
        sb.append(", packageFactory=").append(packageFactory);
        sb.append(", waferProcess=").append(waferProcess);
        sb.append(", waferFactory=").append(waferFactory);
        sb.append(", description=").append(description);
        sb.append(", updater=").append(updater);
        sb.append(", creator=").append(creator);
        sb.append(", projectManagerId=").append(projectManagerId);
        sb.append(", projectManagerName=").append(projectManagerName);
        sb.append(", faeId=").append(faeId);
        sb.append(", faeName=").append(faeName);
        sb.append(", isImportant=").append(isImportant);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", visibility=").append(visibility);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}