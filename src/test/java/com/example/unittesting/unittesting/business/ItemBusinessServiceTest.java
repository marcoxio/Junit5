package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.data.ItemRepository;
import com.example.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {
    @InjectMocks
    private ItemBusinessService business;

    @Mock
    private ItemRepository repository;

    @Test
    public void retrieveAllItems_basic() {
        when(repository.findAll()).thenReturn(Arrays.asList(new Item(2,"Item2",10,10),
                        new Item(3,"Item3",20,20)));
        List<Item> items = business.retrieveAllItems();

        assertEquals(100,items.get(0).getValue());
        assertEquals(400,items.get(1).getValue());
    }
}
