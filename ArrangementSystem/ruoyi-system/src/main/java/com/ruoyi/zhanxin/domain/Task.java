package com.ruoyi.zhanxin.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName ty_task
 */
@TableName(value ="ty_task")
@Data
public class Task implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "code")
    private String code;

    /**
     * type=1表示项目id type=2表示任务id
     */
    @TableField(value = "belong_id")
    private String belongId;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    /**
     * 
     */
    @TableField(value = "creator")
    private String creator;

    /**
     * 负责人
     */
    @TableField(value = "header")
    private String header;

    /**
     * 
     */
    @TableField(value = "description")
    private String description;

    /**
     * 
     */
    @TableField(value = "pre_begin_time")
    private LocalDateTime preBeginTime;

    /**
     * 
     */
    @TableField(value = "pre_end_time")
    private LocalDateTime preEndTime;

    /**
     * 
     */
    @TableField(value = "real_begin_time")
    private LocalDateTime realBeginTime;

    /**
     * 
     */
    @TableField(value = "real_end_time")
    private LocalDateTime realEndTime;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 任务阶段

     */
    @TableField(value = "task_phase")
    private String taskPhase;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 审批者
     */
    @TableField(value = "approver")
    private String approver;

    /**
     * 1表示任务 2表示子任务
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 交付物是否就绪
     */
    @TableField(value = "is_deliver")
    private Integer isDeliver;

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
        Task other = (Task) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getBelongId() == null ? other.getBelongId() == null : this.getBelongId().equals(other.getBelongId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getHeader() == null ? other.getHeader() == null : this.getHeader().equals(other.getHeader()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPreBeginTime() == null ? other.getPreBeginTime() == null : this.getPreBeginTime().equals(other.getPreBeginTime()))
            && (this.getPreEndTime() == null ? other.getPreEndTime() == null : this.getPreEndTime().equals(other.getPreEndTime()))
            && (this.getRealBeginTime() == null ? other.getRealBeginTime() == null : this.getRealBeginTime().equals(other.getRealBeginTime()))
            && (this.getRealEndTime() == null ? other.getRealEndTime() == null : this.getRealEndTime().equals(other.getRealEndTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getTaskPhase() == null ? other.getTaskPhase() == null : this.getTaskPhase().equals(other.getTaskPhase()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getApprover() == null ? other.getApprover() == null : this.getApprover().equals(other.getApprover()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIsDeliver() == null ? other.getIsDeliver() == null : this.getIsDeliver().equals(other.getIsDeliver()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getBelongId() == null) ? 0 : getBelongId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getHeader() == null) ? 0 : getHeader().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPreBeginTime() == null) ? 0 : getPreBeginTime().hashCode());
        result = prime * result + ((getPreEndTime() == null) ? 0 : getPreEndTime().hashCode());
        result = prime * result + ((getRealBeginTime() == null) ? 0 : getRealBeginTime().hashCode());
        result = prime * result + ((getRealEndTime() == null) ? 0 : getRealEndTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getTaskPhase() == null) ? 0 : getTaskPhase().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getApprover() == null) ? 0 : getApprover().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIsDeliver() == null) ? 0 : getIsDeliver().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", belongId=").append(belongId);
        sb.append(", title=").append(title);
        sb.append(", creator=").append(creator);
        sb.append(", header=").append(header);
        sb.append(", description=").append(description);
        sb.append(", preBeginTime=").append(preBeginTime);
        sb.append(", preEndTime=").append(preEndTime);
        sb.append(", realBeginTime=").append(realBeginTime);
        sb.append(", realEndTime=").append(realEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", taskPhase=").append(taskPhase);
        sb.append(", status=").append(status);
        sb.append(", approver=").append(approver);
        sb.append(", type=").append(type);
        sb.append(", isDeliver=").append(isDeliver);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}