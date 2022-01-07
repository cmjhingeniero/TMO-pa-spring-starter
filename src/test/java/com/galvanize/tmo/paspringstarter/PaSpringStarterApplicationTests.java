package com.galvanize.tmo.paspringstarter;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.tmo.paspringstarter.models.Book;
import com.galvanize.tmo.paspringstarter.service.BookService;

@SpringBootTest
@AutoConfigureMockMvc
class PaSpringStarterApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	BookService service;
	
	ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void contextLoads() {
	}

	@Test
	void isHealthy() throws Exception {
		mockMvc.perform(get("/health"))
				.andExpect(status().isOk());
	}
	
	@Test
	void getAll() throws Exception {
		List<Book> listBook = new ArrayList<Book>();
		listBook.add(new Book(1L, "Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 1979));
		listBook.add(new Book(2L, "Philip K. Dick", "Do Androids Dream of Electric Sheep?", 1968));
		listBook.add(new Book(3L, "William Gibson", "Neuromancer", 1984));
		
        when(service.getBooks()).thenReturn(listBook);

        mockMvc.perform(get("/api/books").contentType(MediaType.APPLICATION_JSON)
                            .content(mapper.writeValueAsString(listBook)))
                .andExpect(status().isOk());
	}
	
}
