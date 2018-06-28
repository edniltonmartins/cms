package br.com.ednilton.cms.domain.resouces;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.ednilton.cms.domain.model.News;
import br.com.ednilton.cms.domain.model.Review;
import br.com.ednilton.cms.domain.resouces.request.NewsRequest;

@RestController
@RequestMapping("/api/news")
public class NewsResource {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<News> findOne(@PathVariable("id") String id){
		return ResponseEntity.ok(new News());
	}
	
	@GetMapping
	public ResponseEntity<List<News>> findAll(){
		return ResponseEntity.ok(Arrays.asList(new News(), new News()));
	}
	
	@PostMapping
	public ResponseEntity<News> newNews(NewsRequest news){
		return new ResponseEntity<>(new News(), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeNews(@PathVariable("id") String id){
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<News> updateNews(@PathVariable("id") String id, NewsRequest news){
		return new ResponseEntity<>(new News(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}/review/{userId}")
	public ResponseEntity<Review> review(@PathVariable("id") String id, @PathVariable("userId") String userId){
		return ResponseEntity.ok(new Review());
	}
	
	@GetMapping(value="/revised")
	public ResponseEntity<List<News>> reviseNews(){
		return ResponseEntity.ok(Arrays.asList(new News(), new News()));
	}
	
	

}
