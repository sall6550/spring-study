package study.springresttemplateserver.service;

import org.springframework.stereotype.Service;
import study.springresttemplateserver.dto.ItemResponseDto;
import study.springresttemplateserver.dto.UserRequestDto;
import study.springresttemplateserver.entity.Item;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> itemList = Arrays.asList(
            new Item("Mac", 3_888_000),
            new Item("iPad", 1_230_000),
            new Item("iPhone", 1_550_000),
            new Item("Watch", 450_000),
            new Item("AirPods", 350_000)
    );

    public Item getCallObject(String query) {
        return null;
    }

    public ItemResponseDto getCallList() {
        return null;
    }

    public Item postCall(String query, UserRequestDto requestDto) {
        return null;
    }

    public ItemResponseDto exchangeCall(String token, UserRequestDto requestDto) {
        return null;
    }
}