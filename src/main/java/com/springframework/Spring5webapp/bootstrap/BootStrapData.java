package com.springframework.Spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.Spring5webapp.repo.AuthorRepository;
import com.springframework.Spring5webapp.repo.BookRepository;
import com.springframework.Spring5webapp.repo.PublisherRepository;
import com.springframework.Spring5webapp.Author;
import com.springframework.Spring5webapp.Books;
import com.springframework.Spring5webapp.Publisher;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final AuthorRepository authorRepository;
	
	private final BookRepository bookRepository;
	
	private final PublisherRepository publisherRepository ; 
	
	

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Author eric = new Author("Eric" , "Dier") ; 
		Books ddd = new Books("Domain Driven Desgin" , "12345");
		Publisher publisher = new Publisher();
		publisher.setName("Penguin");
		publisher.setCity("Washington");
		publisher.setState("Alabama");
		publisherRepository.save(publisher);
		System.out.println("Publisher count: "+ publisherRepository.count());
		eric.getBooks().add(ddd);
		ddd.getAuthor().add(eric);
		publisher.getBooks().add(ddd);

		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);
		
		Author chris = new Author("Chris" , "Evans") ; 
		Books avengers = new Books("InfinityWar" , "134532");
		chris.getBooks().add(avengers);
		avengers.getAuthor().add(chris);
		publisher.getBooks().add(avengers);
		
		
		authorRepository.save(chris);
		bookRepository.save(avengers);
		publisherRepository.save(publisher);
		
		System.out.println("In the bootStrapdata method");
		System.out.println(bookRepository.count());
		System.out.println(authorRepository.count());
		System.out.println(publisherRepository.count());
		System.out.println(publisher.getBooks().size());
	}

}
