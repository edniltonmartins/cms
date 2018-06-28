package br.com.ednilton.cms.domain.model;

import java.util.Set;

import lombok.Data;

@Data
public class News {

	String id;
	String title;
	String content;
	User author;
	Set<User> mandatoryReviews;
	Set<Review> reviwers;
	
	public Review review(String userId,String status){
		Review review = new Review(userId, status);
		this.reviwers.add(review);
		return review;
	}
	
	public Boolean revised(){
		return this.mandatoryReviews.stream().
				allMatch(reviwer-> this.reviwers.stream().anyMatch(review->reviwer.id.equals(review.userId) && "approved".equals(review.status) ));
	}
}
