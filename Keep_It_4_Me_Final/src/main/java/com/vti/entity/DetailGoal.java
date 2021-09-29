
package com.vti.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

//import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "Detail_Goal")
public class DetailGoal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detail_Goal_ID", nullable = false)
	private Integer detail_Goal_ID;
	
	@NotEmpty
    @Column(name = "nameDetail", nullable = false)
    private String nameDetail;
	
	@Column(name = "start_Day")
	private java.sql.Date start_Day;
	
	@Column(name = "end_Day")
	private java.sql.Date end_Day;
	
	// @Column(name = "status", nullable = false, unique = true)
	// @Enumerated(EnumType.STRING)
	// private Status status;

	// public enum Status {
	// 	Cong_Khai, Chi_Rieng_Toi
	// }
	
	public DetailGoal() {
	}
	
	public DetailGoal(Integer detail_Goal_ID, String nameDetail, Date start_Day, Date end_Day) {
        this.detail_Goal_ID = detail_Goal_ID;
        this.nameDetail = nameDetail;
        this.start_Day = start_Day;
        this.end_Day = end_Day;
	}

	public Integer getDetail_Goal_ID() {
		return detail_Goal_ID;
	}

	public void setDetail_Goal_ID(Integer detail_Goal_ID) {
		this.detail_Goal_ID = detail_Goal_ID;
	}

	public String getNameDetail() {
		return nameDetail;
	}

	public void setNameDetail(String nameDetail) {
		this.nameDetail = nameDetail;
	}

	public java.sql.Date getStart_Day() {
		return start_Day;
	}

	public void setStart_Day(java.sql.Date start_Day) {
		this.start_Day = start_Day;
	}

	public java.sql.Date getEnd_Day() {
		return end_Day;
	}

	public void setEnd_Day(java.sql.Date end_Day) {
		this.end_Day = end_Day;
	}
	
	
	
}
