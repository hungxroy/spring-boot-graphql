package com.hungnm.demos.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hungnm.demos.graphql.model.Author;
import com.hungnm.demos.graphql.model.Tutorial;
import com.hungnm.demos.graphql.repository.AuthorRepository;
import com.hungnm.demos.graphql.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;

	@Autowired
	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public long countAuthors() {
		return authorRepository.count();
	}

	public Author getAuthorById(Long id) {
		return authorRepository.findById(id).get();
	}



	public Iterable<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}

	public long countTutorials() {
		return tutorialRepository.count();
	}

	public Tutorial getTutorialById(Long id) {
		return tutorialRepository.findById(id).get();
	}


}
