package com.example.easynotes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long UserId;
	@NotBlank
	public String UserEmail;
	@NotBlank
	public String UserName;
	@NotBlank
	public String Password;
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	public Date updatedAt;
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	public Date createdAt;
	@NotBlank
	public String UserType;
	@NotBlank
	public char Active;
	@Column(nullable = false, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	public Date DOB;
	@NotBlank
	public String PrimaryPhone;
	@NotBlank
	public String Grade;
	@NotBlank
	public String HintQuestion;
	@NotBlank
	public String HintAnswer;
	
	//public User() {}
	
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getLastLoginDate() {
		return updatedAt;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		updatedAt = lastLoginDate;
	}
	public Date getCreationDate() {
		return createdAt;
	}
	public void setCreationDate(Date creationDate) {
		createdAt = creationDate;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(char active) {
		Active = active;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getPrimaryPhone() {
		return PrimaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		PrimaryPhone = primaryPhone;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getHintQuestion() {
		return HintQuestion;
	}
	public void setHintQuestion(String hintQuestion) {
		HintQuestion = hintQuestion;
	}
	public String getHintAnswer() {
		return HintAnswer;
	}
	public void setHintAnswer(String hintAnswer) {
		HintAnswer = hintAnswer;
	}
	public User(Long userId, String userEmail, String userName, String password, Date lastLoginDate,
			Date creationDate, String userType, char active, Date dOB, String primaryPhone, String grade,
			String hintQuestion, String hintAnswer) {
		super();
		UserId = userId;
		UserEmail = userEmail;
		UserName = userName;
		Password = password;
		updatedAt = lastLoginDate;
		createdAt = creationDate;
		UserType = userType;
		Active = active;
		DOB = dOB;
		PrimaryPhone = primaryPhone;
		Grade = grade;
		HintQuestion = hintQuestion;
		HintAnswer = hintAnswer;
	}

}
