package com.hibernate.hibernateonetomanymapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hibernate.hibernateonetomanymapping.Model.Comment;

@EnableJpaRepositories
public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
