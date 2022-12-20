package com.hungnm.demos.graphql.resolver;

import java.util.Optional;

import com.hungnm.demos.graphql.model.Author;
import com.hungnm.demos.graphql.model.Tutorial;
import com.hungnm.demos.graphql.repository.AuthorRepository;
import com.hungnm.demos.graphql.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import javassist.NotFoundException;

@Component
public class Mutation implements GraphQLMutationResolver {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;

	@Autowired
	public Mutation(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
	}

	public Author createAuthor(String name, Integer age) {
		Author author = new Author();
		author.setName(name);
		author.setAge(age);

		authorRepository.save(author);

		return author;
	}

	public boolean deleteAuthor(Long id) {
		authorRepository.deleteById(id);
		return true;
	}
	public Author updateAuthor(Long id, String name, Integer age) throws NotFoundException {
		Optional<Author> optAuthor = authorRepository.findById(id);

		if (optAuthor.isPresent()) {
			Author author = optAuthor.get();

			if (name != null)
				author.setName(name);
			if (age > 0)
				author.setAge(age);

			authorRepository.save(author);
			return author;
		}

		throw new NotFoundException("Not found Author to update!");
	}


	public Tutorial createTutorial(String title, String description, Long authorId) {
		Tutorial book = new Tutorial();
		book.setAuthor(new Author(authorId));
		book.setTitle(title);
		book.setDescription(description);

		tutorialRepository.save(book);

		return book;
	}

	public boolean deleteTutorial(Long id) {
		tutorialRepository.deleteById(id);
		return true;
	}

	public Tutorial updateTutorial(Long id, String title, String description) throws NotFoundException {
		Optional<Tutorial> optTutorial = tutorialRepository.findById(id);

		if (optTutorial.isPresent()) {
			Tutorial tutorial = optTutorial.get();

			if (title != null)
				tutorial.setTitle(title);
			if (description != null)
				tutorial.setDescription(description);

			tutorialRepository.save(tutorial);
			return tutorial;
		}

		throw new NotFoundException("Not found Tutorial to update!");
	}
}
