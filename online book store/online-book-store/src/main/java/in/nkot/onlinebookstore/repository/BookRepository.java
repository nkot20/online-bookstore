package in.nkot.onlinebookstore.repository;

import in.nkot.onlinebookstore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {

}
