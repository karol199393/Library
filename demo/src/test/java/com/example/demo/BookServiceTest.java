package com.example.demo;


import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Test
    public void testGetById() {
        //Mockowanie zaleznosci
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        when(bookRepositoryMock.findById(1L)).thenReturn(Optional.of(new Book(1L, "Title")));

        //Testowana metoda z mockowana zaleznoscia
        BookService bookService = new BookService(bookRepositoryMock);
        //Wywolanie metody
        Book result = bookService.getById(1L);

        //Sprawdzenie wyniku
        assertEquals("Title", result.getTitle());
        //Sprawdzenie czy metoda zostala wywolana
        verify(bookRepositoryMock,times(1)).findById(1L);



    }
}
