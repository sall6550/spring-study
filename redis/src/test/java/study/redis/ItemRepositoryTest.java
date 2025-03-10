package study.redis;

    import org.junit.jupiter.api.*;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.test.context.SpringBootTest;
    import org.springframework.test.annotation.Rollback;
    import org.springframework.transaction.annotation.Transactional;

    import static org.junit.jupiter.api.Assertions.*;

    @SpringBootTest
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class ItemRepositoryTest {

        @Autowired
        private ItemRepository itemRepository;

        @Test
        @Order(1)
        @Rollback(false)
        public void createTest() {
            Item item = Item.builder()
                    .id(1L)
                    .name("keyboard")
                    .description("Mechanical Keyboard Expensive 😢")
                    .build();
            itemRepository.save(item);
        }

        @Test
        @Order(2)
        public void readOneTest() {
            Item item = itemRepository.findById(1L)
                    .orElseThrow();
            System.out.println(item.getDescription());
        }

        @Test
        @Order(3)
        @Rollback(false)
        public void updateTest() {
            Item item = itemRepository.findById(1L)
                    .orElseThrow();
            item.setDescription("On Sale!!!");
            itemRepository.save(item);

            item = itemRepository.findById(1L)
                    .orElseThrow();
            System.out.println(item.getDescription());
        }

        @Test
        @Order(4)
        @Rollback(false)
        public void deleteTest() {
            itemRepository.deleteById(1L);
        }
    }