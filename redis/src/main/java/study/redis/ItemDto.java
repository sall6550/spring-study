package study.redis;

import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private String name;
    private String description;
    private Integer price;
}