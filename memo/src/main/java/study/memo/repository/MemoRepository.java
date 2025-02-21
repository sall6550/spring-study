package study.memo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.memo.entity.Memo;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    List<Memo> findAllByContentsContainsOrderByModifiedAtDesc(String keyword);
}