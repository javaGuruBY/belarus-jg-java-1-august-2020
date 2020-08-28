package by.stankeich.artemiy.learn.booklibrary.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Book {
    private String id;
    private String name;
    private String author;
    private int pagesCount;
}
