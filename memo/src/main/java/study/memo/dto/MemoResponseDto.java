package study.memo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import study.memo.entity.Memo;

@Getter
@Builder
@AllArgsConstructor
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;

    public static MemoResponseDto from(Memo memo) {
        return MemoResponseDto.builder()
                .id(memo.getId())
                .username(memo.getUsername())
                .contents(memo.getContents())
                .build();
    }
}

