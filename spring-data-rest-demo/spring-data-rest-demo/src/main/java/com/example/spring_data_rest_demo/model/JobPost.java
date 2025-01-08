package com.example.spring_data_rest_demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@Entity
public class JobPost {
    // Getters and Setters (if not using Lombok)
	@Id
    private int postId;
	private String postProfile;
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;

	// No-argument constructor
	public JobPost() {}

	// All-arguments constructor
	public JobPost(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
		this.postId = postId;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.reqExperience = reqExperience;
		this.postTechStack = postTechStack;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostProfile() {
		return postProfile;
	}

	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}

	public String getPostDesc() {
		return postDesc;
	}

	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}

	public Integer getReqExperience() {
		return reqExperience;
	}

	public void setReqExperience(Integer reqExperience) {
		this.reqExperience = reqExperience;
	}

	public List<String> getPostTechStack() {
		return postTechStack;
	}

	public void setPostTechStack(List<String> postTechStack) {
		this.postTechStack = postTechStack;
	}

	@Override
	public String toString() {
		return "JobPost{" +
				"postId=" + postId +
				", postProfile='" + postProfile + '\'' +
				", postDesc='" + postDesc + '\'' +
				", reqExperience=" + reqExperience +
				", postTechStack=" + postTechStack +
				'}';
	}
}
