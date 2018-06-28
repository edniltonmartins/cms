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
}
