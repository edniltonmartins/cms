package br.com.ednilton.cms.domain.vo;

import java.util.Set;

import br.com.ednilton.cms.domain.model.Category;
import br.com.ednilton.cms.domain.model.Tag;
import lombok.Data;

@Data
public class NewsRequest {

	String title;
	String content;
	
	Set<Category> categories;
	Set<Tag> tags;
}
