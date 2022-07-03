package com.hibernate.hibernateonetomanymapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.hibernate.hibernateonetomanymapping.Model.Comment;
import com.hibernate.hibernateonetomanymapping.Model.Post;
import com.hibernate.hibernateonetomanymapping.Repository.PostRepository;

@SpringBootApplication
public class HibernateonetomanymappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateonetomanymappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
	Post post = new Post("This is hibernate one to one mapping example","This is hibernate one to one mapping example");
		
	Comment comment1 = new Comment("Very Effective");
	Comment comment2 = new Comment("Infromative");
	Comment comment3 = new Comment("Great Post");	
	
	post.getComments().add(comment1);
	post.getComments().add(comment2);
	post.getComments().add(comment3);
	this.postRepository.save(post);
	
	}

}



